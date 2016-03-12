package com.zhang.autocomplete;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends Activity {
    /** Called when the activity is first created. */
	private AutoCompleteTextView actv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String[] s=new String[]{"aaaa","abcd","bbac","dbca"};
        
        actv=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        
        //系统默认为前缀匹配
        //android.widget.ArrayAdapter<String> adapter=new android.widget.ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,s);
        
        //通过修改android源码实现中缀和后缀匹配
        com.zhang.autocomplete.ArrayAdapter<String> adapter=new com.zhang.autocomplete.ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,s);
       
        //Specifies the minimum number of characters the user has to type in the edit box before the drop down list is shown.
        //setThreshold的参数也就是说要实现匹配所应输入的最小字符数，这里为1，指只要输入一个字符便开始匹配，为2则需输入2个字符才开始匹配，以此类推
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }
}