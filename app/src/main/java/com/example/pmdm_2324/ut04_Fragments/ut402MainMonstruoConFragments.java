package com.example.pmdm_2324.ut04_Fragments;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pmdm_2324.R;
import com.example.pmdm_2324.ut03_PasosDeDatosEntreActividades.MonstruoParaFragments;

public class ut402MainMonstruoConFragments extends AppCompatActivity {

    EditText nombreMonstruo, extremidadesMonstruo, colorMonstruo;
    Button enviar;
    ut402FragmentMonstruos fragment1, fragment2, fragment3, fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut402_monstruo_con_fragments);

        nombreMonstruo = findViewById(R.id.ut402IdEtNombreMonstruo);
        extremidadesMonstruo = findViewById(R.id.ut402IdEtExtremidades);
        colorMonstruo = findViewById(R.id.ut402IdEtColor);
        enviar = findViewById(R.id.ut402idBtenviar);

        // Inicializa los contenedores de fragmentos
        fragment1 = ut402FragmentMonstruos.newInstance("", "");
        fragment2 = ut402FragmentMonstruos.newInstance("", "");
        fragment3 = ut402FragmentMonstruos.newInstance("", "");
        fragment4 = ut402FragmentMonstruos.newInstance("", "");

        enviar.setOnClickListener(view -> {
            String nombre = nombreMonstruo.getText().toString();
            String color = colorMonstruo.getText().toString();
            int extremidades = 0;

            if (!extremidadesMonstruo.getText().toString().isEmpty()) {
                extremidades = Integer.parseInt(extremidadesMonstruo.getText().toString());
            } else {
                extremidadesMonstruo.setError("Introduce un número de extremidades");
                return;  // Detiene la ejecución si hay un error.
            }

            if (!nombre.isEmpty() && !color.isEmpty() && extremidades > 0) {
                MonstruoParaFragments monstruoEnviado = new MonstruoParaFragments(nombre, extremidades, color);

                // Pasa los monstruos directamente a los fragmentos
                fragment1.actualizarMonstruo(monstruoEnviado);
                fragment2.actualizarMonstruo(monstruoEnviado);
                fragment3.actualizarMonstruo(monstruoEnviado);
                fragment4.actualizarMonstruo(monstruoEnviado);

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.ut402idfg1, fragment1)
                        .replace(R.id.ut402idfg2, fragment2)
                        .replace(R.id.ut402idfg3, fragment3)
                        .replace(R.id.ut402idfg4, fragment4)
                        .commit();
            } else {
                if (nombre.isEmpty()) {
                    nombreMonstruo.setError("Introduce un Nombre");
                }
                if (color.isEmpty()) {
                    colorMonstruo.setError("Introduce un color");
                }
                if (extremidades <= 0) {
                    extremidadesMonstruo.setError("El número de extremidades debe ser mayor que 0");
                }
            }
        });
    }
}




