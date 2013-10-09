package jp.narit.opengltest;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
	
	MyGLView myGLView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		myGLView = new MyGLView(this);
		setContentView(myGLView);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		myGLView.onResume();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		myGLView.onPause();
	}
}
