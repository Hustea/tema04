package com.adrian.tema04.tema05.array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final double VALOR_MINIMO = 1.30;
        final double VALOR_MAXIMO = 2.40;

        System.out.println("Quantas personas medimos?");
        int tamanyoArray = scanner.nextInt();
        double[] array = new double[tamanyoArray];
        rellenarArray(array, VALOR_MINIMO, VALOR_MAXIMO);


        mediaAlturas(array);
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
     * hacer la media de las alturas de ciertas personas
     * @param array todas las alturas
     */
    public static void mediaAlturas(double[] array) {
        int contador = 0;
        double total = 0;
        for (double numero : array) {
            if(numero >= 1.70){
                contador++;
                total += numero;
            }
        }
        System.out.println("La media de altura de las personas seleccionadas es:");
        System.out.println(total/contador);
        System.out.println("La cantidad de personas que superan la media de 1.70 es:");
        System.out.println(contador);
    }
}
