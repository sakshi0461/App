package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  int count=0;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      toastThis((++count)+" created");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        toastThis((++count)+" started");

    }
    @Override
    protected void onResume() {
        super.onResume();
        toastThis((++count)+" resume");

    }
    @Override
    protected void onPause() {
        super.onPause();
        toastThis((++count)+" paused");

    }
    @Override
    protected void onStop() {
        super.onStop();
        toastThis((++count)+" stop");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        toastThis((++count)+" destroy");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        toastThis((++count)+" restarted");

    }
    protected void toastThis(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

}
