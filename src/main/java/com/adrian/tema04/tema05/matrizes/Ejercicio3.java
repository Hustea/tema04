/*
package com.adrian.tema04.tema05.matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Ficha { O, X, NONE}
    public enum Jugador.java { PLAYER1, PLAYER2 }

    public static final int FILAS = 3;
    public static final int COLUMNAS = 3;

    private static Ficha[][] tablero;
    private static Jugador.java turnoActual;

    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tablero = new Ficha[FILAS][COLUMNAS];

    }

    private static void reset() {
        Random random =new Random();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = null;
            }
        }
        Jugador.java[] ValoresJugador = Jugador.java.values();
        turnoActual = ValoresJugador [random.nextInt(0, ValoresJugador.length)];
    }


    private void play() {
        boolean valido;
        char filas = " ";
        char columnas = " ";

        tableroToString(Ficha[][] tablero)
        System.out.println("Turno de "+ turnoActual+ "(" +getFichaJugador(turnoActual)+ ")");
        System.out.println("Jugada?");
        String posicion = scanner.nextLine().toUpperCase();

        do{
            valido = posicion.length() == 2;
            if(!valido){
                System.err.println("L alongitud de texto debe ser de 2 caracteres");
                continue
            }
            filas = posicion.charAt(0);
            columnas = posicion.charAt(1);

            valido = (filas >= 'A' && filas <= 'C') && (columnas >= '1' && columnas <= '3');

            if(!valido){
                System.err.println("Debe indicar la fila y la columna");
                continue;
            }

            valido = esJugadaValida(filas, Character.getNumericValue(columnas));

            if(!valido){
                System.err.println("Esa posicion ya esta ocupada");
                continue;
            }
        }while(!valido);

         tablero[grtFilaReal(fila), grtColumnaReal(columna)] = getFichaJugador(turnoActual);
    }


    private static int grtFilaReal(char fila){
        return int filaReal = fila - 'A';
    }


    private static int grtColumnaReal(char columna){
        return int columnaReal = columna - 1;
    }


    public boolean esJugadaValida(char fila, int columna) {
        int filaReal = grtFilaReal(fila);
        int columnaReal = grtColumnaReal(columna);
        return tablero[filaReal][columnaReal] == null; //????
    }


    private static Ficha getFichaJugador(Jugador.java jugador){
        Ficha[] fichas = Ficha.values();
        return fichas[jugador.ordinal()];
    }

    private static String tableroToString(Ficha[][] tablero){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < tablero.length; i++){
            sb.append("|---||---||---|\n");
            for(int j = 0; j < tablero[i].length; j++){
                sb.append("| ").append(tablero[i][j] == null ? " " : tablero[i][j]) ;
            }
            sb.append("|\n");
        }
        sb.append("|---||---||---|\n");
        return sb.toString();;
    }

    private static boolean esJugadaGanadora(Ficha[][] tablero, Ficha ficha){
        int contadorHorizontal = 0;
        int contadorVertical = 0;
        int contadorDiagonal1 = 0;
        int contadorDiagonal2 = 0;


        for(int i = 0; i < tablero.length; i++){
            contadorHorizontal = 0;
            contadorVertical = 0;
            contadorDiagonal1 = 0;
            contadorDiagonal2 = 0;

            for(int j = 0; j < tablero[i].length; j++){
                if (tablero[i][j].equals(ficha)){
                    contadorHorizontal++;
                }

                if (tablero[j][i].equals(ficha)){
                    contadorVertical++;
                }

                if (contadorHorizontal = tablero[i].length || contadorVertical = tablero.length) {
                    return true;
                }

                //Comprobamos diagonales
                if(i == j && tablero[i][j].equals(ficha)){
                    contadorDiagonal1++;
                }
                if(j == tablero.length - 1 - i && tablero[i][j].equals(ficha)){
                    return true;
                }

            }
        }
    }


}*/