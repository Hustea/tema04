package com.adrian.tema04.tema05.array;

import java.util.Random;

public class Ejercicio06 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        final int VALOR_MINIMO = 1;
        final int VALOR_MAXIMO = 10;

        int[] array1 = new int[TAMANYO_ARRAY];
        int[] array2 = new int[TAMANYO_ARRAY];

        rellenarArray(array1, VALOR_MINIMO, VALOR_MAXIMO);
        rellenarArray(array2, VALOR_MINIMO, VALOR_MAXIMO);


        //El ejeercicio no dice que hagamos nada con estos arrays
        int[] suma = rellenarArrayConSumas(array1, array2);
        double[] division = rellenarArrayConDivision(array1, array2);
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
     * Rellenar un array con las sumas de otros dos
     * @param array1 el primer array
     * @param array2 el segundo array
     * @return un array nuevo con la suma de los dos
     */
    public static int[] rellenarArrayConSumas(int[] array1, int[] array2) {
        if(array1.length != array2.length) {
            return null;
        }

        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        return array3;
    }

    /**
     * Rellenar un array con las divisiones de otros dos
     * @param array1 el primer array
     * @param array2 el segundo array
     * @return un array nuevo con la division de los dos
     */
    public static double[] rellenarArrayConDivision(int[] array1, int[] array2) {
        if(array1.length != array2.length) {
            return null;
        }

        double[] array3 = new double[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = (double) array1[i] + array2[i];
        }

        return array3;
    }
}
