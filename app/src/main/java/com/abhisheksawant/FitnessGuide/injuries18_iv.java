package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class injuries18_iv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injuries18_iv);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b18iva = (Button) findViewById(R.id.b18iva);
        b18iva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_iv.this,shoulder_injuries_intro.class);
                startActivity(intent);
            }
        });
        Button b18ivb = (Button) findViewById(R.id.b18ivb);
        b18ivb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_iv.this,rotator_cuff_tear.class);
                startActivity(intent);
            }
        });
        Button b18ivc = (Button) findViewById(R.id.b18ivc);
        b18ivc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_iv.this,impingement.class);
                startActivity(intent);
            }
        });
        Button b18ivd = (Button) findViewById(R.id.b18ivd);
        b18ivd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_iv.this,dislocated_shoulder.class);
                startActivity(intent);
            }
        });
        Button b18ive = (Button) findViewById(R.id.b18ive);
        b18ive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_iv.this,slap_tear.class);
                startActivity(intent);
            }
        });
        Button b18ivf = (Button) findViewById(R.id.b18ivf);
        b18ivf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_iv.this,frozen_shoulder.class);
                startActivity(intent);
            }
        });
        Button b18ivg = (Button) findViewById(R.id.b18ivg);
        b18ivg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_iv.this,shoulder_osteoarthritis.class);
                startActivity(intent);
            }
        });

    }
}
