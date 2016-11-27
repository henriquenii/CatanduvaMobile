package com.example.catanduvamobile.catanduvamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityOnibusUrbanoTerminalUrbano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onibus_urbano_terminal_urbano);
    }

    public void startActivityMaps(View view){
        Intent activityMaps = new Intent(this, ActivityMaps.class);
        startActivity(activityMaps);
    }

}
