package com.example.innpets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class Registro2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);
        tv = findViewById(R.id.textView);
        //recuperar los view
        EditText etFechaNacimiento =( EditText) findViewById(R.id.etFechaNacimiento);
        //recuperar el valor del view
        RadioGroup rgSexo =(RadioGroup) findViewById(R.id.rgGenero);
        //recuperar los view
        int id = rgSexo.getCheckedRadioButtonId();
        String sexo = "";
        switch (id){
            case R.id.rbMasculino:
                sexo = "Masculino";
                break;
            case R.id.rbFemenino:
                sexo = "Femenino";
                break;
            default:
                //Toast.makeText(this,"Seleccione un genero por favor",Toast.LENGTH_SHORT).show();
        }
        //recuperar los view
        Spinner spRegion = (Spinner) findViewById(R.id.spRegiones);
        //recuperar el valor del view
        String region = spRegion.getSelectedItem().toString();
        //recuperar los view
        Spinner spComuna = (Spinner) findViewById(R.id.spComunas);
        //recuperar el valor del view
        String comuna = spComuna.getSelectedItem().toString();
        //recuperar los view
        Spinner spCiudad = (Spinner) findViewById(R.id.spCiudad);
        //recuperar el valor del view
        String ciudad = spCiudad.getSelectedItem().toString();

    }
    public void abrirCalendario(View view) {

        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpb  = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String fecha = dayOfMonth +"/"+ month +"/"+ year;
                tv.setText(fecha);

            }
        },anio,mes,dia);
        dpb.show();
    }
    public void registro3(View v ){
        Intent i = new Intent(this, Registro3.class);
        startActivity(i);
    }
}