package com.example.cookeasier;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.cookeasier.ui.dashboard.DashboardFragment;

public class breakfastHash extends AppCompatActivity {

    private Button bacon;
    private Button pepper;
    private Button milk;
    private Button cheese;
    private Button finalHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_hash);

        bacon = findViewById(R.id.baconButton);
        pepper = findViewById(R.id.pepperButton);
        milk = findViewById(R.id.milkButton);
        cheese = findViewById(R.id.cheeseButton);
        finalHash = findViewById(R.id.finalButton);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bacon);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.pepper);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.milk);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.cheese);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.hash);

        bacon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        pepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        cheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        finalHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

    }

}