package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gym9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym9);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b9ii = (Button) findViewById(R.id.b9ii);
        b9ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9.this,gym9_ii.class);
                startActivity(intent);
            }
        });
        Button b9iii = (Button) findViewById(R.id.b9iii);
        b9iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9.this,gym9_iii.class);
                startActivity(intent);
            }
        });
        Button b9i = (Button) findViewById(R.id.b9i);
        b9i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9.this, BasicRestrainInfo.class);
                startActivity(intent);
            }
        });

    }
}
