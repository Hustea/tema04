package com.adrian.tema04.tema05.busqueda;

import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANYO_ARRAY = 100;
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 100;
        final int PRIMERA_POSICION = 0;

        int[] array = new int[TAMANYO_ARRAY];
        rellenarArray(array,VALOR_MINIMO, VALOR_MAXIMO);

        ordenarArray(array);

        System.out.println("Inserte el numero que quiere encontrar:");
        int numero = scanner.nextInt();

        int posicion = busquedaBinaria(array, numero, PRIMERA_POSICION, array.length -1);

        if(posicion == -1){
            System.out.println("El numero no esta en el array");
        }else{
            System.out.println("El numero esta en la posicion "+posicion+" del array");
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
     * Ordenar los elementos de un array
     * @param array el array en cuestion
     * @return el array ordenado
     */
    public static void ordenarArray(int[] array) {
        int aux = 0;
        for (int i = 0; i < array.length -1; i++) {
            for(int j = i+1; j < array.length; j++){
                if (array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }

        }
    }

    /**
     * Encontrar un número en un array usando búsqueda binaria
     * @param array el array en cuestión
     * @param numero el número a encontrar
     * @param min posición más baja
     * @param max posición más alta
     * @return posición del número o -1 si no se encuentra
     */
    public static int busquedaBinaria(int[] array, int numero, int min, int max) {
        if (min > max) {
            return -1;
        }

        int position = (min + max) / 2;

        if (array[position] == numero) {
            return position;
        }else if (array[position] > numero) {
            return busquedaBinaria(array, numero, min, position - 1);
        }else {
            return busquedaBinaria(array, numero, position + 1, max);
        }
    }
}