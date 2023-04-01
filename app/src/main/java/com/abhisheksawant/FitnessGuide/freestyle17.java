package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class freestyle17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freestyle17);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b17i = (Button) findViewById(R.id.b17i);
        b17i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this,freestyle_intro.class);
                startActivity(intent);
            }
        });
        Button b17ii = (Button) findViewById(R.id.b17ii);
        b17ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this,pullover.class);
                startActivity(intent);
            }
        });
        Button b17iii = (Button) findViewById(R.id.b17iii);
        b17iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this, BarKipUp.class);
                startActivity(intent);
            }
        });
        Button b17iv = (Button) findViewById(R.id.b17iv);
        b17iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this, BarJump.class);
                startActivity(intent);
            }
        });
        Button b17v = (Button) findViewById(R.id.b17v);
        b17v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this, BarSpin.class);
                startActivity(intent);
            }
        });
        Button b17vi = (Button) findViewById(R.id.b17vi);
        b17vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this,shrimp_flip.class);
                startActivity(intent);
            }
        });
        Button b17vii = (Button) findViewById(R.id.b17vii);
        b17vii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this,swing360.class);
                startActivity(intent);
            }
        });
        Button b17viii = (Button) findViewById(R.id.b17viii);
        b17viii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this,swing540.class);
                startActivity(intent);
            }
        });
        Button b17ix = (Button) findViewById(R.id.b17ix);
        b17ix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this,swing720.class);
                startActivity(intent);
            }
        });
        Button b17x = (Button) findViewById(R.id.b17x);
        b17x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(freestyle17.this,giant_swing.class);
                startActivity(intent);
            }
        });

    }
}
