package com.shanzafar.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String msg = getIntent().getStringExtra(MainActivity.MSG);
        TextView textview = findViewById(R.id.ordertext);
        textview.setText(msg);

    }

}