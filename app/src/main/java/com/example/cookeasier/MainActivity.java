package com.example.cookeasier;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.cookeasier.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button breakfastButton, soupButton, dinnerButton;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        breakfastButton = (Button) findViewById(R.id.breakfastButton);
        breakfastButton.setOnClickListener(v -> openBreakfastOptions());

        soupButton = (Button) findViewById(R.id.soupButton);
        soupButton.setOnClickListener(v -> openSoupOptions());

        dinnerButton = (Button) findViewById(R.id.dinnerButton);
        dinnerButton.setOnClickListener(v -> openDinnerOptions());
    }
    public void openBreakfastOptions() {
        Intent intent = new Intent(this, breakfastOptions.class);
        startActivity(intent);

    }
    public void openSoupOptions() {
        Intent intent = new Intent(this, soupOptions.class);
        startActivity(intent);

    }

    public void openDinnerOptions() {
        Intent intent = new Intent(this, dinnerOptions.class);
        startActivity(intent);

    }

}