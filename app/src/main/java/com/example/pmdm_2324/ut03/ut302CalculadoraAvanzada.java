package com.example.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import com.example.pmdm_2324.R;

public class ut302CalculadoraAvanzada extends AppCompatActivity {
    EditText primerNumero, SegundoNumero;
    RadioButton sumar, restar, multiplicar, dividir;
    Button botonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut302_calculadora_avanzada);
        primerNumero = findViewById(R.id.u302etPrimerNumero);
        SegundoNumero = findViewById(R.id.u302etSegundoNumero);
        sumar = findViewById(R.id.u302rdSumar);
        restar = findViewById(R.id.u302rdRestar);
        multiplicar = findViewById(R.id.u302rdMultiplicar);
        dividir = findViewById(R.id.u302rdDividir);
        botonCalcular = findViewById(R.id.u302btCalcular);
        botonCalcular.setOnClickListener(view -> {
            Intent i = new Intent(this, ut302CalculadoraResultado.class);
            double resultado = 0;
            if (sumar.isChecked()) {
                resultado = sumar();
            } else if (restar.isChecked()) {
                resultado = restar();
            } else if (multiplicar.isChecked()) {
                resultado = multiplicar();
            } else if (dividir.isChecked()) {
                resultado = dividir();
            }
            i.putExtra("RESULTADO", resultado);
            startActivity(i);
        });
    }

    private double sumar() {
        double numero1 = Double.parseDouble(primerNumero.getText().toString());
        double numero2 = Double.parseDouble(SegundoNumero.getText().toString());
        double resultado = numero1 + numero2;
        return resultado;
    }

    private double restar() {
        double numero1 = Double.parseDouble(primerNumero.getText().toString());
        double numero2 = Double.parseDouble(SegundoNumero.getText().toString());
        double resultado = numero1 - numero2;
        return resultado;
    }

    private double multiplicar() {
        double numero1 = Double.parseDouble(primerNumero.getText().toString());
        double numero2 = Double.parseDouble(SegundoNumero.getText().toString());
        double resultado = numero1 * numero2;
        return resultado;
    }

    private double dividir() {
        final double divisionNula = 0.0;
        double numero1 = Double.parseDouble(primerNumero.getText().toString());
        double numero2 = Double.parseDouble(SegundoNumero.getText().toString());
        if (numero2 == 0) {
            return divisionNula;
        }
        double resultado = numero1 / numero2;
        return resultado;
    }
}
