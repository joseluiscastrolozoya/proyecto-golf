package com.example.ingecastro.scoregolfcampestrechihuahua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Button btninstrucciones, btnjugadores, btncomienzo;
    Intent injugadores,ininstrucciones,incomienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btninstrucciones=(Button)findViewById(R.id.button);
        btnjugadores=(Button)findViewById(R.id.button2);
        btncomienzo=(Button)findViewById(R.id.button3);

        injugadores=new Intent(this,Jugadores.class);
        incomienzo=new Intent(this,Hoyos.class);
    }
    public void clickju(View v){
        startActivity(injugadores);
        finish();
    }
    public void clickcomi(View v){
        startActivity(incomienzo);
        finish();

    }
    public void clickinst(View v){

    }
}
