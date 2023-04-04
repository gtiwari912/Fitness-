package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class etiquettes11 extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etiquettes11);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b11i = (Button) findViewById(R.id.b11i);
        b11i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(etiquettes11.this,etiquettes_intro.class);
                startActivity(intent);
            }
        });
        Button b11ii = (Button) findViewById(R.id.b11ii);
        b11ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(etiquettes11.this,common_mistakes.class);
                startActivity(intent);
            }
        });
        Button b11iii = (Button) findViewById(R.id.b11iii);
        b11iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(etiquettes11.this,less_common_mistakes.class);
                startActivity(intent);
            }
        });

    }
}
