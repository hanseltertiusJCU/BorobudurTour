package com.example.android.borobudurtour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    // Need a listView to proceed

    public ItemAdapter(Activity context, ArrayList<Item> items){
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        // Check if existing view is being reused or recycled. Otherwise, inflate the view
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }

        // Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        // Refer the title of the item TextView based on item_list.xml
        TextView titleitemTextView = (TextView) listItemView.findViewById(R.id.text_title);
        // Check if the item has item title
        if(currentItem.hasItemTitle()){
            titleitemTextView.setText(currentItem.getmStringItemTitle());
            titleitemTextView.setVisibility(View.VISIBLE);
        } else {
            // Set the item title visibility to gone, which takes no space
            // of the item title and makes it invisible
            titleitemTextView.setVisibility(View.GONE);
        }

        // Refer the content of the item TextView based on item_list.xml
        TextView contentitemTextView = (TextView) listItemView.findViewById(R.id.text_content);
        // Check if the item has item content
        if(currentItem.hasItemContent()){
            contentitemTextView.setText(currentItem.getmStringItemContent());
            contentitemTextView.setVisibility(View.VISIBLE);
        } else{
            // Set the item content visibility to gone, which takes no space
            // of the item content and makes it invisible
            contentitemTextView.setVisibility(View.GONE);
        }

        // Refer the item ImageView based on item_list.xml
        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.content_image);
        // Check if the item has image resource
        if(currentItem.hasImageResource()){
            itemImageView.setImageResource(currentItem.getmImageResource());
            itemImageView.setVisibility(View.VISIBLE);
        } else {
            // Set the item image visibility to gone, which takes no space
            // of the item image and makes it invisible
            itemImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

}
