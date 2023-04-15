package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class WorkoutPredictionQuery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_prediction_query);
        Button getWorkoutPrediction = findViewById(R.id.btGetWorkoutPrediction);
        RadioButton rdLoss = findViewById(R.id.rdloss);
        RadioButton rdGain = findViewById(R.id.rdgain);

        getWorkoutPrediction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rdLoss.isChecked()){
                    startActivity(new Intent(WorkoutPredictionQuery.this, WtLoss.class));
                }
                else
                    startActivity(new Intent(WorkoutPredictionQuery.this, WtGain.class));
            }
        });
    }
}