package com.example.catanduvamobile.catanduvamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityOnibusUrbanoRotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onibus_urbano_rotas);
    }

    public void startActivityOnibusUrbano(View view){
        Intent activityOnibusUrbano = new Intent(this, ActivityOnibusUrbano.class);
        activityOnibusUrbano.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(activityOnibusUrbano);
    }

    public void startMainActivity(View view){
        Intent mainActivity = new Intent(this, MainActivity.class);
        mainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainActivity);
    }

    public void startActivityOnibusUrbanoRotasAmendolaAgudoromaoClubedecampo(View view) {
        Intent activityOnibusUrbanoRotasAmendolaAgudoromaoClubedecampo = new Intent(this, ActivityOnibusUrbanoRotasAmendolaAgudoromaoClubedecampo.class);
        startActivity(activityOnibusUrbanoRotasAmendolaAgudoromaoClubedecampo);
    }
}
