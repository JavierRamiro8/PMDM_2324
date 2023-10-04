package com.example.pmdm_2324.ut01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pmdm_2324.R;

import java.util.function.Consumer;

public class Propinatron2000 extends AppCompatActivity {
Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton0,botonDel,botonC;
TextView tvSalidaNumeros;
View.OnClickListener manejador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propinatron2000);
        boton1=findViewById(R.id.ut203bt1);
        boton2=findViewById(R.id.ut203bt2);
        boton3=findViewById(R.id.ut203bt3);
        boton4=findViewById(R.id.ut203bt4);
        boton5=findViewById(R.id.ut203bt5);
        boton6=findViewById(R.id.ut203bt6);
        boton7=findViewById(R.id.ut203bt7);
        boton8=findViewById(R.id.ut203bt8);
        boton9=findViewById(R.id.ut203bt9);
        boton0=findViewById(R.id.ut203bt0);
        botonDel=findViewById(R.id.ut203btDel);
        botonC=findViewById(R.id.ut203btC);
        tvSalidaNumeros=findViewById(R.id.ut203tvResultado);
        manejador = (View botonPulsado) -> {
            Button seleccion = (Button) botonPulsado;
            tvSalidaNumeros.append(seleccion.getText());
        };
        boton1.setOnClickListener(manejador);
        boton2.setOnClickListener(manejador);
        boton3.setOnClickListener(manejador);
        boton4.setOnClickListener(manejador);
        boton5.setOnClickListener(manejador);
        boton6.setOnClickListener(manejador);
        boton7.setOnClickListener(manejador);
        boton8.setOnClickListener(manejador);
        boton9.setOnClickListener(manejador);
        boton0.setOnClickListener(manejador);
        botonDel.setOnClickListener(manejador);
        botonC.setOnClickListener(manejador);

    }
}