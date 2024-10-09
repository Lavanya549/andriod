package com.example.galleryadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustomizedGalleryAdapter extends BaseAdapter {

    private Context context;
    private int[] images;

    public CustomizedGalleryAdapter(Context c, int[] images) {
        context = c;
        this.images = images;
    }

    // Returns the number of images
    @Override
    public int getCount() {
        return images.length;
    }

    // Returns the item at the specified position
    @Override
    public Object getItem(int position) {
        return images[position];
    }

    // Returns the item ID for the specified position
    @Override
    public long getItemId(int position) {
        return position;
    }

    // Returns an ImageView view for each item referenced by the adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Create an ImageView programmatically
        ImageView imageView = new ImageView(context);

        // Set the image resource for the ImageView
        imageView.setImageResource(images[position]);

        // Set layout parameters for the ImageView
        imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));

        // Set scale type for the ImageView
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        return imageView;
    }
}
