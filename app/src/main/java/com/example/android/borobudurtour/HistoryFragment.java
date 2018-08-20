package com.example.android.borobudurtour;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HistoryFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.fragment_history, container, false);

        TextView textOne = (TextView) rootView.findViewById(R.id.word_one);
        textOne.setText(R.string.history_section);

        TextView textTwo = (TextView) rootView.findViewById(R.id.word_two);
        textTwo.setText(R.string.history_section_content);

        return rootView;
    }
}
