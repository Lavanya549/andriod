package com.example.webviewapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.wv);
        String customHtml = "<html><body><h1>Welcome to SRIT</h1>" +
                "<h2>Welcome to SRIT</h2><h3>Welcome to SRIT</h3>" +
                "<p>It's a Static Web HTML Content.</p>" +
                "</body></html>";
        wv.loadData(customHtml, "text/html", "UTF-8");
    }
}
