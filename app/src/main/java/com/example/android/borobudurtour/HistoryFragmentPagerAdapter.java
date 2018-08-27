package com.example.android.borobudurtour;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class HistoryFragmentPagerAdapter extends FragmentPagerAdapter{

    private String[] historyTabTitles = new String[] {"History", "Zone 1", "Zone 2", "Zone 3", "Reliefs", "Temple Corridors"};

    public HistoryFragmentPagerAdapter(FragmentManager fm){super(fm);}

    // Get the fragment based on the position
    @Override
    public Fragment getItem(int position) {

        Fragment fragmentView;

        switch (position){
            case 0:
                fragmentView = new HistoryFragment();
                break;
            case 1:
                fragmentView = new KamadhatuFragment();
                break;
            case 2:
                fragmentView = new RapudhatuFragment();
                break;
            case 3:
                fragmentView = new ArupadhatuFragment();
                break;
            case 4:
                fragmentView = new ReliefsFragment();
                break;
            case 5:
                fragmentView = new TempleCorridorsFragment();
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
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return historyTabTitles[position];
    }
}
