package com.example.tawaqapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class volunteerWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_work);
    }

    private void backToTrainingTracks(View V){

        Intent i = new Intent(this,trainingTracks.class);
        startActivity(i);
        finish();
    }

    public void backToMenu(View V){

        Intent i = new Intent(this,theMenu.class);
        startActivity(i);
        finish();
    }

    public void goToTheHilal(View V){

        Intent i = new Intent(this,Ah.class);
        startActivity(i);
        finish();
    }

    public void goToTtweaSa(View V){

        Intent i = new Intent(this,ttweaSa.class);
        startActivity(i);
        finish();
    }

    public void goTotkatf1(View V){

        Intent i = new Intent(this,tkatf1.class);
        startActivity(i);
        finish();
    }

    public void goTohiwar(View V){

        Intent i = new Intent(this,hiwar.class);
        startActivity(i);
        finish();
    }

    public void goToeraq(View V){

        Intent i = new Intent(this,eraq.class);
        startActivity(i);
        finish();
    }

    public void goTomotwiron(View V){

        Intent i = new Intent(this,motwiron.class);
        startActivity(i);
        finish();
    }

    public void goTotnmih(View V){

        Intent i = new Intent(this,tnmih.class);
        startActivity(i);
        finish();
    }

    public void goTorodah(View V){

        Intent i = new Intent(this,rodah.class);
        startActivity(i);
        finish();
    }
}