package com.example.tawaqapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class hiwar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiwar);
        TextView textView =(TextView)findViewById(R.id.textView11);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void backToVolunteerWork(View V){

        Intent i = new Intent(this,volunteerWork.class);
        startActivity(i);
        finish();
    }

    public void backToMenu(View V){

        Intent i = new Intent(this, theMenu.class);
        startActivity(i);
        finish();
    }
}