package com.yu.againlistview;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;




public class CustomAdapter extends BaseAdapter {

	Activity contex;
	ArrayList<String> countryName;
	
	
	public CustomAdapter(ArrayList<String> country, Activity contex)
	{
		this.contex=contex;
		this.countryName=country;
		
		
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return countryName.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		convertView=LayoutInflater.from(contex).inflate(R.layout.row,parent,false);
		TextView countryTextView=(TextView) convertView.findViewById(R.id.TextviewId1);
		
		
		String name =countryName.get(position);
		countryTextView.setText(name);
		
		
		if (name.contains("Bangladesh")) {
			
		}
		if (name.contains("India")) {
			
		}
		if (name.contains("Usa")) {
					
				}
		if (name.contains("Uae")) {
			
		}
		if (name.contains("Iran")) {
			
		}
		if (name.contains("Uk")) {
			
		}
		if (name.contains("katar")) {
			
		}
		if (name.contains("Finland")) {
			
		}
		if (name.contains("Vutan")) {
					
				}
		if (name.contains("Dubai")) {
			
		}
		if (name.contains("Iraq")) {
			
		}
		if (name.contains("Japan")) {
			
		}
		
		else {
			
		}
		
		return convertView;
		
		
	}

}
