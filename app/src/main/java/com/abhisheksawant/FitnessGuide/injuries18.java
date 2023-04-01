package com.abhisheksawant.FitnessGuide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class injuries18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injuries18);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b18iv = (Button) findViewById(R.id.b18iv);
        b18iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,injuries18_iv.class);
                startActivity(intent);
            }
        });
        Button b18vii = (Button) findViewById(R.id.b18vii);
        b18vii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,injuries18_vii.class);
                startActivity(intent);
            }
        });
        Button b18viii = (Button) findViewById(R.id.b18viii);
        b18viii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,injuries18_viii.class);
                startActivity(intent);
            }
        });
        Button b18i = (Button) findViewById(R.id.b18i);
        b18i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,injuries_intro.class);
                startActivity(intent);
            }
        });
        Button b18ii = (Button) findViewById(R.id.b18ii);
        b18ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,muscle_strain.class);
                startActivity(intent);
            }
        });
        Button b18iii = (Button) findViewById(R.id.b18iii);
        b18iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this, AnkleSprain.class);
                startActivity(intent);
            }
        });
        Button b18v = (Button) findViewById(R.id.b18v);
        b18v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,knee_injury.class);
                startActivity(intent);
            }
        });
        Button b18vi = (Button) findViewById(R.id.b18vi);
        b18vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,shin_splints.class);
                startActivity(intent);
            }
        });
        Button b18ix = (Button) findViewById(R.id.b18ix);
        b18ix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,lower_back_injury.class);
                startActivity(intent);
            }
        });
        Button b18x = (Button) findViewById(R.id.b18x);
        b18x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(injuries18.this,injuries18_x.class);
                startActivity(intent);
            }
        });


    }
}
