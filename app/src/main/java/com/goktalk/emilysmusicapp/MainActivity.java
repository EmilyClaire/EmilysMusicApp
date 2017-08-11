package com.goktalk.emilysmusicapp;

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

        //Setting up the now playing text view to handle click events

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        //Setting up the now library text view to handle click events

        TextView library = (TextView) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });

        //Setting up the now library text view to handle click events

        TextView donate = (TextView) findViewById(R.id.donate);
        donate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent donateIntent = new Intent(MainActivity.this, DonateActivity.class);

                // Start the new activity
                startActivity(donateIntent);
            }
        });

    }
}
