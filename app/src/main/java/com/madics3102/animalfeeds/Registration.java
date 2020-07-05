package com.madics3102.animalfeeds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void openLogin(View view) {
        Intent loginIntent = new Intent(this,Login.class);
        startActivity(loginIntent);
    }
}
