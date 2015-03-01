package com.example.main;

import com.example.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;

public class CheckActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.check);
	}
	@Override
	public boolean onKeyDown(int keyCode,KeyEvent event)
	{
		super.onKeyDown(keyCode, event);
		if(keyCode == 92)
		{
			Log.i("test", "onKeyDown");		
			return true;
		}
		return false;
	}

	@Override
	public boolean onKeyUp(int keyCode,KeyEvent event)
	{
		super.onKeyUp(keyCode, event);
		if(keyCode == 92)
		{
			Log.i("test", "onKeyUp");		
			return true;
		}
		return false;
	}

}
