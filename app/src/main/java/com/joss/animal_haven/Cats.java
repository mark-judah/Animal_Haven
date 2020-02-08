package com.joss.animal_haven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.joss.perl_drawer.R;

public class Cats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats);

        WebView web1 = (WebView) findViewById(R.id.web1);
        web1.loadUrl("file:///android_asset/cats.html");


    }
}
