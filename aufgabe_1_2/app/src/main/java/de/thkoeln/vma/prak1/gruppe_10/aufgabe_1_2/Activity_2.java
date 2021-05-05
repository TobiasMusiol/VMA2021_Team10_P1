/* Antwort zu 1.2:
*
* Wenn man bei Activity_2 auf den Back Button drückt, wird onSaveInstanceState nicht aufgerufen,
* somit wird der Wert der im EditText steht nicht gesichert.
*
* Anders ist es wenn man z.B. den Bildschirm dreht. Dann wird bevor onDestroy() aufgerufen wird
* erstmal onSaveInstanceState() aufgerufen.
*
*/

package de.thkoeln.vma.prak1.gruppe_10.aufgabe_1_2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;


public class Activity_2 extends Activity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("STATUS", " ---> onCreate() Activity_2 <---");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        EditText input_field = (EditText) findViewById(R.id.input_field);
        TextView last_bundle_content = (TextView) findViewById(R.id.output);

        // Wenn dass Bundle Werte enthält, dann setze den Wert vom Schlüssel "OUTPUT" in
        // den in das EditText Feld und den Output TextView.
        if (savedInstanceState != null) {
            String bundle_string = savedInstanceState.getString("OUTPUT");
            if (bundle_string.equals(""))
                last_bundle_content.setText("{empty String}");
            else
                last_bundle_content.setText(bundle_string);

            input_field.setText(bundle_string);
        }
        else
            last_bundle_content.setText("{null}");
    }

    @Override
    protected void onDestroy() {
        Log.v("STATUS", " ---> onDestroy() Activity_2 <---");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.v("STATUS", " ---> onSaveInstanceState(Bundle outState) Activity_2 <---");
        EditText input_field = (EditText) findViewById(R.id.input_field);

        //Ordnet den Wert aus dem EditText dem Key "OUTPUT" im Bundle zu
        outState.putString("OUTPUT", input_field.getText().toString());
        super.onSaveInstanceState(outState);
    }
}
