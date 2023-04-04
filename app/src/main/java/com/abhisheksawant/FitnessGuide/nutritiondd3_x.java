package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nutritiondd3_x extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritiondd3_x);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b3xa = (Button) findViewById(R.id.b3xa);
        b3xa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_x.this,nutridd_alcohol3xa.class);
                startActivity(intent);
            }
        });
        Button b3xb = (Button) findViewById(R.id.b3xb);
        b3xb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_x.this,nutridd_smoking.class);
                startActivity(intent);
            }
        });
        Button b3xc = (Button) findViewById(R.id.b3xc);
        b3xc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_x.this,nutridd_recdrugs.class);
                startActivity(intent);
            }
        });
        Button b3xd = (Button) findViewById(R.id.b3xd);
        b3xd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_x.this,nutridd_ped.class);
                startActivity(intent);
            }
        });


    }
}
