package com.example.tawaqapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class aramco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aramco);
        TextView textView =(TextView)findViewById(R.id.textView20);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void backToTrainingPlaces(View V){

        Intent i = new Intent(this,trainingPlaces.class);
        startActivity(i);
        finish();
    }


    public void pajToMain(View V){
        Intent i = new Intent(this, trainingPlaces.class);
        startActivity(i);
        finish();
    }
}