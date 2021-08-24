package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initFragments();
        initListeners();

    }

    private void initViews() {
        button = findViewById(R.id.btnChange);
    }

    private void initListeners() {
        button.setOnClickListener(v ->{
            getSupportFragmentManager().beginTransaction().replace(R.id.containerFirst, new ThirdFragment()).commit();
        });
    }

    private void initFragments() {
        getSupportFragmentManager().beginTransaction().add(R.id.containerFirst,new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerSecond, new SecondFragment()).commit();
    }
}