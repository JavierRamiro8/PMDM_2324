package com.example.pmdm_2324.ut01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.example.pmdm_2324.R;

public class ut201_Colores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut201_colores);
        TextView textoColores;
        TextView entradaTexto;
        Button Aceptar;
        SeekBar barraR;
        SeekBar barraG;
        SeekBar barraB;
        Switch switchCambioColor;
        TextView planeText;

        Aceptar=findViewById(R.id.ut201BotonAceptar);
        textoColores=findViewById(R.id.ut201txtColores);
        barraR=findViewById(R.id.ut201seekbrR);
        barraG=findViewById(R.id.ut201skbrG);
        barraB=findViewById(R.id.ut201skbrB);
        ConstraintLayout fondo=findViewById(R.id.ut201Layout);
        entradaTexto=findViewById(R.id.ut201plntx);

        switchCambioColor=findViewById(R.id.ut201swtchColor);
        planeText=findViewById(R.id.ut201plntx);

        Aceptar.setOnClickListener((View v)->{
            int ProgresoR=barraR.getProgress();
            int ProgresoG=barraG.getProgress();
            int ProgresoB=barraB.getProgress();
            int colorFondo= Color.rgb(ProgresoR, ProgresoG, ProgresoB);
            fondo.setBackgroundColor(colorFondo);
            textoColores.setText(planeText.getText());

        });
        switchCambioColor.setOnClickListener((View x)->{
            if(switchCambioColor.isChecked()){
                switchCambioColor.setText("Negro");
                switchCambioColor.setTextColor(Color.BLACK);
                textoColores.setTextColor(Color.BLACK);
            }else{
                switchCambioColor.setText("Blanco");
                switchCambioColor.setTextColor(Color.WHITE);
                textoColores.setTextColor(Color.WHITE);

            }
        });

    }
}