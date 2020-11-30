package com.example.tawaqapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class trainingPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_places);
    }

    public void backToTrainingTracks(View V){

        Intent i = new Intent(this,trainingTracks.class);
        startActivity(i);
        finish();
    }

    public void backToMenu(View V){

        Intent i = new Intent(this,theMenu.class);
        startActivity(i);
        finish();
    }

    public void goToRajhi(View V){

        Intent i = new Intent(this,rajhi.class);
        startActivity(i);
        finish();
    }

    public void goToAramco(View V){

        Intent i = new Intent(this,aramco.class);
        startActivity(i);
        finish();
    }

    public void goToGedaa(View V){

        Intent i = new Intent(this,gedaa.class);
        startActivity(i);
        finish();
    }

    public void goToElm(View V){

        Intent i = new Intent(this,elm.class);
        startActivity(i);
        finish();
    }

    public void goToSehh(View V){

        Intent i = new Intent(this,sehh.class);
        startActivity(i);
        finish();
    }

    public void goToSoliman(View V){

        Intent i = new Intent(this,soliman.class);
        startActivity(i);
        finish();
    }

    public void goToJohnson(View V){

        Intent i = new Intent(this,johnson.class);
        startActivity(i);
        finish();
    }

    public void goToMoassh(View V){

        Intent i = new Intent(this,moassh.class);
        startActivity(i);
        finish();
    }

}