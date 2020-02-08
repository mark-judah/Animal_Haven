package com.joss.animal_haven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.joss.perl_drawer.R;

public class shelters extends AppCompatActivity {
    String[] shelters = {"Kenya Society for the Protection and Care of Animals(KSPCA)", "Dog Pound", "Kabete Sick Animal Shelter", "The David Sheldrick Wildlife Trust", "Nairobi Animal Orphanage"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelters);
    }
}
