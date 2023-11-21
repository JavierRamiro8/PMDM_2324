package com.example.pmdm_2324.ut04_Fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pmdm_2324.R;

public class ut401MainCambiarColorImagenEstrella extends AppCompatActivity {
    ImageView estrella;
    TextView ut40a1idtv;
    ut401Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut401_main_cambiar_color_imagen_estrella);
        estrella = findViewById(R.id.ut401imgEstrella);
        ut40a1idtv = findViewById(R.id.ut40a1idtv);
        fragment = (ut401Fragment) getSupportFragmentManager().findFragmentById(R.id.ut401f1fc);
        estrella.setOnClickListener((View) -> {
            fragment.setColor(0x77, 0xFF, 00, 0xFF);
        });
        fragment.addColorChangeListener(
                (int c) -> {
                    ut40a1idtv.setText("Esto vale: " + String.valueOf(c));
                }
        );
    }
}