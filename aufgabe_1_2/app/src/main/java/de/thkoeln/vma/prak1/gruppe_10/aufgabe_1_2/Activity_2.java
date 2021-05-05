package de.thkoeln.vma.prak1.gruppe_10.aufgabe_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.widget.EditText;


public class Activity_2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("STATUS", "onCreate() Activity_2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        EditText inputField = (EditText) findViewById(R.id.input_field);
    }

    @Override
    protected void onStart() {
        Log.v("STATUS", "onStart() Activity_2");
        
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v("STATUS", "onResume() Activity_2");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.v("STATUS", "onPause() Activity_2");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v("STATUS", "onStop() Activity_2");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.v("STATUS", "onRestart() Activity_2");
        super.onRestart();
    }
}
