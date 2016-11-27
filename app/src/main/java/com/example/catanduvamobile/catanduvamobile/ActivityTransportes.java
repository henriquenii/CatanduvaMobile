package com.example.catanduvamobile.catanduvamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ActivityTransportes extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportes);
    }

    public void startActivityOnibusUrbano(View view) {
        Intent activityOnibusUrbano = new Intent(this, ActivityOnibusUrbano.class);
        startActivity(activityOnibusUrbano);
    }

    public void startMainActivity (View view){
        Intent activityMain = new Intent(this, MainActivity.class);
        activityMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(activityMain);
    }


}
