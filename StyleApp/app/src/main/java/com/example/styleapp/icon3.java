package com.example.styleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class icon3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon3);
        getSupportActionBar().setTitle("Instagram");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}