package com.example.android.borobudurtour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class WaysFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] waysTabTitles = new String[] {"Overview", "Bus from Yogyakarta", "Private vehicle from Yogyakarta", "Bus from Semarang"};

    public WaysFragmentPagerAdapter(FragmentManager fm){super(fm);}

    // Get the fragment based on the position
    @Override
    public Fragment getItem(int position) {

        Fragment fragmentView;

        switch (position){
            case 0:
                fragmentView = new OverviewFragment();
                break;
            case 1:
                fragmentView = new YogyaBusFragment();
                break;
            case 2:
                fragmentView = new YogyaPrivateFragment();
                break;
            case 3:
                fragmentView = new SemarangBusFragment();
                break;
            default:
                fragmentView = null;
                break;
        }
        return fragmentView;
    }

    // Get the number of fragments
    @Override
    public int getCount() {
        return 4;
    }

    // Get page title for TabLayout
    @Override
    public CharSequence getPageTitle(int position) {
        return waysTabTitles[position];
    }
}
