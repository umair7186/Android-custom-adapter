package com.example.adapterapp;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterClass extends ArrayAdapter<String> {
	private Context context;
	private String[] str;
	private String[] str1;
	
	public AdapterClass(Context context, int resource, String[] objects,String[] object) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		this.context=context;
		this.str=objects;
		this.str1=object;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return str.length;
	}
	@Override
	public String getItem(int position) {
		// TODO Auto-generated method stub
		return super.getItem(position);
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view = LayoutInflater.from(context).inflate(R.layout.row_img, null, false);
		ImageView imageView= (ImageView) view.findViewById(R.id.imageview1);
		TextView textView = (TextView) view.findViewById(R.id.textview1);
		TextView textView1 = (TextView) view.findViewById(R.id.textview2);
		
		switch (position) {
		case 0:
			imageView.setImageResource(R.drawable.ic_action3);
		case 1:
			imageView.setImageResource(R.drawable.ic_action);
			
			break;
		case 2:
			imageView.setImageResource(R.drawable.ic_action4);
			break;
		case 3:
			imageView.setImageResource(R.drawable.ic_action2);
			break;
		case 4:
			imageView.setImageResource(R.drawable.ic_action3);
			break;
			
		case 5:
			imageView.setImageResource(R.drawable.ic_action);
			
			break;
		case 6:
			imageView.setImageResource(R.drawable.ic_action2);
			break;
		case 7:
			imageView.setImageResource(R.drawable.ic_action4);
			break;
		case 8:
			imageView.setImageResource(R.drawable.ic_action);
			break;
			
		case 9:
			imageView.setImageResource(R.drawable.ic_action3);
			
			break;
		case 10:
			imageView.setImageResource(R.drawable.ic_action4);
			break;
		case 11:
			imageView.setImageResource(R.drawable.ic_action);
			break;
		case 12:
			imageView.setImageResource(R.drawable.ic_action2);
			break;
			
		case 13:
			imageView.setImageResource(R.drawable.ic_action3);
			
			break;
		case 14:
			imageView.setImageResource(R.drawable.ic_action);
			break;
		case 15:
			imageView.setImageResource(R.drawable.ic_action2);
			break;
		case 16:
			imageView.setImageResource(R.drawable.ic_action4);
			break;
		case 17:
			imageView.setImageResource(R.drawable.ic_action);
			break;
		case 18:
			imageView.setImageResource(R.drawable.ic_action3);
			break;
		case 19:
			imageView.setImageResource(R.drawable.ic_action2);
			break;
		case 20:
			imageView.setImageResource(R.drawable.ic_action4);
			break;
		default:
			imageView.setImageResource(R.drawable.ic_action);
			break;
		}
		
		/*return super.getView(position, convertView, parent);*/
		textView.setText(str[position]);
		textView1.setText(str1[position]);
		
		return view;
	}

}
