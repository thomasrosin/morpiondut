package com.uvhc.laapad;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.uvhc.apad.R;

public class ModeleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_modele);

	}

	public void doNothing(View view) {

	}

	public void goNext(View view) {

	}

	public void goBack(View view) {
		finish();
	}

}
