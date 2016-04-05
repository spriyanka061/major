package me.zhanghai.android.patternlock.sample.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import me.zhanghai.android.patternlock.sample.R;

/**
 * Created by dev on 30-Mar-16.
 */
public class Main extends AppCompatActivity {
    private static EditText name;
    private static EditText phone;
    private static Button save;

    private GoogleApiClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        SaveButton();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void SaveButton() {
        name = (EditText) findViewById(R.id.editText_username);
        phone = (EditText) findViewById(R.id.editText_phone);
        save = (Button) findViewById(R.id.button_save);

        save.setOnClickListener(new View.OnClickListener() {


                                    @Override
                                    public void onClick(View v) {
                                        if (name.getText().length() == 0) {
                                            name.setError("PLEASE ENTER A VALID EMAIL ID");
                                        } else if (phone.getText().length() != 10) {
                                            phone.setError("PLEASE ENTER A VALID MOBILE NUMBER");
                                        } else {
                                            Intent intent = new Intent(Main.this,Main2.class);
                                            startActivity(intent);
                                        }
                                    }
                                }
        );}


}
