package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intro1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b1i = (Button) findViewById(R.id.b1i);
        b1i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1.this,intro1_i.class);
                startActivity(intent);
            }
        });
        Button b1ii = (Button) findViewById(R.id.b1ii);
        b1ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1.this,whyfitness1ii.class);
                startActivity(intent);
            }
        });
        Button b1iii = (Button) findViewById(R.id.b1iii);
        b1iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1.this,fitnessDemerits.class);
                startActivity(intent);
            }
        });

    }
}
