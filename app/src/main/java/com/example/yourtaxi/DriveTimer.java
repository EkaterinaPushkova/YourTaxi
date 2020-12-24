package com.example.yourtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DriveTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive_timer);
    }
    public void arrived (View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Thank You!", Toast.LENGTH_SHORT);
        t.show();
    }
}