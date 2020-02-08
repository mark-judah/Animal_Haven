package com.joss.animal_haven;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.joss.perl_drawer.R;

public class gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Button b5 = (Button) findViewById(R.id.button5);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b4 = (Button) findViewById(R.id.button4);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(gallery.this, Cats.class);
                startActivity(x);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(gallery.this, Dogs.class);
                startActivity(d);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(gallery.this, chicken.class);
                startActivity(c);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(gallery.this, rabbits.class);
                startActivity(c);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(gallery.this, cows.class);
                startActivity(c);
            }
        });


    }
}
