package com.example.pmdm_2324.ut01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.SelectionEvent;
import android.widget.Button;
import android.widget.TextView;

import com.example.pmdm_2324.R;

public class PiedraPapelTijera extends AppCompatActivity {
Button piedra,papel,tijeras,reiniciar;
TextView contadorJugador,contadorMaquina,resultadoMaquina,resultadoPartida;

View.OnClickListener manejador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedra_papel_tijera);
        piedra=findViewById(R.id.ut207btnnPiedra);
        papel=findViewById(R.id.ut207btnnPapel);
        tijeras=findViewById(R.id.ut207btnnTijeras);
        reiniciar=findViewById(R.id.ut207btnnReiniciar);
        contadorJugador=findViewById(R.id.ut207LbContadorJugador);
        contadorMaquina=findViewById(R.id.ut207LbContadorMaquina);
        resultadoMaquina=findViewById(R.id.ut207LbResultadoMaquina);
        resultadoPartida=findViewById(R.id.ut207LbResultado);

        manejador = ( View botonPulsado)->{
            String tipoSeleccionado;
            Button seleccionado= (Button) botonPulsado;
            seleccionado.setBackgroundColor(Color.BLACK);
            int eleccionMaquina=(int) Math.random()*3;
            int contadorJugador=0;
            int contadorPC = 0;
            while(eleccionMaquina==0){
                eleccionMaquina=(int) Math.random()*3;
            }
            switch (eleccionMaquina){
                case 1:
                    tipoSeleccionado="Tijeras";
                    resultadoMaquina.setText("La maquina a elegido Tijeras");
                    if(tipoSeleccionado!=seleccionado.getText()){
                        if(seleccionado.getText().equals("Papel")){
                            resultadoPartida.setText("Has perdido");
                            contadorPC++;
                            contadorMaquina.setText(contadorPC);
                        } else if (seleccionado.getText().equals("Piedra")){
                            resultadoPartida.setText("Has Ganado");
                            contadorJugador++;
                            contadorMaquina.setText(contadorJugador);
                        }
                    }
            }
        };

    }
}