package com.yu.againlistview;

import java.util.ArrayList;

import android.app.Activity;
import android.content.ClipData.Item;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;



public class MainActivity extends Activity {

	ListView listView;
	ArrayList<String>buttonName;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView=(ListView) findViewById(R.id.listView1);
        buttonName=new ArrayList<String>();
        
        buttonName.add("Bangladesh");
        buttonName.add("India");
        buttonName.add("Usa");
        buttonName.add("Uae");
        buttonName.add("Iran");
        buttonName.add("Uk");
        buttonName.add("katar");
        buttonName.add("Finland");
        buttonName.add("Vutan");
        buttonName.add("Dubai");
        buttonName.add("Iraq");
        buttonName.add("Japan");
        
        CustomAdapter adapter=new CustomAdapter(buttonName,this);
        listView.setAdapter(adapter);
        
        
        listView.setOnItemClickListener(new OnItemClickListener() {
        	
        	@Override
        	public void onItemClick(AdapterView<?> arg0, View arg1, int position,
        			long arg3) {
        		
        		Toast.makeText(getApplicationContext(),buttonName.get(position),Toast.LENGTH_LONG).show();
        		
        	}
		});

    }



}
