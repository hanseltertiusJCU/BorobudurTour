package com.example.android.borobudurtour;

public class Items {
    private String mStringItem;
    private int mImageResource;

    // Constructor for taking a String
    public Items(String stringItem){
        mStringItem = stringItem;
    }

    // Constructor for taking an ImageView
    public Items(int imageResource){
        mImageResource = imageResource;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmStringItem() {
        return mStringItem;
    }
}
