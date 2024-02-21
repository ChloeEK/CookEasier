package com.example.cookeasier;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rigatoni extends AppCompatActivity {

    private Button mushGarlic, stock, cream, parsley, noodles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigatoni);

        mushGarlic = findViewById(R.id.mushGarlic);
        stock = findViewById(R.id.stock);
        cream = findViewById(R.id.cream);
        parsley = findViewById(R.id.parsley);
        noodles = findViewById(R.id.noodles);

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.stock);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.cream);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.parsley);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.noodles);

        stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        parsley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        noodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
    }
}