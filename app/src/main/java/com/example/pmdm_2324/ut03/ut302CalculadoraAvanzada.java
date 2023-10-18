package com.example.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.pmdm_2324.R;

public class ut302CalculadoraAvanzada extends AppCompatActivity {
    EditText primerNumero, segundoNumero;
    TextView radioNoSeleccionado;
    RadioButton sumar, restar, multiplicar, dividir;
    Button botonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut302_calculadora_avanzada);
        radioNoSeleccionado=findViewById(R.id.u302tvErrorRadioNoSeleccionado);
        primerNumero = findViewById(R.id.u302etPrimerNumero);
        segundoNumero = findViewById(R.id.u302etSegundoNumero);
        sumar = findViewById(R.id.u302rdSumar);
        restar = findViewById(R.id.u302rdRestar);
        multiplicar = findViewById(R.id.u302rdMultiplicar);
        dividir = findViewById(R.id.u302rdDividir);
        botonCalcular = findViewById(R.id.u302btCalcular);
        botonCalcular.setOnClickListener(view -> {
            Intent i = new Intent(this, ut302CalculadoraResultado.class);
            double resultado = 0;
            if (primerNumero.getText().toString().isEmpty()) {
                primerNumero.setError("No se puede dejar vacio");
            } else if (segundoNumero.getText().toString().isEmpty()) {
                segundoNumero.setError("No se puede dejar vacio");
            }
            if( sumar.isChecked() || restar.isChecked() || multiplicar.isChecked() || dividir.isChecked()) {
            if (sumar.isChecked()) {
                i.putExtra("OPERACION", sumar.getText().toString());
            } else if (restar.isChecked()) {
                i.putExtra("OPERACION", restar.getText().toString());
            } else if (multiplicar.isChecked()) {
                i.putExtra("OPERACION", multiplicar.getText().toString());
            } else if (dividir.isChecked()) {
                i.putExtra("OPERACION", dividir.getText().toString());
            }
            i.putExtra("PRIMERNUMERO",primerNumero.getText().toString());
            i.putExtra("SEGUNDONUMERO",segundoNumero.getText().toString());
            startActivity(i);
        }else{
              radioNoSeleccionado.setText("No se puede seguir sin una operacion seleccionada");
            }
        });
    }
}
