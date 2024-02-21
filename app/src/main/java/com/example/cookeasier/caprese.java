package com.example.cookeasier;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class caprese extends AppCompatActivity {
    private Button sauce, mixin, cut, finalCap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caprese);

        sauce = findViewById(R.id.sauce);
        mixin = findViewById(R.id.mixin);
        cut = findViewById(R.id.cut);
        finalCap = findViewById(R.id.finalCap);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sauce);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.mixin);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.cut);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.caprese);

        sauce.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        mixin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        finalCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

    }
}