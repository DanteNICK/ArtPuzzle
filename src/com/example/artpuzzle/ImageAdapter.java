package com.example.artpuzzle;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	private static  Integer []  mImages =
		{
		
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright,
		android.R.drawable.divider_horizontal_bright

		};

	public ImageAdapter(Context context)
	{
		mContext=context;
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return mImages.length;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mImages[position];
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return mImages[position];
	}
	public void setItem(int position)
	{
		mImages[position] = android.R.drawable.star_on;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView view;
		if(convertView == null)
		{
			view = new ImageView(mContext);
			view.setLayoutParams(new GridView.LayoutParams(20,20));
			view.setScaleType(ImageView.ScaleType.CENTER_CROP);
			view.setPadding(2, 2, 2, 2);
		}
		else
		
			view = (ImageView)convertView;
		
		view.setImageResource(mImages[position]);
		return view;
	}

}

