package com.example.android.borobudurtour;

public class Item {
    private String mStringItemTitle;
    private String mStringItemContent;
    private int mImageResource = NO_IMAGE;
    // make a variable to determine whether the views are visible or not
    private static final int NO_IMAGE = -1;

    // Constructor for taking two Strings in TextView
    public Item(String stringItemTitle, String stringItemContent){
        mStringItemTitle = stringItemTitle;
        mStringItemContent = stringItemContent;
    }

    // Constructor for taking an ImageView
    public Item(int imageResource){
        mImageResource = imageResource;
    }

    public String getmStringItemTitle() {
        return mStringItemTitle;
    }

    public String getmStringItemContent() {
        return mStringItemContent;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public boolean hasItemTitle(){return mStringItemTitle != null;}

    public boolean hasItemContent(){return mStringItemContent != null;}

    public boolean hasImageResource(){return mImageResource != NO_IMAGE;}
}
