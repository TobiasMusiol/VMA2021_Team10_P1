package de.thkoeln.vma.prak1.gruppe_10.aufgabe_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        final Button gotoSecondButton = (Button) findViewById(R.id.goto_activity_2);

        gotoSecondButton.setOnClickListener(new GotoSecondButtonListener());

    }
}

class GotoSecondButtonListener implements OnClickListener {
    @Override
    public void onClick(View v) {
        Log.v("Message","Button was pressed");
    }
}