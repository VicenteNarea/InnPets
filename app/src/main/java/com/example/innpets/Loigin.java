package com.example.innpets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Loigin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loigin);
    }
    public void registro(View v ){
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
    public void goInicio(View v ){
        Intent i = new Intent(this, Inicio.class);
        startActivity(i);
    }
    public void recuperarCuenta(View v ){
        Intent i = new Intent(this, RecuperarCuenta.class);
        startActivity(i);
    }
}