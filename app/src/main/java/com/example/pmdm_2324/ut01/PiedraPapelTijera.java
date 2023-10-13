package com.example.pmdm_2324.ut01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.pmdm_2324.R;

import java.util.Random;

public class PiedraPapelTijera extends AppCompatActivity {
    ImageButton piedra, papel, tijeras;
    Button reiniciar;
    TextView contadorJugador, contadorMaquina, resultadoMaquina, resultadoPartida;

    View.OnClickListener manejador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedra_papel_tijera);
        piedra = findViewById(R.id.ut207btnnPiedra);
        papel = findViewById(R.id.ut207btnnPapel);
        tijeras = findViewById(R.id.ut207btnnTijeras);
        reiniciar = findViewById(R.id.ut207btnnReiniciar);
        contadorJugador = findViewById(R.id.ut207LbContadorJugador);
        contadorMaquina = findViewById(R.id.ut207LbContadorMaquina);
        resultadoMaquina = findViewById(R.id.ut207LbResultadoMaquina);
        resultadoPartida = findViewById(R.id.ut207LbResultado);

        manejador = (View botonPulsado) -> {
            String tipoSeleccionado;
            ImageButton seleccionado = (ImageButton) botonPulsado;
            seleccionado.setBackgroundColor(Color.BLACK);
            String eleccionMaquina = obtenerEleccionMaquina();
            String eleccionJugador = obtenerEleccionJugador(seleccionado);

            resultadoMaquina.setText("La maquina a elegido " + eleccionMaquina);
            if (eleccionMaquina.equals(eleccionJugador)) {
                resultadoPartida.setText("Empate");
            } else if (hasGanado(eleccionJugador, eleccionMaquina)) {
                resultadoPartida.setText("Has Ganado");
                actualizarContador(contadorJugador, 1);
            } else {
                resultadoPartida.setText("Has perdido");
                actualizarContador(contadorMaquina, 1);
            }
        };

        reiniciar.setOnClickListener((View v) -> {
            contadorJugador.setText("0");
            contadorMaquina.setText("0");
            resultadoMaquina.setText("");
            resultadoPartida.setText("");
        });

        piedra.setOnClickListener(manejador);
        papel.setOnClickListener(manejador);
        tijeras.setOnClickListener(manejador);
    }

    private String obtenerEleccionMaquina() {
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        int indice = new Random().nextInt(opciones.length);
        return opciones[indice];
    }

    private String obtenerEleccionJugador(ImageButton seleccionado) {
        if (seleccionado == piedra) {
            return "Piedra";
        } else if (seleccionado == papel) {
            return "Papel";
        } else if (seleccionado == tijeras) {
            return "Tijeras";
        }
        return "";
    }

    private boolean hasGanado(String eleccionJugador, String eleccionMaquina) {
        return (eleccionJugador.equals("Piedra") && eleccionMaquina.equals("Tijeras"))
                || (eleccionJugador.equals("Papel") && eleccionMaquina.equals("Piedra"))
                || (eleccionJugador.equals("Tijeras") && eleccionMaquina.equals("Papel"));
    }

    private void actualizarContador(TextView contador, int incremento) {
        int valorActual = Integer.parseInt(contador.getText().toString());
        contador.setText(String.valueOf(valorActual + incremento));
    }
}
