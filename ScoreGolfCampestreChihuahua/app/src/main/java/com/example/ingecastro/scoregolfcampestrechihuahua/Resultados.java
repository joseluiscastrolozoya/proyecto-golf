package com.example.ingecastro.scoregolfcampestrechihuahua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Resultados extends AppCompatActivity {
    Intent inant,inmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        inant=new Intent(this,Hoyos.class);
        inmenu=new Intent(this,Principal.class);
    }
    public void clickant(View v){
        startActivity(inant);
        finish();
    }
    public void clickmen(View v){
       startActivity(inmenu);
        finish();
    }
}
