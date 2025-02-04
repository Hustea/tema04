/*
package com.adrian.tema04.tema05.matrizes;

import java.util.Random;

public class Ejercicio5 {
    public enum Celda{
        VACIA(Config.SPRITE_VACIA),
        NPC(Config.SPRITE_NPC),
        OBSTACULO(Config.SPRITE_OBSTACULO),
        TESORO(Config.SPRITE_TESORO),
        JUGADOR(Config.SPRITE_JUGADOR),
        ESCAVADA(Config.SPRITE_EXCAVADA),
        HABILIDAD(Config.SPRITE_HABILIDAD);

        private String sprite;
        Celda(String sprite){
            this.sprite = sprite;
        }

        @Override
        public String toString(){
            return sprite;
        }


    }




    private  static Random random;
    private static Celda[][] mapa;
    private static Posicion[] posicionesLibres;
    private static int cantidadPosicionesLibres;




    public static void main(String[]args) {
        mapa = new Celda[Config.FILAS][Config.COLUMNAS];
        random = new Random();

        cantidadPosicionesLibres = Config.FILAS * Config.COLUMNAS;
        posicionesLibres = new Posicion[cantidadPosicionesLibres];

        generarMapa();
        System.out.println(mapaToString(mapa));

    }

    public void reset(){
        
    }


    public static void generarMapa(){
        Celda[] celda = Celda.values();
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa.length; j++){

                int indiceAleatorio = random.nextInt(celda.length);
                mapa[i][j] = celda[indiceAleatorio];
            }
        }
    }


    public static String mapaToString(Celda[][] mapa){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa.length; j++){

                sb.append(Celda);
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static class Posicion {
        private int fila;
        private int columnas;

        public Posicion(int fila, int columna){
            this.fila = fila;
            this.columnas = columna;
        }
    }


}
*/