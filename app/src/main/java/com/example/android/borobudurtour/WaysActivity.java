package com.example.android.borobudurtour;

import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class WaysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ways);

        // Find the ViewPager id to be able to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.waysViewPager);

        // Create an adapter to be attached to ViewPager
        WaysFragmentPagerAdapter waysAdapter = new WaysFragmentPagerAdapter(getSupportFragmentManager());

        // Set the ViewPager
        viewPager.setAdapter(waysAdapter);

        // Create the TabLayout
        TabLayout waysTabLayout = (TabLayout) findViewById(R.id.waysTab);

        // Set the TabLayout onto the ViewPager
        waysTabLayout.setupWithViewPager(viewPager);
    }

    /**
     * To navigate up to parent activity
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
