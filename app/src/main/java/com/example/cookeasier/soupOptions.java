package com.example.cookeasier;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class soupOptions extends AppCompatActivity {

    private Button cap;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup_options);

        cap = findViewById(R.id.capreseButton);
        cap.setOnClickListener(v -> openCap());
    }

    public void openCap() {
        Intent intent = new Intent(this, caprese.class);
        startActivity(intent);

    }

}