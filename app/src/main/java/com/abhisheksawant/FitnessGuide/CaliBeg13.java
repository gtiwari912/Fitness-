package com.abhisheksawant.FitnessGuide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CaliBeg13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cali_beg13);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b13vi = (Button) findViewById(R.id.b13vi);
        b13vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliBeg13.this,cali_beg13_vi.class);
                startActivity(intent);
            }
        });
        Button b13i = (Button) findViewById(R.id.b13i);
        b13i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliBeg13.this,cali_beg_intro.class);
                startActivity(intent);
            }
        });
        Button b13ii = (Button) findViewById(R.id.b13ii);
        b13ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliBeg13.this,pushup.class);
                startActivity(intent);
            }
        });
        Button b13iii = (Button) findViewById(R.id.b13iii);
        b13iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliBeg13.this,dips.class);
                startActivity(intent);
            }
        });
        Button b13iv = (Button) findViewById(R.id.b13iv);
        b13iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliBeg13.this,pullups.class);
                startActivity(intent);
            }
        });
        Button b13v = (Button) findViewById(R.id.b13v);
        b13v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliBeg13.this,lyingcore.class);
                startActivity(intent);
            }
        });

    }
}
