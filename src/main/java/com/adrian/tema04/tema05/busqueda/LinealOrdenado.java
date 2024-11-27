package com.adrian.tema04.tema05.busqueda;

import java.util.Random;
import java.util.Scanner;

public class LinealOrdenado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANYO_ARRAY = 100;
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 100;

        int[] array = new int[TAMANYO_ARRAY];
        rellenarArray(array,VALOR_MINIMO, VALOR_MAXIMO);

        array = ordenarArray(array);

        System.out.println("Inserte el numero que quiere encontrar:");
        int numero = scanner.nextInt();

        int posicion = busquedaLinealOrdenada(array, numero);

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
    public static int[] ordenarArray(int[] array) {
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
        return array;
    }


    /**
     * Encontrar la posicion de un numero en un array
     * @param array el array
     * @param numero el numero a encontrar
     * @return la posicion del numero
     */
    public static int busquedaLinealOrdenada(int[] array, int numero) {
        int posicion = -1;
        for (int i = 0; i < array.length && array[i] <= numero; i++) {
            if(array[i] == numero){
                posicion = i;
            }

        }
        return posicion;
    }
}