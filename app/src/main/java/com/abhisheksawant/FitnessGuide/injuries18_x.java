package com.abhisheksawant.FitnessGuide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class injuries18_x extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injuries18_x);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b18xa = (Button) findViewById(R.id.b18xa);
        b18xa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(injuries18_x.this,heel_pain_intro.class);
                startActivity(intent);
            }
        });
        Button b18xb = (Button) findViewById(R.id.b18xb);
        b18xb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(injuries18_x.this,plantar_fasciitis.class);
                startActivity(intent);
            }
        });
        Button b18xc = (Button) findViewById(R.id.b18xc);
        b18xc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(injuries18_x.this,tarsal_tunnel.class);
                startActivity(intent);
            }
        });
        Button b18xd = (Button) findViewById(R.id.b18xd);
        b18xd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(injuries18_x.this, AchillesTendinitis.class);
                startActivity(intent);
            }
        });
        Button b18xe = (Button) findViewById(R.id.b18xe);
        b18xe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(injuries18_x.this, CalcaneusStressFracture.class);
                startActivity(intent);
            }
        });
        Button b18xf = (Button) findViewById(R.id.b18xf);
        b18xf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(injuries18_x.this, BruisedHeel.class);
                startActivity(intent);
            }
        });
    }
}
