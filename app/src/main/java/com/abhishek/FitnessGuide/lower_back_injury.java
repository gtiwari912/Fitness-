package com.abhishek.FitnessGuide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class lower_back_injury extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_back_injury);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView t2 = (TextView) findViewById(R.id.lower_back_injury2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}