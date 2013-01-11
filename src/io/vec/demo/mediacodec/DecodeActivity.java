package io.vec.demo.mediacodec;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

public class DecodeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SurfaceView sv = new SurfaceView(this);
		setContentView(sv);
	}
}