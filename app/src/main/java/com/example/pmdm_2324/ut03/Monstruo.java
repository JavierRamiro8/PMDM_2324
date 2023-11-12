package com.example.pmdm_2324.ut03;

import java.io.Serializable;
import java.util.Random;

public class Monstruo implements Serializable {
    private String nombre;
    private int extremidades;
    private int brazoIzquierdo;
    private int brazoDerecho;
    private int piernaIzquierda;
    private int piernaDerecha;
    private String color;

    public Monstruo(String nombre, int extremidades, String color) {
        this.nombre = nombre;
        this.color = color;
        this.extremidades=extremidades;

        // Generar aleatoriamente la cantidad de brazos izquierdos
        Random random = new Random();
        this.brazoIzquierdo = random.nextInt(extremidades); // Entre 0 y extremidades

        // Generar aleatoriamente la cantidad de brazos derechos
        this.brazoDerecho = extremidades - brazoIzquierdo;

        // Generar aleatoriamente la cantidad de piernas izquierdas
        this.piernaIzquierda = random.nextInt(extremidades); // Entre 0 y extremidades

        // Generar aleatoriamente la cantidad de piernas derechas
        this.piernaDerecha = extremidades - piernaIzquierda;
    }

    @Override
    public String toString() {
        StringBuilder monstruoAscii = new StringBuilder();

        monstruoAscii.append("El monstruo llamado ").append(nombre).append(" tiene ").append(extremidades).append(" miembros\n");

        int maxBrazos = Math.max(brazoIzquierdo, brazoDerecho);
        int maxPiernas = Math.max(piernaIzquierda, piernaDerecha);
        monstruoAscii.append("  *\n");
        // Dibujar el monstruo con los brazos izquierdos y derechos
        for (int i = 0; i < maxBrazos; i++) {
            if (i < brazoIzquierdo) {
                monstruoAscii.append("/o");
            }
            if (i < brazoDerecho) {
                monstruoAscii.append("\\");
            }
        }
        monstruoAscii.append("\n");
        for (int i = 0; i < maxPiernas; i++) {
            if (i < piernaIzquierda) {
                monstruoAscii.append("/");
            }
            if (i < piernaDerecha) {
                monstruoAscii.append("\\");
            }
        }

        return monstruoAscii.toString();
    }
}


