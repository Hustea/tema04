package com.adrian.tema04.tema05.array;

import java.util.Random;

public class Ejercicio07 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 100;
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 100;

        int[] array = new int[TAMANYO_ARRAY];
        rellenarArray(array, VALOR_MINIMO, VALOR_MAXIMO);

        multiplesDeCincoEnArray(array);
        multiplesDeDiezEnArray(array);
        cantidadDeCerosEnArray(array);
    }


    /**
     * Rellenar todos los valores de un array de forma aleatoria
     * @param array el array en cuestion
     * @param valorMinimo valor minimo de los datos
     * @param valorMaximo valor maximo de los datos
     */
    public static void rellenarArray(int[] array, int valorMinimo, int valorMaximo) {
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
    public static int aleatorio(int valorMinimo, int valorMaximo) {
        Random random = new Random();
        return valorMinimo + random.nextInt() * (valorMaximo - valorMinimo);
    }


    /**
     * Imprimir todos los numeros multiples por 5 en un array
     * @param array el array en cuestion
     */
    public static void multiplesDeCincoEnArray(int[] array) {

        System.out.println("Los multiples de 5 en este array son:");
        for (int numero : array) {
            if(numero % 5 == 0){
                System.out.println(numero);
            }
        }
    }


    /**
     * Imprimir todos los numeros multiples por 10 en un array
     * @param array el array en cuestion
     */
    public static void multiplesDeDiezEnArray(int[] array) {

        System.out.println("Los multiples de 10 en este array son:");
        for (int numero : array) {
            if(numero % 10 == 0){
                System.out.println(numero);
            }
        }
    }


    /**
     * Imprimir la cantidad de veces que se repite 0 en  un array
     * @param array el array en cuestion
     */
    public static void cantidadDeCerosEnArray(int[] array) {
        int contador = 0;

        System.out.println("La cantidad de 0 en en este array son:");
        for (int numero : array) {
            if(numero == 0){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
