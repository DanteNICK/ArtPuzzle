package com.example.artpuzzle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Game extends Activity implements AdapterView.OnItemSelectedListener {

	ImageAdapter mAdapter;
   
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.game);
		GridView grid = (GridView)findViewById(R.id.list);
		
		mAdapter = new ImageAdapter(getApplicationContext());
		grid.setAdapter(mAdapter);
		grid.setOnItemSelectedListener(this);
		
		super.onCreate(savedInstanceState);
	}

	public void onItemSelected(AdapterView<?> parent, View view, int pos,
			long id) {
		// TODO Auto-generated method stub
	 mAdapter.setItem(pos);
		
	}
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}
