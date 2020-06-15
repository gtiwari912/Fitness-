package com.abhisheksawant.FitnessGuide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class pillars2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pillars2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b2i = (Button) findViewById(R.id.b2i);
        b2i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pillars2.this,pillars_nutrition2i.class);
                startActivity(intent);
            }
        });
        Button b2ii = (Button) findViewById(R.id.b2ii);
        b2ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pillars2.this,pillars_phy_activity2ii.class);
                startActivity(intent);
            }
        });
        Button b2iii = (Button) findViewById(R.id.b2iii);
        b2iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pillars2.this,pillars_rest2iii.class);
                startActivity(intent);
            }
        });

    }
}
