package com.adrian.tema04.tema05.array;

import java.util.Random;

public class Ejercicio11 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;

        int[] v = new int[TAMANYO_ARRAY];
        rellenarArray(v);

        int[] p = rellenarArrayConValoresInversos(v);

        System.out.println("array v");
        visualizarArray(v);

        System.out.println("array S");
        visualizarArray(p);

    }

    /**
     * Rellenar todos los valores de un array de forma aleatoria
     * @param array el array en cuestion
     */
    public static void rellenarArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio();
        }
    }


    /**
     * asignar valores aleatorios de un array
     * @return valores aleatorios de un array
     */
    public static int aleatorio() {
        Random random = new Random();
        return random.nextInt();
    }


    /**
     * rellenar un array con los valores de otro
     * @param array el array original
     * @return su copia
     */
    public static int[] rellenarArrayConValoresInversos(int[] array) {
        int[] s = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            s[(array.length - 1) - i] = array[i];
        }
        return s;

    }


    /**
     * Mostrar todos los elmentos de un array
     * @param array el array en cuastion
     */
    public static void visualizarArray(int[] array) {
        System.out.println("Estos son los numeros");
        for (int numero : array) {
            System.out.println(numero);
        }
    }
}
