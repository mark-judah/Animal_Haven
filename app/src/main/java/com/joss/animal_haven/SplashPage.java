package com.joss.animal_haven;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.joss.perl_drawer.R;

public class SplashPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //this intent will tun for 5 seconds
                Intent x = new Intent(SplashPage.this, MainActivity.class);
                startActivity(x);
                finish();//kill the intent
            }
        }, 5000);
    }
}

