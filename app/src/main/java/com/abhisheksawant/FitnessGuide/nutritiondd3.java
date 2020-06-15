package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nutritiondd3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritiondd3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b3v = (Button) findViewById(R.id.b3v);
        b3v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutritiondd3_v.class);
                startActivity(intent);
            }
        });
        Button b3vi = (Button) findViewById(R.id.b3vi);
        b3vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutritiondd3_vi.class);
                startActivity(intent);
            }
        });
        Button b3vii = (Button) findViewById(R.id.b3vii);
        b3vii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutritiondd3_vii.class);
                startActivity(intent);
            }
        });
        Button b3x = (Button) findViewById(R.id.b3x);
        b3x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutritiondd3_x.class);
                startActivity(intent);
            }
        });
        Button b3xii = (Button) findViewById(R.id.b3xii);
        b3xii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutritiondd3_xii.class);
                startActivity(intent);
            }
        });
        Button b3i = (Button) findViewById(R.id.b3i);
        b3i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutridd_intro3i.class);
                startActivity(intent);
            }
        });
        Button b3ii = (Button) findViewById(R.id.b3ii);
        b3ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutridd_carbs3ii.class);
                startActivity(intent);
            }
        });
        Button b3iii = (Button) findViewById(R.id.b3iii);
        b3iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutridd_proteins3iii.class);
                startActivity(intent);
            }
        });
        Button b3iv = (Button) findViewById(R.id.b3iv);
        b3iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutridd_fats3iv.class);
                startActivity(intent);
            }
        });
        Button b3viii = (Button) findViewById(R.id.b3viii);
        b3viii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutridd_fatloss3viii.class);
                startActivity(intent);
            }
        });
        Button b3ix = (Button) findViewById(R.id.b3ix);
        b3ix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutridd_musclegain3ix.class);
                startActivity(intent);
            }
        });
        Button b3xi = (Button) findViewById(R.id.b3xi);
        b3xi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritiondd3.this,nutridd_sugar.class);
                startActivity(intent);
            }
        });

    }
}
