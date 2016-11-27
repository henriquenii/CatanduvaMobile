package com.example.catanduvamobile.catanduvamobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Sair?");
        builder.setMessage("Deseja realmente sair do CATANDUVA MOBILE?");
        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
            }
        });
        builder.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        AlertDialog alerta = builder.create();
        alerta.show();
    }

    public void startActivitySobre (View view){
        Intent activitySobre = new Intent(this, ActivitySobre.class);
        startActivity(activitySobre);
    }

    public void startActivityCompras (View view){
        Intent activityCompras = new Intent(this, ActivityCompras.class);
        startActivity(activityCompras);
    }

    public void startActivityTransportes (View view){
        Intent activityTransportes = new Intent(this, ActivityTransportes.class);
        startActivity(activityTransportes);
    }

    public void startActivityHospedagem (View view){
        Intent activityHospedagem = new Intent(this, ActivityHospedagem.class);
        startActivity(activityHospedagem);
    }

    public void startActivityAlimentacao (View view){
        Intent activityAlimentacao = new Intent(this, ActivityAlimentacao.class);
        startActivity(activityAlimentacao);
    }

    public void startActivityEntretenimento (View view){
        Intent activityEntretenimento = new Intent(this, ActivityEntretenimento.class);
        startActivity(activityEntretenimento);
    }

    public void startActivityEsporteLazer (View view){
        Intent activityEsporteLazer = new Intent(this, ActivityEsporteLazer.class);
        startActivity(activityEsporteLazer);
    }

    public void startActivitySaude (View view){
        Intent activitySaude = new Intent(this, ActivitySaude.class);
        startActivity(activitySaude);
    }

    public void startActivityUtilidadePublica (View view){
        Intent activityUtilidadePublica = new Intent(this, ActivityUtilidadePublica.class);
        startActivity(activityUtilidadePublica);
    }


    public void startActivityHistoriaDaCidade (View view){
        Intent activityHistoriaDaCidade = new Intent(this, ActivityHistoriaDaCidade.class);
        startActivity(activityHistoriaDaCidade);
    }

    public void startActivityFinanceiras(View view){
        Intent activityFinanceiras = new Intent(this, ActivityFinanceiras.class);
        startActivity(activityFinanceiras);
    }

    public void startActivityOfertas(View view){
        Intent activityOfertas = new Intent(this, ActivityOfertas.class);
        startActivity(activityOfertas);
    }



}
