package com.example.yourtaxi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
    }

    public void toMap(View view) {
        Intent i = new Intent(SignUpActivity.this, MapsActivity.class);
        startActivity(i);
    }
}