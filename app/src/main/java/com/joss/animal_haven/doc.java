package com.joss.animal_haven;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.joss.perl_drawer.R;

public class doc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);
        String[] shelters = {"Nairobi Veterinary Center", "St.Austin's Rd Veterinary Clinic", "Kabete Sick Animal Shelter", "Poseidon Veterinary Clinic", "The Andys Veterinary Clinic- Loresho", "Dr.Ghalay Surita"};

        ListView lv = (ListView) findViewById(R.id.shelters);
        ArrayAdapter<String> aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, shelters);

        lv.setAdapter(aa);//pass through adapter first- add adapter to list view
        //make the list listen


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent x = new Intent(doc.this, NaiVet.class);
                    startActivity(x);
                }

                if (position == 1) {
                    Intent y = new Intent(doc.this, VetAustin.class);
                    startActivity(y);
                }

                if (position == 3) {
                    Intent n = new Intent(doc.this, Kabete.class);
                    startActivity(n);
                }

                if (position == 4) {
                    Intent m = new Intent(doc.this, Poseidon.class);
                    startActivity(m);
                }

                if (position == 5) {
                    Intent b = new Intent(doc.this, Ghalay.class);
                    startActivity(b);
                }
            }
        });
    }
}





