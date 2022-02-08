package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MAINACTIVITY_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "oncreate started");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onstart started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onresume started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onstop started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ondestroy started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onrestart started");

    }
}