package com.joss.animal_haven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.joss.perl_drawer.R;

public class cows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cows);

        WebView web6 = (WebView) findViewById(R.id.web6);
        web6.loadUrl("file:///android_asset/cows.html");
    }
}
