package com.example.yourtaxi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
    }

    public void toMap(View view) {
        Intent i = new Intent(SignInActivity.this, MapsActivity.class);
        startActivity(i);
    }

    public void toSU(View view) {
        Intent i = new Intent(SignInActivity.this, SignUpActivity.class);
        startActivity(i);
    }

    public void goToWeb(View view) {
        goToUrl("http://google.com");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}