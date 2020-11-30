package com.example.tawaqapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void backToMenu(View V){
        Intent i = new Intent(this,theMenu.class);
        startActivity(i);
        finish();
    }

    public void TT(View V){
        Intent i = new Intent(this,aramco2.class);
        startActivity(i);
        finish();
    }
    public void TO(View V){
        Intent i = new Intent(this,geraphic2.class);
        startActivity(i);
        finish();
    }
    public void CC(View V){
        Intent i = new Intent(this,Ah2.class);
        startActivity(i);
        finish();
    }



}