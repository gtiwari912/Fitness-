package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nutritiondd3_vi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritiondd3_vi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b3via = (Button) findViewById(R.id.b3via);
        b3via.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_minerals_intro3via.class);
                startActivity(intent);
            }
        });
        Button b3vib = (Button) findViewById(R.id.b3vib);
        b3vib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_potassium3vib.class);
                startActivity(intent);
            }
        });
        Button b3vic = (Button) findViewById(R.id.b3vic);
        b3vic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_chloride3vic.class);
                startActivity(intent);
            }
        });
        Button b3vid = (Button) findViewById(R.id.b3vid);
        b3vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_sodium3vid.class);
                startActivity(intent);
            }
        });
        Button b3vie = (Button) findViewById(R.id.b3vie);
        b3vie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_calcium3vie.class);
                startActivity(intent);
            }
        });
        Button b3vif = (Button) findViewById(R.id.b3vif);
        b3vif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_phosphorus3vif.class);
                startActivity(intent);
            }
        });
        Button b3vig = (Button) findViewById(R.id.b3vig);
        b3vig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_magnesium3vig.class);
                startActivity(intent);
            }
        });
        Button b3vih = (Button) findViewById(R.id.b3vih);
        b3vih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_zinc3vih.class);
                startActivity(intent);
            }
        });
        Button b3vi_i = (Button) findViewById(R.id.b3vi_i);
        b3vi_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_iron3vi_i.class);
                startActivity(intent);
            }
        });
        Button b3vij = (Button) findViewById(R.id.b3vij);
        b3vij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_manganese3vij.class);
                startActivity(intent);
            }
        });
        Button b3vik = (Button) findViewById(R.id.b3vik);
        b3vik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_copper3vik.class);
                startActivity(intent);
            }
        });
        Button b3vil = (Button) findViewById(R.id.b3vil);
        b3vil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_iodine3vil.class);
                startActivity(intent);
            }
        });
        Button b3vim = (Button) findViewById(R.id.b3vim);
        b3vim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_selenium3vim.class);
                startActivity(intent);
            }
        });
        Button b3vin = (Button) findViewById(R.id.b3vin);
        b3vin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_vi.this,nutridd_molybdenum3vin.class);
                startActivity(intent);
            }
        });
    }
}
