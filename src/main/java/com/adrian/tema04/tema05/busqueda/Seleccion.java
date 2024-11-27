package com.adrian.tema04.tema05.busqueda;

import java.util.Random;

public class Seleccion {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 100;
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 100;

        int[] array = new int[TAMANYO_ARRAY];
        rellenarArray(array, VALOR_MINIMO, VALOR_MAXIMO);

        ordenarArraySelection(array);

        imprimirArray(array);
    }


    /**
     * Rellenar todos los valores de un array de forma aleatoria
     *
     * @param array       el array en cuestion
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
     *
     * @param valorMinimo valor minimo de datos
     * @param valorMaximo valor maximo de los datos
     * @return valor aleatorio
     */
    public static int aleatorio(int valorMinimo, int valorMaximo) {
        Random random = new Random();
        return random.nextInt(valorMinimo, valorMaximo + 1);
    }


    public static void ordenarArraySelection(int[] array) {
        int n = array.length;

        // Recorremos el array
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento más pequeño en la parte no ordenada
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Actualizamos el índice del mínimo
                }
            }

            // Intercambiamos el elemento más pequeño con el primer elemento de la parte no ordenada
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}