package com.example.firstpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Context context = MainActivity.this;
    int duration = Toast.LENGTH_SHORT;
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(context, "onCreate", duration);
        toast.show();
        Log.e(TAG, "OnCreate");
        Log.w(TAG, "OnCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(context, "onStart", duration);
        toast.show();
        Log.i(TAG, "OnStart");
        Log.d(TAG, "OnStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(context, "onStop", duration);
        toast.show();
        Log.v(TAG, "OnStop");
        Log.e(TAG, "OnStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(context, "onStop", duration);
        toast.show();
        Log.e(TAG, "OnDestroy");
        Log.w(TAG, "OnDestroy");



    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(context, "onPause", duration);
        toast.show();
        Log.i(TAG, "OnPause");
        Log.d(TAG, "OnPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(context, "onResume", duration);
        toast.show();
        Log.v(TAG, "OnResume");
        Log.e(TAG, "OnResume");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(context, "onRestart", duration);
        toast.show();
        Log.e(TAG, "OnRestart");
        Log.w(TAG, "OnRestart");
    }
}