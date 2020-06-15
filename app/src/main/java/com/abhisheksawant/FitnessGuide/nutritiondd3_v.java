package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nutritiondd3_v extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritiondd3_v);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b3va = (Button) findViewById(R.id.b3va);
        b3va.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_v.this,nutridd_fibre3va.class);
                startActivity(intent);
            }
        });
        Button b3vb = (Button) findViewById(R.id.b3vb);
        b3vb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_v.this,nutridd_water3vb.class);
                startActivity(intent);
            }
        });

    }
}
