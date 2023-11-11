package com.example.pmdm_2324.ut03;

import static com.example.pmdm_2324.ut03.ut308MostrarMonstruo.MONSTRUO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.pmdm_2324.R;

import java.io.Serializable;
import java.util.Random;

public class ut308MonstruoMain extends AppCompatActivity {
    Button ut308btEnviar;
EditText ut308etColor,ut308etNombre,ut308etNumeroExtremidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut308_monstruo_main);
        ut308btEnviar=findViewById(R.id.ut308btEnviar);
        ut308etColor=findViewById(R.id.ut308etColor);
        ut308etNombre=findViewById(R.id.ut308etNombre);
        ut308etNumeroExtremidades=findViewById(R.id.ut308etNumeroExtremidades);
        ut308btEnviar.setOnClickListener(view -> {
            String nombre="";
            String color="";
            int extremidades=0;
            if(ut308etNombre.getText().equals("") || ut308etNombre.equals(null)){
                ut308etNombre.setError("Introduce un Nombre");
            }else{
                nombre=ut308etNombre.getText().toString();
            }
            if(ut308etColor.getText().equals("") || ut308etColor.equals(null)){
                ut308etColor.setError("Introduce un color");
            }else{
                color=ut308etColor.getText().toString();
            }
            if(ut308etNumeroExtremidades.getText().equals("") || ut308etNumeroExtremidades.equals(null)){
                ut308etNumeroExtremidades.setError("Introduce un numero de extremidades");
            }else{
                extremidades= ut308etNumeroExtremidades.getText().length();
            }
            Monstruo monstruoEnviado=new Monstruo(nombre,extremidades,color);
            Intent i=new Intent(this,ut308MostrarMonstruo.class);
            i.putExtra(MONSTRUO, monstruoEnviado);
            startActivity(i);
        });


    }
}