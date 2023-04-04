package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nutritiondd3_vii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritiondd3_vii);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b3viia = (Button) findViewById(R.id.b3viia);
        b3viia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vii.this,nutridd_vitamin_intro3viia.class);
                startActivity(intent);
            }
        });
        Button b3viib = (Button) findViewById(R.id.b3viib);
        b3viib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vii.this,nutridd_vitaminA3viib.class);
                startActivity(intent);
            }
        });
        Button b3viic = (Button) findViewById(R.id.b3viic);
        b3viic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vii.this,nutridd_vitaminB3viic.class);
                startActivity(intent);
            }
        });
        Button b3viid = (Button) findViewById(R.id.b3viid);
        b3viid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vii.this,nutridd_vitaminC3viid.class);
                startActivity(intent);
            }
        });
        Button b3viie = (Button) findViewById(R.id.b3viie);
        b3viie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vii.this,nutridd_vitaminD3viie.class);
                startActivity(intent);
            }
        });
        Button b3viif = (Button) findViewById(R.id.b3viif);
        b3viif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vii.this,nutridd_vitaminE3viif.class);
                startActivity(intent);
            }
        });
        Button b3viig = (Button) findViewById(R.id.b3viig);
        b3viig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vii.this,nutridd_vitaminK3viig.class);
                startActivity(intent);
            }
        });

    }
}
