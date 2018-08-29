package com.example.android.borobudurtour;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccommodationFragmentPagerAdapter extends FragmentPagerAdapter {


    private String[] accommodationTabTitles = new String[] {"One time entrance", "Ticket Packages", "Multiple Days"};

    public AccommodationFragmentPagerAdapter(FragmentManager fm){super(fm);}

    // Get the fragment based on the position
    @Override
    public Fragment getItem(int position) {

        Fragment fragmentView;

        switch (position){
            case 0:
                fragmentView = new OneTimeTicketFragment();
                break;
            case 1:
                fragmentView = new TicketPackagesFragment();
                break;
            case 2:
                fragmentView = new MultipleDaysTicketFragment();
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
        return 3;
    }

    // Get page title for TabLayout
    @Override
    public CharSequence getPageTitle(int position) {
        return accommodationTabTitles[position];
    }

}
