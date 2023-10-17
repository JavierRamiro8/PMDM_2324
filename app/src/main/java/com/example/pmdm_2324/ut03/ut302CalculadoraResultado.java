package com.example.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.pmdm_2324.R;

import org.w3c.dom.Text;

public class ut302CalculadoraResultado extends AppCompatActivity {
TextView resultadoCalculadora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resultadoCalculadora = findViewById(R.id.u302tvSalidaCalculadora);
        setContentView(R.layout.activity_ut302_calculadora_resultado);
        resultadoCalculadora=findViewById(R.id.u302tvSalidaCalculadora);
       double resultado=getIntent().getDoubleExtra("RESULTADO",0);
       String cadena= String.valueOf(Double.valueOf(resultado));
       resultadoCalculadora.setText(cadena);
    }
}