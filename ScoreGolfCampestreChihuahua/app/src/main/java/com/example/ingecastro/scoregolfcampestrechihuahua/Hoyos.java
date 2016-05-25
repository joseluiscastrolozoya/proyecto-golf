package com.example.ingecastro.scoregolfcampestrechihuahua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Hoyos extends AppCompatActivity {
    Intent inppal,inresul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoyos);

        inppal=new Intent(this,Principal.class);
        inresul=new Intent(this,Resultados.class);

    }
    public void clickante(View v){
        startActivity(inppal);
        finish();
    }
    public void clicksig(View v){
        startActivity(inresul);
        finish();

    }
}
