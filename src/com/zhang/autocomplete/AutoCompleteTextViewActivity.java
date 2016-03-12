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
        
        //ϵͳĬ��Ϊǰ׺ƥ��
        //android.widget.ArrayAdapter<String> adapter=new android.widget.ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,s);
        
        //ͨ���޸�androidԴ��ʵ����׺�ͺ�׺ƥ��
        com.zhang.autocomplete.ArrayAdapter<String> adapter=new com.zhang.autocomplete.ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,s);
       
        //Specifies the minimum number of characters the user has to type in the edit box before the drop down list is shown.
        //setThreshold�Ĳ���Ҳ����˵Ҫʵ��ƥ����Ӧ�������С�ַ���������Ϊ1��ָֻҪ����һ���ַ��㿪ʼƥ�䣬Ϊ2��������2���ַ��ſ�ʼƥ�䣬�Դ�����
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }
}