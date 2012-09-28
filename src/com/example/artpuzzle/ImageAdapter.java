package com.example.artpuzzle;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class ImageAdapter extends BaseAdapter {
	public int [][] ImageArray;
	private Context mContext;
	private static Integer[][] mImages;
	int ColCount =0;
	int RowCount = 0;
	
	
	
	
	public ImageAdapter(int [][] array)
	{
		super();
		this.RowCount = array.length;
		this.ColCount = array[0].length;
		this.ImageArray = array;
		
		for(int i=0;i<RowCount;i++)
		{
			for(int j=0; j<ColCount;j++)
			{
				this.mImages[i][j] =R.drawable.v;
			}
		}
		
	}
	
	
	

	public int getCount() {
		// TODO Auto-generated method stub
		return ImageArray.length;
	}

	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView view = null;
		if(convertView == null)
		{
			view = new ImageView(mContext);
			view.setLayoutParams(new GridView.LayoutParams(50,50));
			view.setScaleType(ImageView.ScaleType.CENTER_CROP);
			view.setPadding(2, 2, 2, 2);
			
		}
		return view;

	}
}
