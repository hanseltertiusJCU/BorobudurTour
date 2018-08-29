package com.example.android.borobudurtour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AccommodationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);

        // Find the ViewPager id to be able to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.accommodationViewPager);

        // Create an adapter to be attached to ViewPager
        AccommodationFragmentPagerAdapter historyAdapter = new AccommodationFragmentPagerAdapter(getSupportFragmentManager());

        // Set the ViewPager
        viewPager.setAdapter(historyAdapter);

        // Create the TabLayout
        TabLayout historyTabLayout = (TabLayout) findViewById(R.id.accommodationTab);

        // Set the TabLayout onto the ViewPager
        historyTabLayout.setupWithViewPager(viewPager);
    }
}
