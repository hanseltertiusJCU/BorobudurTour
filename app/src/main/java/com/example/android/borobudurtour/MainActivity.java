package com.example.android.borobudurtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView history = (TextView) findViewById(R.id.history);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyIntent);
            }
        });

        TextView gallery = (TextView) findViewById(R.id.gallery);

        TextView ways = (TextView) findViewById(R.id.ways);

        ways.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent waysIntent = new Intent(MainActivity.this, WaysActivity.class);
                startActivity(waysIntent);
            }
        });

        TextView accommodation = (TextView) findViewById(R.id.accommodation);

        accommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accommodationIntent = new Intent(MainActivity.this, AccommodationActivity.class);
                startActivity(accommodationIntent);
            }
        });

        TextView contact = (TextView) findViewById(R.id.contact);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(contactIntent);
            }
        });
    }


}
