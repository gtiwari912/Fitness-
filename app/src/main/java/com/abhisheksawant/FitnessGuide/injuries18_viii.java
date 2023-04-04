package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class injuries18_viii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injuries18_viii);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b18viiia = (Button) findViewById(R.id.b18viiia);
        b18viiia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,wrist_injuries_intro.class);
                startActivity(intent);
            }
        });
        Button b18viiib = (Button) findViewById(R.id.b18viiib);
        b18viiib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,distal_radius_fracture.class);
                startActivity(intent);
            }
        });
        Button b18viiic = (Button) findViewById(R.id.b18viiic);
        b18viiic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,wrist_tendinitis.class);
                startActivity(intent);
            }
        });
        Button b18viiid = (Button) findViewById(R.id.b18viiid);
        b18viiid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,wrist_sprain.class);
                startActivity(intent);
            }
        });
        Button b18viiie = (Button) findViewById(R.id.b18viiie);
        b18viiie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,dislocated_wrist.class);
                startActivity(intent);
            }
        });
        Button b18viiif = (Button) findViewById(R.id.b18viiif);
        b18viiif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,wrist_arthritis.class);
                startActivity(intent);
            }
        });
        Button b18viiig = (Button) findViewById(R.id.b18viiig);
        b18viiig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,ganglion_cyst.class);
                startActivity(intent);
            }
        });
        Button b18viiih = (Button) findViewById(R.id.b18viiih);
        b18viiih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,carpal_boss.class);
                startActivity(intent);
            }
        });
        Button b18viii_i = (Button) findViewById(R.id.b18viii_i);
        b18viii_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,carpal_tunne.class);
                startActivity(intent);
            }
        });
        Button b18viiij = (Button) findViewById(R.id.b18viiij);
        b18viiij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_viii.this,cubital_tunnel.class);
                startActivity(intent);
            }
        });

    }
}
