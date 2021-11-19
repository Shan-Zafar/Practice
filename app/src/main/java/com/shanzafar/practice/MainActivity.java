package com.shanzafar.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.shanzafar.practice.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void PlaceOrder(View view)
    {
        Intent intent = new Intent(this, OrderActivity.class);
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        EditText et3 = findViewById(R.id.et3);
        String msg = "Order for " + et1.getText().toString() + " , "
                + et2.getText().toString() + " & "
                + et3.getText().toString() + "has been successfully placed";
        intent.putExtra(MSG, msg);
        startActivity(intent);
    }
}