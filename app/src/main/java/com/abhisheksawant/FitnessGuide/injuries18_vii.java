package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class injuries18_vii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injuries18_vii);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b18viia = (Button) findViewById(R.id.b18viia);
        b18viia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_vii.this,elbow_tendinitis_intro.class);
                startActivity(intent);
            }
        });
        Button b18viib = (Button) findViewById(R.id.b18viib);
        b18viib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_vii.this,tennis_elbow.class);
                startActivity(intent);
            }
        });
        Button b18viic = (Button) findViewById(R.id.b18viic);
        b18viic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18_vii.this,golfers_elbow.class);
                startActivity(intent);
            }
        });

    }
}
