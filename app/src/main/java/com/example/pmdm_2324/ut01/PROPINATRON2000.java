package com.example.pmdm_2324.ut01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.pmdm_2324.R;

public class PROPINATRON2000 extends AppCompatActivity {
    Button tecla1,tecla2,tecla3,tecla4,tecla5,tecla6,tecla7,tecla8,tecla9,tecla0,teclaAnterior,teclaC;
    RadioButton radioMal,radioBien,radioExcelente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propinatron2000);
        tecla0=findViewById(R.id.ut203bt0);
        tecla1=findViewById(R.id.ut203bt1);
        tecla2=findViewById(R.id.ut203bt2);
        tecla3=findViewById(R.id.ut203bt3);
        tecla4=findViewById(R.id.ut203bt4);
        tecla5=findViewById(R.id.ut203bt5);
        tecla6=findViewById(R.id.ut203bt6);
        tecla7=findViewById(R.id.ut203bt7);
        tecla8=findViewById(R.id.ut203bt8);
        tecla9=findViewById(R.id.ut203bt9);
        teclaC=findViewById(R.id.ut203btC);
        teclaAnterior=findViewById(R.id.ut203btBorrarAnterior);
        radioMal=findViewById(R.id.ut203rdMal);
        radioBien=findViewById(R.id.ut203rdBien);
        radioExcelente=findViewById(R.id.ut203rdExcelente);
        
    }
}