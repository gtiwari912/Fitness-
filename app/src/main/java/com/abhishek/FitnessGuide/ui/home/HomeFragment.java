package com.abhishek.FitnessGuide.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.abhishek.FitnessGuide.R;
import com.abhishek.FitnessGuide.CaliAdv16;
import com.abhishek.FitnessGuide.CaliBeg13;
import com.abhishek.FitnessGuide.cali_inter15;
import com.abhishek.FitnessGuide.cali_wisdom;
import com.abhishek.FitnessGuide.Cardio;
import com.abhishek.FitnessGuide.etiquettes11;
import com.abhishek.FitnessGuide.freestyle17;
import com.abhishek.FitnessGuide.goalsetting;
import com.abhishek.FitnessGuide.gym9;
import com.abhishek.FitnessGuide.GymWisdom;
import com.abhishek.FitnessGuide.imp_anatomy_fundaments;
import com.abhishek.FitnessGuide.injuries18;
import com.abhishek.FitnessGuide.intro1;
import com.abhishek.FitnessGuide.intro_res_training;
import com.abhishek.FitnessGuide.nutritiondd3;
import com.abhishek.FitnessGuide.pillars2;
import com.abhishek.FitnessGuide.strengthplateau;
import com.abhishek.FitnessGuide.warmup_cooldown;

public class HomeFragment extends Fragment {




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        Button b1 = (Button) view.findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), intro1.class);
                startActivity(intent);
            }
        });
        Button b2 = (Button) view.findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), pillars2.class);
                startActivity(intent);
            }
        });
        Button b3 = (Button) view.findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), nutritiondd3.class);
                startActivity(intent);
            }
        });
        Button b9 = (Button) view.findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), gym9.class);
                startActivity(intent);
            }
        });
        Button b11 = (Button) view.findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), etiquettes11.class);
                startActivity(intent);
            }
        });
        Button b13 = (Button) view.findViewById(R.id.b13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CaliBeg13.class);
                startActivity(intent);
            }
        });
        Button b15 = (Button) view.findViewById(R.id.b15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), cali_inter15.class);
                startActivity(intent);
            }
        });
        Button b16 = (Button) view.findViewById(R.id.b16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CaliAdv16.class);
                startActivity(intent);
            }
        });
        Button b17 = (Button) view.findViewById(R.id.b17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), freestyle17.class);
                startActivity(intent);
            }
        });
        Button b18 = (Button) view.findViewById(R.id.b18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), injuries18.class);
                startActivity(intent);
            }
        });
        Button b4 = (Button) view.findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), imp_anatomy_fundaments.class);
                startActivity(intent);
            }
        });
        Button b5 = (Button) view.findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), warmup_cooldown.class);
                startActivity(intent);
            }
        });
        Button b6 = (Button) view.findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), goalsetting.class);
                startActivity(intent);
            }
        });
        Button b7 = (Button) view.findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cardio.class);
                startActivity(intent);
            }
        });
        Button b8 = (Button) view.findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), intro_res_training.class);
                startActivity(intent);
            }
        });
        Button b10 = (Button) view.findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), strengthplateau.class);
                startActivity(intent);
            }
        });
        Button b12 = (Button) view.findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GymWisdom.class);
                startActivity(intent);
            }
        });
        Button b14 = (Button) view.findViewById(R.id.b14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), cali_wisdom.class);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Home");

}
}
