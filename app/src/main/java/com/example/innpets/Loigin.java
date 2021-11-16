package com.example.innpets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

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
    public void login (View v) {

        EditText campo1 = this.findViewById(R.id.correo);
        String correo = campo1.getText().toString();
        EditText campo2 = this.findViewById(R.id.contrasenia);
        String contrasenia = campo2.getText().toString();

        if (correo.equals("c1") && contrasenia.equals("123")) {

            CheckBox cbRecuerdame = (CheckBox) findViewById(R.id.cbRecuerdame);
            boolean chequeado = cbRecuerdame.isChecked();

            if(chequeado==true) {
                SharedPreferences datos = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor = datos.edit();
                editor.putString("correo", correo);
                editor.apply();
            }

            Intent i = new Intent(this, Principal.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Error en las credenciales", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences datos = PreferenceManager.getDefaultSharedPreferences(this);
        String correo = datos.getString("correo", "");
        if (!correo.equals("")) {
            Intent i = new Intent(this, Principal.class);
            startActivity(i);
        }
    }
}