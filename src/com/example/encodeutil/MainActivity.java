package com.example.encodeutil;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView textView;
	private EditText editText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView) this.findViewById(R.id.textview);
		editText = (EditText) this.findViewById(R.id.edittext);
	}

	public void now(View v) {
		textView.setText("" + (new Date().getTime()));
	}

	public void md5(View v) {
		String text = editText.getText().toString();
		if (text != null && text.length() > 0) {
			textView.setText(MD5.getMD5(text));
		}
	}

	public void base64_EN(View v) {
		String text = editText.getText().toString();
		if (text != null && text.length() > 0) {
			textView.setText(Base64.encodeToString(text.getBytes(), Base64.DEFAULT));
		}
	}

	public void base64_DE(View v) {
		String text = editText.getText().toString();
		if (text != null && text.length() > 0) {
			textView.setText(new String(Base64.decode(text.getBytes(), Base64.DEFAULT)));
		}
	}

	@SuppressWarnings("deprecation")
	public void URLEncode(View v) {
		String text = editText.getText().toString();
		if (text != null && text.length() > 0) {
			textView.setText(URLEncoder.encode(text));
		}
	}

	@SuppressWarnings("deprecation")
	public void URLDecode(View v) {
		String text = editText.getText().toString();
		if (text != null && text.length() > 0) {
			textView.setText(URLDecoder.decode(text));
		}
	}
}
