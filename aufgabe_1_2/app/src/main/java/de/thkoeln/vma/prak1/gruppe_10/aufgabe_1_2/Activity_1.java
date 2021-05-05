package de.thkoeln.vma.prak1.gruppe_10.aufgabe_1_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("STATUS", " ---> onCreate() Activity_1 <---");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        final Button gotoSecondButton = (Button) findViewById(R.id.goto_activity_2);

        gotoSecondButton.setOnClickListener(new GotoSecondButtonListener());

    }
}

class GotoSecondButtonListener implements OnClickListener {
    @Override
    public void onClick(View v) {
        Log.v("STATUS", " ---> onClick() Button_2 <---");
        Intent myIntent = new Intent(v.getContext(), Activity_2.class);
        v.getContext().startActivity(myIntent);

    }
}
