package me.zhanghai.android.patternlock.sample.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import me.zhanghai.android.patternlock.sample.R;
public class Main2 extends AppCompatActivity {
    private static TextView whatsApp;
    private static TextView Contacts;
    private static TextView Gallery;
    private CheckBox checkBox_whatsApp;
    private CheckBox checkBox_contacts;
    private CheckBox checkBox2_gallery;

    private static Button next;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        nextButton();
         // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void nextButton() {

        checkBox_whatsApp = (CheckBox) findViewById(R.id.checkBox_whatsApp);
        checkBox_contacts = (CheckBox) findViewById(R.id.checkBox_contacts);
        checkBox2_gallery = (CheckBox) findViewById(R.id.checkBox2_gallery);
        next = (Button) findViewById(R.id.next_button);

        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(checkBox_whatsApp.isChecked()||checkBox_contacts.isChecked()||checkBox2_gallery.isChecked()) {
                            Intent intent = new Intent(Main2.this,pattern_MainActivity.class);
                            startActivity(intent);
                        }
                        else
                            Toast.makeText(getApplicationContext(),"SELECT ATLEAST ONE OPTION" , Toast.LENGTH_SHORT).show();

                    }
                }
        );}

   }
