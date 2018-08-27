package com.example.android.borobudurtour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class KamadhatuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_kamadhatu, container, false);

        TextView textOne = (TextView) rootView.findViewById(R.id.word_one);
        textOne.setText(R.string.kamadhatu_section);

        TextView textTwo = (TextView) rootView.findViewById(R.id.word_two);
        textTwo.setText(R.string.kamadhatu_section_content);

        return rootView;
    }

}
