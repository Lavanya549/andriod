package com.example.galleryadapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery simpleGallery;
    CustomizedGalleryAdapter customGalleryAdapter;
    ImageView selectedImageView;

    int[] images = {
            R.drawable.android, R.drawable.apple, R.drawable.dragon,
            R.drawable.python, R.drawable.javascript, R.drawable.java,
            R.drawable.python
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleGallery = (Gallery) findViewById(R.id.languagesGallery);
        selectedImageView = (ImageView) findViewById(R.id.imageView);

        customGalleryAdapter = new CustomizedGalleryAdapter(getApplicationContext(), images);
        simpleGallery.setAdapter(customGalleryAdapter);

        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedImageView.setImageResource(images[position]);
            }
        });
    }
}
