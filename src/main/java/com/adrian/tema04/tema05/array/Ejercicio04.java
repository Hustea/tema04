package com.adrian.tema04.tema05.array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 30;
        final double VALOR_MINIMO = 0;
        final double VALOR_MAXIMO = 10;
        double[] array = new double[TAMANYO_ARRAY];
        rellenarArray(array, VALOR_MINIMO, VALOR_MAXIMO);


        mediaAprobados(array);
        mediaTotal(array);
    }

    /**
     * Rellenar todos los valores de un array de forma aleatoria
     * @param array el array en cuestion
     * @param valorMinimo valor minimo de los datos
     * @param valorMaximo valor maximo de los datos
     */
    public static void rellenarArray(double[] array, double valorMinimo, double valorMaximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio(valorMinimo, valorMaximo);
        }
    }

    /**
     * Asignacion de valores aleatorios
     * @param valorMinimo valor minimo de datos
     * @param valorMaximo valor maximo de los datos
     * @return valor aleatorio
     */
    public static double aleatorio(double valorMinimo, double valorMaximo) {
        Random random = new Random();
        return valorMinimo + random.nextDouble() * (valorMaximo - valorMinimo);
    }

    /**
     * hacer la media de las notas aprobadas
     * @param array todas las notas
     */
    public static void mediaAprobados(double[] array) {
        int contador = 0;
        double total = 0;
        for (double numero : array) {
            if(numero >= 5){
                contador++;
                total += numero;
            }
        }
        System.out.println("La media de los aprobados es:");
        System.out.println(total/contador);
    }

    /**
     * hacer la media de todas las notas
     * @param array las notas
     */
    public static void mediaTotal(double[] array) {
        double total = 0;
        for (double numero : array) {

            total += numero;
        }
        System.out.println("La media de todas las notas es:");
        System.out.println(total/array.length);
    }
}