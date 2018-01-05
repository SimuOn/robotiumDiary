package com.breakloop.robotiumdiary.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.breakloop.robotiumdiary.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private final String TAG=getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Main Activity onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "Main Activity onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Main Activity onResume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "Main Activity onStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Main Activity onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "Main Activity onDestroy");
        super.onDestroy();
    }
}
