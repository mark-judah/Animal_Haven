package com.joss.animal_haven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.joss.perl_drawer.R;

public class rabbits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbits);

        WebView web5 = (WebView) findViewById(R.id.web5);
        web5.loadUrl("file:///android_asset/rabbits.html");
    }
}
