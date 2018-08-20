package com.example.android.borobudurtour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class HistoryFragmentPagerAdapter extends FragmentPagerAdapter{
    public HistoryFragmentPagerAdapter(FragmentManager fm){super(fm);}

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

    // There will be 6 fragments
    @Override
    public int getCount() {
        return 6;
    }
}
