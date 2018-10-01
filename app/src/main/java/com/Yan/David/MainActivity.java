package com.Yan.David;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Message","Completed onCreate()");
    }

    protected void onStart(){
        super.onStart();
        Log.d("message", "Completed onStart()");
    }

    protected void onResume(){
        super.onResume();
        Log.d("message", "Completed onResume()");
    }

    protected void onPause(){
        super.onPause();
        Log.d("message", "Completed onPause()");

    }
    protected void onStop() {
        super.onStop();
        Log.d("message", "Completed onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message", "Completed onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message","Completed onDestroy()");
    }

    public void Toast(View v){
        Toast.makeText(this, "This is an example of TOAST",Toast.LENGTH_LONG).show();
        Log.d("message","Showed Toast");
    }

    public void Snackbar(View v){
        Snackbar.make(v,"This is an example of SNACKBAR", Snackbar.LENGTH_LONG).show();
        Log.d("message","Showed Snackbar");
    }

}
