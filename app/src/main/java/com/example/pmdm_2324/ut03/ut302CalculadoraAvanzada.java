package com.example.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.pmdm_2324.R;

import java.util.concurrent.atomic.AtomicInteger;

public class ut302CalculadoraAvanzada extends AppCompatActivity {
EditText primerNumero,SegundoNumero;
RadioButton sumar,restar,multiplicar,dividir;

Button botonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut302_calculadora_avanzada);
        primerNumero=findViewById(R.id.u302etPrimerNumero);
        SegundoNumero=findViewById(R.id.u302etPrimerNumero);
        sumar=findViewById(R.id.u302rdSumar);
        restar=findViewById(R.id.u302rdRestar);
        multiplicar=findViewById(R.id.u302rdMultiplicar);
        dividir=findViewById(R.id.u302rdDividir);
        botonCalcular=findViewById(R.id.u302btCalcular);
        botonCalcular.setOnClickListener(view -> {
            int resultado=0;
            if(sumar.isChecked()){
                resultado =(sumar());
            }
            else if(restar.isChecked()){
                resultado=restar();

            }else if(multiplicar.isChecked()){
                resultado=multiplicar();

            }else if(dividir.isChecked()){
                resultado= dividir();

            }
            Intent i=new Intent(this, ut302CalculadoraResultado.class);
            i.putExtra("RESULTADO",resultado);
            startActivity(i);
        });
    }

    private int sumar(){
        String numeroParseable= primerNumero.getText().toString();
        int numero1= Integer.parseInt(numeroParseable);
        String numeroParseable2= SegundoNumero.getText().toString();
        int numero2= Integer.parseInt(numeroParseable2);
        return numero1+numero2;
    }
    private int restar(){
        String numeroParseable= primerNumero.getText().toString();
        int numero1= Integer.parseInt(numeroParseable);
        String numeroParseable2= SegundoNumero.getText().toString();
        int numero2= Integer.parseInt(numeroParseable2);
        return numero1-numero2;
    }
    private int multiplicar(){
        String numeroParseable= primerNumero.getText().toString();
        int numero1= Integer.parseInt(numeroParseable);
        String numeroParseable2= SegundoNumero.getText().toString();
        int numero2= Integer.parseInt(numeroParseable2);
        return numero1*numero2;
    }
    private int dividir(){
        final int divisionNula=0;
        String numeroParseable= primerNumero.getText().toString();
        int numero1= Integer.parseInt(numeroParseable);
        String numeroParseable2= SegundoNumero.getText().toString();
        int numero2= Integer.parseInt(numeroParseable2);
        if(numero1==0 & numero2==1){
            return divisionNula;
        }else if(numero1==1 & numero2==0){
            return divisionNula;
        }
        return numero1/numero2;
    }
}
