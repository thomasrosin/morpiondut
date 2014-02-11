package com.uvhc.laapad;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;

import com.uvhc.apad.R;
import com.uvhc.laapad.crouton.Crouton;
import com.uvhc.laapad.crouton.Style;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Crouton.makeText(this, "Bonjour, je suis un crouton LOL",
				Style.CONFIRM, R.id.CroutonView).show();

		new RequestTask().execute("http://172.20.10.6:8080/ServTest/plop");

		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);

	}

	public void doNothing(View view) {

	}

	public void goBack(View view) {
		finish();
	}

	public void goNext(View view) {

	}

	class RequestTask extends AsyncTask<String, String, String> {

		@Override
		protected String doInBackground(String... uri) {
			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(uri[0]);
			List<NameValuePair> pairs = new ArrayList<NameValuePair>();
			pairs.add(new BasicNameValuePair("key1", "value1"));
			pairs.add(new BasicNameValuePair("key2", "value2"));

			HttpResponse response;
			String responseStr = null;
			try {
				post.setEntity(new UrlEncodedFormEntity(pairs));
				response = client.execute(post);
				responseStr = EntityUtils.toString(response.getEntity());
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return responseStr;
		}

		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			System.out.println(result);
		}
	}

}
