package com.example.cookeasier;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pancakes extends AppCompatActivity {
    private Button dry, wet, mix, heat, finalPan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancakes);

        dry = findViewById(R.id.dry);
        wet = findViewById(R.id.wet);
        mix = findViewById(R.id.mix);
        heat = findViewById(R.id.heat);
        finalPan = findViewById(R.id.finalPan);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.dry);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.wet);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.mix);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.heat);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.finalpan);

        dry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        wet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        heat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        finalPan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
    }
}