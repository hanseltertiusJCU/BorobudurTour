package com.example.android.borobudurtour;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_item);

        // Create a new ArrayList object that takes a custom class named Item
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getString(R.string.call_center_section), getString(R.string.call_center_section_content)));
        items.add(new Item(getString(R.string.email_one_section), getString(R.string.email_one_section_content)));
        items.add(new Item(getString(R.string.email_two_section), getString(R.string.email_two_section_content)));

        // Create a custom ArrayAdapter object called ItemAdapter
        ItemAdapter adapter = new ItemAdapter(this, items);

        // Create a ListView that refers to content_item.xml
        ListView listView = (ListView) findViewById(R.id.list);

        // Inflate the ListView based on the content of custom ArrayAdapter
        listView.setAdapter(adapter);
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
