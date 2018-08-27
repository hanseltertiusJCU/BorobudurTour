package com.example.android.borobudurtour;

public class Items {
    private String mStringItemTitle;
    private String mStringItemContent;
    private int mImageResource;
    // make a variable to determine whether the views are visible or not

    // Constructor for taking two Strings in TextView
    public Items(String stringItemTitle, String stringItemContent){
        mStringItemTitle = stringItemTitle;
        mStringItemContent = stringItemContent;
    }

    // Constructor for taking two Strings in TextView and an ImageView
    public Items(String stringItemTitle, String stringItemContent, int imageResource){
        mStringItemTitle = stringItemTitle;
        mStringItemContent = stringItemContent;
        mImageResource = imageResource;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmStringItemTitle() {
        return mStringItemTitle;
    }

    public String getmStringItemContent() {
        return mStringItemContent;
    }
}
