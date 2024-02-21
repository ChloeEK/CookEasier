package com.example.cookeasier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class dinnerOptions extends AppCompatActivity {

    private Button rig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_options);

        rig = findViewById(R.id.rigButton);
        rig.setOnClickListener(v -> openRig());
    }

    public void openRig() {
        Intent intent = new Intent(this, rigatoni.class);
        startActivity(intent);

    }

}