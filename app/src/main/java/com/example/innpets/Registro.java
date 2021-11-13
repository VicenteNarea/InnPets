package com.example.innpets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //recuperar los view
        EditText etNombre =( EditText) findViewById(R.id.etNombre);
        //recuperar el valor del view
        String nombre = etNombre.getText().toString();
        //recuperar los view
        EditText etApellido =(EditText) findViewById(R.id.etApellido);
        //recuperar el valor del view
        String apellido = etApellido.getText().toString();
        //recuperar los view
        EditText etRut= (EditText) findViewById(R.id.etRUT);
        //recuperar el valor del view
        String rut = etRut.getText().toString();
        //recuperar los view
        EditText etCorreo = (EditText) findViewById(R.id.etCorreo);
        //recuperar el valor del view
        String correo = etCorreo.getText().toString();
    }
    public void registro2(View v ){
        Intent i = new Intent(this, Registro2.class);
        startActivity(i);
    }


}