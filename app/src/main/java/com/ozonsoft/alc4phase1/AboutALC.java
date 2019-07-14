package com.ozonsoft.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    private WebView webDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        webDisplay = findViewById(R.id.about_WebView);
        webDisplay.setWebViewClient(new WebViewClient() {

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                //ignore ssl certificate errors, to avoid the webView showing a blank page if ssl errorS are encountered.
                handler.proceed();
            }
        });

        webDisplay.getSettings().setJavaScriptEnabled(true);
        webDisplay.loadUrl("https://andela.com/alc/");
    }
}
