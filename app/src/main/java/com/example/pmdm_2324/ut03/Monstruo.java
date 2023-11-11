    package com.example.pmdm_2324.ut03;

    import java.io.Serializable;
    import java.util.Random;

    public class Monstruo implements Serializable {
        private String nombre;
        private int numeroExtremidades;
        private String color;

        public Monstruo(String nombre, int numeroExtremidades, String color) {
            this.nombre = nombre;
            this.numeroExtremidades = numeroExtremidades;
            this.color = color;
        }

        private String generarPiernasYManos() {
            String monstruo = "";

            Random random = new Random();

            for (int i = 0; i < numeroExtremidades; i++) {
                monstruo += "  *\n";

                int manos = random.nextInt(Math.max(numeroExtremidades, 1)) - 1 + 1;
                int piernas = numeroExtremidades - manos;

                if (piernas <= 0) {
                    manos = numeroExtremidades;
                    piernas = 1;
                }

                for (int j = 0; j < manos; j++) {
                    monstruo += "/ ";
                }
                monstruo += "\n";
                for (int j = 0; j < piernas; j++) {
                    monstruo += "\\ ";
                }
                monstruo += "\n";
            }

            return monstruo;
        }


        @Override
        public String toString() {
            return generarPiernasYManos();
        }
    }
