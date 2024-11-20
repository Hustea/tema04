package com.adrian.tema04.tema05.array;

import java.util.Random;

public class Ejercicio08 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        final int VALOR_MINIMO = 5;
        final int VALOR_MAXIMO = 10;
        final int NUMERO_A_ENCONTRAR = 7;

        int[] array = new int[TAMANYO_ARRAY];
        rellenarArray(array, VALOR_MINIMO, VALOR_MAXIMO);

        boolean encontrado = encontrarNumeroEnArray(array, NUMERO_A_ENCONTRAR);

        if (encontrado == true){
            System.out.println("El numero esta en el array");
        }else{
            System.out.println("El numero NO esta en el array");
        }
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
     * encontrar un numero dentro de un array
     * @param array el array en cuestion
     * @param valorAEncontrar el numero que queremos encontrar
     * @return booleano true si se ha encontrado
     */
    public static Boolean encontrarNumeroEnArray(int[] array, int valorAEncontrar) {

        for (int numero : array) {
            if(numero == valorAEncontrar){
                return true;
            }
        }
        return false;
    }
}
