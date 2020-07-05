package com.madics3102.animalfeeds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    public void openregistration(View view) {
        Intent regIntent = new Intent(this,Registration.class);
        startActivity(regIntent);
    }
}
