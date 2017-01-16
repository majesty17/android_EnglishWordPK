package com.majesty.wordpk.aty;

import com.majesty.wordpk.R;
import com.majesty.wordpk.R.layout;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WordtestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wordtest);
		WebView mWebView=((WebView)findViewById(R.id.webView_test));
		if (Build.VERSION.SDK_INT >= 19) {
	        mWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
	    }
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.loadUrl("https://www.shanbay.com/vocabtest/welcome/");
	}
}
