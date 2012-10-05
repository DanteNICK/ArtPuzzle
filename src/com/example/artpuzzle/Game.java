package com.example.artpuzzle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;

public class Game extends Activity implements  OnItemClickListener {

	ImageAdapter mAdapter;
   
	public GridView grid;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.game);
		 grid = (GridView)findViewById(R.id.list);
		
		mAdapter = new ImageAdapter(getApplicationContext());
		grid.setAdapter(mAdapter);
		grid.setOnItemClickListener(this);
		
		super.onCreate(savedInstanceState);
	}
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		 
		mAdapter.setItem(arg2);
	        
	        mAdapter.notifyDataSetChanged();
		
		
	}
	
	
	
	

	
}
