package com.example.tawaqapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class onlineWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_work);
        TextView textView =(TextView)findViewById(R.id.textView11);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void backToCourses(View V){

        Intent i = new Intent(this,courses.class);
        startActivity(i);
        finish();
    }

    public void backToMenu(View V){

        Intent i = new Intent(this, theMenu.class);
        startActivity(i);
        finish();
    }
}