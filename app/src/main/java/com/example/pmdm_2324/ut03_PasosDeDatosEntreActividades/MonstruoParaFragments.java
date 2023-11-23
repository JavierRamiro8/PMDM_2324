package com.example.pmdm_2324.ut03_PasosDeDatosEntreActividades;

import static com.example.pmdm_2324.ut04_Fragments.ut402FragmentMonstruos.MONSTRUOFRAGMENT;

import android.os.Bundle;

import java.io.Serializable;
import java.util.Random;

public class MonstruoParaFragments implements Serializable {
    private static final int NUMEROEXTREMIDADES = 4;
    private String nombre;
    private int extremidades;
    private int brazoIzquierdo;
    private int brazoDerecho;
    private int piernaIzquierda;
    private int piernaDerecha;
    private String color;

    public MonstruoParaFragments(String nombre, int extremidades, String color) {
        this.nombre = nombre;
        this.color = color;
        this.extremidades = extremidades;
        Random random = new Random();
        brazoIzquierdo = random.nextInt(extremidades);
        brazoDerecho = random.nextInt(extremidades - brazoIzquierdo);
        piernaIzquierda = random.nextInt(extremidades - brazoIzquierdo - brazoDerecho);
        piernaDerecha = extremidades - brazoIzquierdo - brazoDerecho - piernaIzquierda;
    }

    @Override
    public String toString() {
        StringBuilder imprimirMonstruo = new StringBuilder();
        imprimirMonstruo.append("El monstruo llamado ").append(nombre).append(" tiene ")
                .append(extremidades).append(" miembros\n");
        imprimirMonstruo.append("  *\n");
        for (int i = 0; i < brazoIzquierdo; i++) {
            imprimirMonstruo.append("/");
        }
        imprimirMonstruo.append("0");
        for (int i = 0; i < brazoDerecho; i++) {
            imprimirMonstruo.append("\\");
        }
        imprimirMonstruo.append("\n");
        for (int i = 0; i < piernaIzquierda; i++) {
            imprimirMonstruo.append("/");
        }
        for (int i = 0; i < piernaDerecha; i++) {
            imprimirMonstruo.append("\\");
        }
        return imprimirMonstruo.toString();
    }

    public String getColor() {
        return color;
    }

    public static MonstruoParaFragments fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (MonstruoParaFragments) bundle.getSerializable(MONSTRUOFRAGMENT);
    }
}

