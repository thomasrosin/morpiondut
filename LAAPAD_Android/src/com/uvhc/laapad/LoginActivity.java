package com.uvhc.laapad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uvhc.apad.R;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

	}

	public void doNothing(View view) {

	}

	public void goInscription(View view) {
		Intent intent = new Intent(this, InscriptionActivity.class);

		startActivity(intent);
	}

	public void goLogin(View view) {

	}

	public void goNext(View view) {

	}

}
