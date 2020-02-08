package com.joss.animal_haven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.joss.perl_drawer.R;

public class Dogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);

        WebView web3 = (WebView) findViewById(R.id.web3);
        web3.loadUrl("file:///android_asset/dogs.html");
    }
}
