package com.example.dipendra.portfolioapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.popularMovies).setOnClickListener(this);
        findViewById(R.id.stockHawk).setOnClickListener(this);
        findViewById(R.id.buildItBigger).setOnClickListener(this);
        findViewById(R.id.appMaterial).setOnClickListener(this);
        findViewById(R.id.goUbiquitous).setOnClickListener(this);
        findViewById(R.id.capstone).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.popularMovies:
                Toast.makeText(MainActivity.this,"This Button will launch my Popular Movies App!",Toast.LENGTH_LONG).show();
                break;
            case R.id.stockHawk:
                Toast.makeText(MainActivity.this, "This Button will launch my Stock Hawk App!",Toast.LENGTH_LONG).show();
                break;
            case R.id.buildItBigger:
                Toast.makeText(MainActivity.this, "This Button will launch my Build It Bigger App!",Toast.LENGTH_LONG).show();
                break;
            case R.id.appMaterial:
                Toast.makeText(MainActivity.this, "This Button will launch my Make Your App Material App!",Toast.LENGTH_LONG).show();
                break;
            case R.id.goUbiquitous:
                Toast.makeText(MainActivity.this, "This Button will launch my Go Ubiquitous App!",Toast.LENGTH_LONG).show();
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this, "This Button will launch my Capstone App!",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
