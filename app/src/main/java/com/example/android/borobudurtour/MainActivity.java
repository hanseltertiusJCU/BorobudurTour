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

        TextView accomodation = (TextView) findViewById(R.id.accommodation);

        TextView contact = (TextView) findViewById(R.id.contact);
    }


}
