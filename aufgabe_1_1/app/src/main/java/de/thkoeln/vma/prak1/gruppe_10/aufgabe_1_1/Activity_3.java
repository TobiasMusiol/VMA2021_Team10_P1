package de.thkoeln.vma.prak1.gruppe_10.aufgabe_1_1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity_3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("STATUS", "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final Button gotoFirstButton = (Button) findViewById(R.id.goto_activity_1);
        final Button gotoSecondButton = (Button) findViewById(R.id.goto_activity_2);
        final Button gotoThirdButton = (Button) findViewById(R.id.goto_activity_3);

        gotoFirstButton.setOnClickListener(new GotoFirstButtonListener());
        gotoSecondButton.setOnClickListener(new GotoSecondButtonListener());
        gotoThirdButton.setOnClickListener(new GotoThirdButtonListener());
    }
}

class GotoFirstButtonListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Log.v("STATUS", "onClick() Button_1");
        Intent myIntent = new Intent(v.getContext(), Activity_1.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  //"Cleared" den Activity Stack
        v.getContext().startActivity(myIntent);
    }
}
