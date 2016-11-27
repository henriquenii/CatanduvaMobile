package com.example.catanduvamobile.catanduvamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityOnibusUrbano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onibus_urbano);
    }

    public void startActivityOnibusUrbanoTerminalUrbano(View view){
        Intent activityOnibusUrbanoTerminalUrbano = new Intent(this, ActivityOnibusUrbanoTerminalUrbano.class);
        startActivity(activityOnibusUrbanoTerminalUrbano);
    }

    public void startActivityTransportes(View view){
        Intent activityTransportes = new Intent(this, ActivityTransportes.class);
        activityTransportes.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(activityTransportes);
    }

    public void startMainActivity(View view){
        Intent mainActivity = new Intent(this, MainActivity.class);
        mainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainActivity);
    }

    public void startActivityOnibusUrbanoRotas(View view){
        Intent activityOnibusUrbanoRotas = new Intent(this, ActivityOnibusUrbanoRotas.class);
        startActivity(activityOnibusUrbanoRotas);
    }

}
