package com.example.android.borobudurtour;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Find the ViewPager id to be able to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.historyViewPager);

        // Create an adapter to be attached to ViewPager
        HistoryFragmentPagerAdapter adapter = new HistoryFragmentPagerAdapter(getSupportFragmentManager());

        // Set the ViewPager
        viewPager.setAdapter(adapter);
    }
}
