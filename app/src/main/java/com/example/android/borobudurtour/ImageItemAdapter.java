package com.example.android.borobudurtour;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageItemAdapter extends ArrayAdapter<Item> {
    // Need a listView to proceed

    public ImageItemAdapter(Activity context, ArrayList<Item> items){
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        // Check if existing view is being reused or recycled. Otherwise, inflate the view
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.image_item_list, parent, false);
        }

        // Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the height of the screen of the device
        DisplayMetrics metrics = new DisplayMetrics();
        ((Activity)getContext()).getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int height = metrics.heightPixels;

        // Refer the item ImageView based on item_list.xml
        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.content_image);
        // Check if the item has image resource
        if(currentItem.hasImageResource()){
            itemImageView.setImageResource(currentItem.getmImageResource());
            // Set the minimum height of ImageView based on the device
            itemImageView.setMinimumHeight(height);
            itemImageView.setVisibility(View.VISIBLE);
        } else {
            // Set the item image visibility to gone, which takes no space
            // of the item image and makes it invisible
            itemImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

    // Make the item not to be clickable
    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}
