package com.joss.animal_haven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.joss.perl_drawer.R;

public class chicken extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);

        WebView web4 = (WebView) findViewById(R.id.web4);
        web4.loadUrl("file:///android_asset/chicken.html");
    }
}
