package com.example.videoplay;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize VideoView
        VideoView videoView = findViewById(R.id.vdVw);

        // Set MediaController to enable play, pause, forward, etc options
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        // Location of Media File
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videos);

        // Starting VideoView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
