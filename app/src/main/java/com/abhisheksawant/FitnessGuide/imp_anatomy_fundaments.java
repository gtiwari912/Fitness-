package com.abhisheksawant.FitnessGuide;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class imp_anatomy_fundaments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp_anatomy_fundaments);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView t1 = (TextView)findViewById(R.id.anatomy1);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5 = (TextView)findViewById(R.id.anatomy5);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t6 = (TextView)findViewById(R.id.anatomy6);
        t6.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
