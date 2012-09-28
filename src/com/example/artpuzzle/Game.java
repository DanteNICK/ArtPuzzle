package com.example.artpuzzle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class Game extends Activity {

	ImageAdapter mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.game);
		GridView grid = (GridView)findViewById(R.id.list);
		super.onCreate(savedInstanceState);
	}
}
