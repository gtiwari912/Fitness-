package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nutritiondd3_xii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritiondd3_xii);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b3xiia = (Button) findViewById(R.id.b3xiia);
        b3xiia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth1.class);
                startActivity(intent);
            }
        });
        Button b3xiib = (Button) findViewById(R.id.b3xiib);
        b3xiib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth2.class);
                startActivity(intent);
            }
        });
        Button b3xiic = (Button) findViewById(R.id.b3xiic);
        b3xiic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth3.class);
                startActivity(intent);
            }
        });
        Button b3xiid = (Button) findViewById(R.id.b3xiid);
        b3xiid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth4.class);
                startActivity(intent);
            }
        });
        Button b3xiie = (Button) findViewById(R.id.b3xiie);
        b3xiie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth5.class);
                startActivity(intent);
            }
        });
        Button b3xiif = (Button) findViewById(R.id.b3xiif);
        b3xiif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth6.class);
                startActivity(intent);
            }
        });
        Button b3xiig = (Button) findViewById(R.id.b3xiig);
        b3xiig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth7.class);
                startActivity(intent);
            }
        });
        Button b3xiih = (Button) findViewById(R.id.b3xiih);
        b3xiih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth8.class);
                startActivity(intent);
            }
        });
        Button b3xii_i = (Button) findViewById(R.id.b3xii_i);
        b3xii_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth9.class);
                startActivity(intent);
            }
        });
        Button b3xiij = (Button) findViewById(R.id.b3xiij);
        b3xiij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth10.class);
                startActivity(intent);
            }
        });
        Button b3xiik = (Button) findViewById(R.id.b3xiik);
        b3xiik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth11.class);
                startActivity(intent);
            }
        });
        Button b3xiil = (Button) findViewById(R.id.b3xiil);
        b3xiil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3_xii.this,nutridd_myth12.class);
                startActivity(intent);
            }
        });

    }
}
