package com.abhisheksawant.FitnessGuide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity{

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();
                if(id == R.id.about_us){
                    Intent intent = new Intent(MainActivity.this,about_us.class);
                    startActivity(intent);
                }
                else if(id == R.id.about_this_app){
                    Intent intent = new Intent(MainActivity.this,about_this_app.class);
                    startActivity(intent);
                }
                else if(id == R.id.rate_this_app){
                    Intent rateintent = new Intent(Intent.ACTION_VIEW);
                    rateintent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.abhisheksawant.FitnessGuide"));
                    startActivity(rateintent);
                }
                else if(id == R.id.follow_us){
                    Intent followintent = new Intent(Intent.ACTION_VIEW);
                    followintent.setData(Uri.parse("https://www.instagram.com/sawant807/"));
                    startActivity(followintent);
                }
                else if(id == R.id.share_this_app){
                    Intent shareintent = new Intent(Intent.ACTION_SEND);
                    shareintent.putExtra(Intent.EXTRA_TEXT,
                            "https://play.google.com/store/apps/details?id=com.abhisheksawant.FitnessGuide");
                    shareintent.setType("text/plain");
                    startActivity(Intent.createChooser(shareintent,"Share Via"));
                }
                else if(id == R.id.feedback){
                    String recipient = "abhishakesawant@gmail.com";
                    String subject = "Fitness Guide App Feedback";
                    String body = "Enter your feedback/suggestions/queries here...";

                    Intent feedback_intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("mailto:"+recipient+"?subject="+subject+"&body="+body));
                    startActivity(Intent.createChooser(feedback_intent,"Send Email Using..."));
                }

                DrawerLayout drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);

                return true;
            }
        });


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);




    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

}
