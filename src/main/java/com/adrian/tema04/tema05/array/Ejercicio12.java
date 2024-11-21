package com.adrian.tema04.tema05.array;

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 50;
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 10;

        int[] v = new int[TAMANYO_ARRAY];
        rellenarArray(v,VALOR_MINIMO, VALOR_MAXIMO);

        int[] p = rellenarArrayFactorial(v);

        System.out.println("array V");
        visualizarArrayEntero(v);

        System.out.println("array P");
        visualizarArrayEntero(p);

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
     * Asignacion de valores aleatorios (INT)
     * @param valorMinimo valor minimo de datos
     * @param valorMaximo valor maximo de los datos
     * @return valor aleatorio
     */
    public static int aleatorio(int valorMinimo, int valorMaximo) {
        Random random = new Random();
        return random.nextInt(valorMinimo, valorMaximo + 1);
    }


    /**
     * rellenar un array con los valores de otro
     * @param array el array original
     * @return su copia
     */
    public static int[] rellenarArrayFactorial(int[] array) {
        int[] s = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            s[i] = calcularArrayFactorial(array, i);

        }
        return s;
    }


    /**
     * factoriza numero con posicion de array
     * @param array el array en cuesstion
     * @param posicion la posicion
     * @return
     */
    public static int calcularArrayFactorial(int[] array, int posicion) {
        int numero = 0;
        for (int i = 0; i < posicion; i++) {

            numero += array[i];

        }
        return numero;
    }


    /**
     * Mostrar todos los elmentos de un array (entero)
     * @param array el array en cuastion
     */
    public static void visualizarArrayEntero(int[] array) {
        System.out.println("Estos sonlos numeros");
        for (int numero : array) {
            System.out.println(numero);
        }
    }
}

