package com.clevertap.clevertapactionbutton;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.clevertap.android.sdk.CleverTapAPI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CleverTapAPI.setDebugLevel(CleverTapAPI.LogLevel.DEBUG);

        CleverTapAPI.createNotificationChannel(getApplicationContext(), "112233", "test", "testchannel", 2, true);

        CleverTapAPI.createNotificationChannel(getApplicationContext(), "123456", "123456", "Your Channel Description", 2, true);
// Creating a Notification Channel With Sound Support
//        CleverTapAPI.createNotificationChannel(getApplicationContext(), "got", "Game of Thrones", "Game Of Thrones", NotificationManager.IMPORTANCE_MAX, true, "gameofthrones.mp3");

        CleverTapAPI.createNotificationChannel(getApplicationContext(), "got", "Game of Thrones", "Game Of Thrones", 2, true, "gameofthrones.mp3");

    }
}
