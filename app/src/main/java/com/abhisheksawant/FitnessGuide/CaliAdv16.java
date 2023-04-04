package com.abhisheksawant.FitnessGuide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CaliAdv16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cali_adv16);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b16i = (Button) findViewById(R.id.b16i);
        b16i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this, CaliAdvIntro.class);
                startActivity(intent);
            }
        });
        Button b16ii = (Button) findViewById(R.id.b16ii);
        b16ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,hspu.class);
                startActivity(intent);
            }
        });
        Button b16iii = (Button) findViewById(R.id.b16iii);
        b16iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,hspu90.class);
                startActivity(intent);
            }
        });
        Button b16iv = (Button) findViewById(R.id.b16iv);
        b16iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,oah.class);
                startActivity(intent);
            }
        });
        Button b16v = (Button) findViewById(R.id.b16v);
        b16v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,imp_dip.class);
                startActivity(intent);
            }
        });
        Button b16vi = (Button) findViewById(R.id.b16vi);
        b16vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,shoulder_flag.class);
                startActivity(intent);
            }
        });
        Button b16vii = (Button) findViewById(R.id.b16vii);
        b16vii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,human_flag.class);
                startActivity(intent);
            }
        });
        Button b16viii = (Button) findViewById(R.id.b16viii);
        b16viii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this, BackLever.class);
                startActivity(intent);
            }
        });
        Button b16ix = (Button) findViewById(R.id.b16ix);
        b16ix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,front_lever.class);
                startActivity(intent);
            }
        });
        Button b16x = (Button) findViewById(R.id.b16x);
        b16x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,vsit.class);
                startActivity(intent);
            }
        });
        Button b16xi = (Button) findViewById(R.id.b16xi);
        b16xi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,manna.class);
                startActivity(intent);
            }
        });
        Button b16xii = (Button) findViewById(R.id.b16xii);
        b16xii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,oac.class);
                startActivity(intent);
            }
        });
        Button b16xiii = (Button) findViewById(R.id.b16xiii);
        b16xiii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,oap.class);
                startActivity(intent);
            }
        });
        Button b16xiv = (Button) findViewById(R.id.b16xiv);
        b16xiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,hefesto.class);
                startActivity(intent);
            }
        });
        Button b16xv = (Button) findViewById(R.id.b16xv);
        b16xv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,entrada_de_angel.class);
                startActivity(intent);
            }
        });
        Button b16xvi = (Button) findViewById(R.id.b16xvi);
        b16xvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,planche.class);
                startActivity(intent);
            }
        });
        Button b16xvii = (Button) findViewById(R.id.b16xvii);
        b16xvii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,maltese.class);
                startActivity(intent);
            }
        });
        Button b16xviii = (Button) findViewById(R.id.b16xviii);
        b16xviii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,iron_cross.class);
                startActivity(intent);
            }
        });
        Button b16xix = (Button) findViewById(R.id.b16xix);
        b16xix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,inverted_cross.class);
                startActivity(intent);
            }
        });
        Button b16xx = (Button) findViewById(R.id.b16xx);
        b16xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaliAdv16.this,victorian_cross.class);
                startActivity(intent);
            }
        });

    }
}
