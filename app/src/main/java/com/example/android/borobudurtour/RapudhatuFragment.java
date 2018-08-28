package com.example.android.borobudurtour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RapudhatuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate a View in HistoryFragment() that refers to content_item.xml
        View rootView =  inflater.inflate(R.layout.content_item, container, false);

        // Create a new ArrayList object that takes a custom class named Item
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getString(R.string.rapudhatu_section), getString(R.string.rapudhatu_section_content)));

        // Create a custom ArrayAdapter object called ItemAdapter
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        // Create a ListView that refers to content_item.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Inflate the ListView based on the content of custom ArrayAdapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
