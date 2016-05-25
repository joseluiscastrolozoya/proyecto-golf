package com.example.ingecastro.scoregolfcampestrechihuahua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Jugadores extends AppCompatActivity {
    Intent inprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);

        inprincipal=new Intent(this,Principal.class);
    }
    public void clickprincipal(View v){
        startActivity(inprincipal);
        finish();
    }
}
