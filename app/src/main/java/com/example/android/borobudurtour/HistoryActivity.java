package com.example.android.borobudurtour;

import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TableLayout;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Find the ViewPager id to be able to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.historyViewPager);

        // Create an adapter to be attached to ViewPager
        HistoryFragmentPagerAdapter historyAdapter = new HistoryFragmentPagerAdapter(getSupportFragmentManager());

        // Set the ViewPager
        viewPager.setAdapter(historyAdapter);

        // Create the TabLayout
        TabLayout historyTabLayout = (TabLayout) findViewById(R.id.historyTab);

        // Set the TabLayout onto the ViewPager
        historyTabLayout.setupWithViewPager(viewPager);
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
