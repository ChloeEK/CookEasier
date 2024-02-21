package com.example.cookeasier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.cookeasier.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class breakfastOptions extends AppCompatActivity {
    private Button hashButton, panButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_options);

        hashButton = findViewById(R.id.hashButton);
        hashButton.setOnClickListener(v -> openHash());

        panButton = findViewById(R.id.panButton);
        panButton.setOnClickListener(v -> openPan());
    }

    public void openHash() {
        Intent intent = new Intent(this, breakfastHash.class);
        startActivity(intent);

    }
    public void openPan() {
        Intent intent = new Intent(this, pancakes.class);
        startActivity(intent);

    }


}