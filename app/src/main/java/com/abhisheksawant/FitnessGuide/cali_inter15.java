package com.abhisheksawant.FitnessGuide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class cali_inter15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cali_inter15);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b15i = (Button) findViewById(R.id.b15i);
        b15i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,cali_inter_intro.class);
                startActivity(intent);
            }
        });
        Button b15ii = (Button) findViewById(R.id.b15ii);
        b15ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,hanging_core.class);
                startActivity(intent);
            }
        });
        Button b15iii = (Button) findViewById(R.id.b15iii);
        b15iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,Lsit.class);
                startActivity(intent);
            }
        });
        Button b15iv = (Button) findViewById(R.id.b15iv);
        b15iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,dragon_flag.class);
                startActivity(intent);
            }
        });
        Button b15v = (Button) findViewById(R.id.b15v);
        b15v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,muscle_up.class);
                startActivity(intent);
            }
        });
        Button b15vi = (Button) findViewById(R.id.b15vi);
        b15vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,ring_exercises.class);
                startActivity(intent);
            }
        });
        Button b15vii = (Button) findViewById(R.id.b15vii);
        b15vii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,elbow_lever.class);
                startActivity(intent);
            }
        });
        Button b15viii = (Button) findViewById(R.id.b15viii);
        b15viii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,handstand.class);
                startActivity(intent);
            }
        });
        Button b15ix = (Button) findViewById(R.id.b15ix);
        b15ix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,pistol_squats.class);
                startActivity(intent);
            }
        });
        Button b15x = (Button) findViewById(R.id.b15x);
        b15x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,shrimp_squats.class);
                startActivity(intent);
            }
        });
        Button b15xi = (Button) findViewById(R.id.b15xi);
        b15xi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_inter15.this,nordic_curl.class);
                startActivity(intent);
            }
        });

    }
}
