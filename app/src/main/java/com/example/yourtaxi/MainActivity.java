package com.example.yourtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toSignIn (View view) {
        Intent tsi = new Intent (MainActivity.this, SignInActivity.class);
                startActivity(tsi);
    }
}