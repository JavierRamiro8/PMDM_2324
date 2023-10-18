package com.example.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.pmdm_2324.R;

public class ut302CalculadoraResultado extends AppCompatActivity {
    TextView resultadoCalculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut302_calculadora_resultado);
        resultadoCalculadora = findViewById(R.id.u302tvSalidaCalculadora);

        String primerNumero = getIntent().getStringExtra("PRIMERNUMERO");
        String segundoNumero = getIntent().getStringExtra("SEGUNDONUMERO");
        double resultado = 0;
        String operacion = getIntent().getStringExtra("OPERACION");
        String cadena="";

        if (operacion.equals("sumar")) {
            resultado = sumar(primerNumero, segundoNumero);
            cadena = String.valueOf(resultado);
        } else if (operacion.equals("restar")) {
            resultado = restar(primerNumero, segundoNumero);
            cadena = String.valueOf(resultado);
        } else if (operacion.equals("multiplicar")) {
            resultado = multiplicar(primerNumero, segundoNumero);
            cadena = String.valueOf(resultado);
        } else if (operacion.equals("dividir")) {
            if(primerNumero.equals("1") & segundoNumero.equals("0")){
                cadena="Syntax Error";
            }else{
                resultado = dividir(primerNumero, segundoNumero);
                cadena = String.valueOf(resultado);
            }
        }
        resultadoCalculadora.setText(cadena);
    }

    public double sumar(String uno, String dos) {
        double numero1 = Double.parseDouble(uno);
        double numero2 = Double.parseDouble(dos);
        return numero1 + numero2;
    }

    private double restar(String uno, String dos) {
        double numero1 = Double.parseDouble(uno);
        double numero2 = Double.parseDouble(dos);
        return numero1 - numero2;
    }

    private double multiplicar(String uno, String dos) {
        double numero1 = Double.parseDouble(uno);
        double numero2 = Double.parseDouble(dos);
        return numero1 * numero2;
    }

    private double dividir(String uno, String dos) {
        final double divisionNula = 0.0;
        double numero1 = Double.parseDouble(uno);
        double numero2 = Double.parseDouble(dos);

        if (numero1==1 && numero2 == 0) {
            return divisionNula;
        }
        return numero1 / numero2;
    }
}

