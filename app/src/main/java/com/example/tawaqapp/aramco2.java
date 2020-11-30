package com.example.tawaqapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class aramco2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aramco2);
        TextView textView =(TextView)findViewById(R.id.textView20);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void backToTrainingPlaces(View V){

        Intent i = new Intent(this,home.class);
        startActivity(i);
        finish();
    }

}