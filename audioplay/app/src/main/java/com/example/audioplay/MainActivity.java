package com.example.audioplay;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    Button play, pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize MediaPlayer and Buttons
        mp = MediaPlayer.create(MainActivity.this, R.raw.song);
        play = findViewById(R.id.playId);
        pause = findViewById(R.id.pauseId);

        // Set OnClickListener for play button
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start(); // Start playing audio
                Toast.makeText(MainActivity.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            }
        });

        // Set OnClickListener for pause button
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause(); // Pause audio
                pause.setEnabled(false); // Disable pause button
                mp.release(); // Release resources used by MediaPlayer
                Toast.makeText(getApplicationContext(), "Pausing Audio", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
