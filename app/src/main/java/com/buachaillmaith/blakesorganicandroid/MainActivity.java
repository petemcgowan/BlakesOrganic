package com.buachaillmaith.blakesorganicandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // configuring our window to full screen
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_main);

        // calling handler to run a task for specific time interval
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // creating a new intent
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                // starting a new activity.
                startActivity(i);
                // finishing our current activity.
                finish();
            }
        }, 2000);
    }
}
