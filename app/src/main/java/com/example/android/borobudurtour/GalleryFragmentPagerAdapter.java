package com.example.android.borobudurtour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class GalleryFragmentPagerAdapter extends FragmentPagerAdapter {

    public GalleryFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    // Get the fragment based on the position
    @Override
    public Fragment getItem(int position) {

        Fragment fragmentView;

        switch (position){
            case 0:
                fragmentView = new ImageOneFragment();
                break;
            case 1:
                fragmentView = new ImageTwoFragment();
                break;
            case 2:
                fragmentView = new ImageThreeFragment();
                break;
            case 3:
                fragmentView = new ImageFourFragment();
                break;
            case 4:
                fragmentView = new ImageFiveFragment();
                break;
            case 5:
                fragmentView = new ImageSixFragment();
                break;
            case 6:
                fragmentView = new ImageSevenFragment();
                break;
            default:
                fragmentView = null;
                break;
        }
        return fragmentView;
    }

    @Override
    public int getCount() {
        return 7;
    }
}
