package com.example.hw2m3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.top,MainFragment.class,null).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.bottom,SecondFragment.class,null).commit();

    }
}