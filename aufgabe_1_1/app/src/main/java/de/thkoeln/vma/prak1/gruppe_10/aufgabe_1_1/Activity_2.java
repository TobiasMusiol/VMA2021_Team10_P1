package de.thkoeln.vma.prak1.gruppe_10.aufgabe_1_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity_2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("STATUS", "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final Button gotoThirdButton = (Button) findViewById(R.id.goto_activity_3);

        gotoThirdButton.setOnClickListener(new GotoThirdButtonListener());
    }
}

class GotoThirdButtonListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Log.v("STATUS", "onClick() Button_3");
        Intent myIntent = new Intent(v.getContext(), Activity_3.class);
        v.getContext().startActivity(myIntent);

    }
}