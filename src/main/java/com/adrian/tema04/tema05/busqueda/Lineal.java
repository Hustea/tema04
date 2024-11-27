package com.adrian.tema04.tema05.busqueda;

import java.util.Random;
import java.util.Scanner;

public class Lineal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANYO_ARRAY = 100;
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 100;

        int[] array = new int[TAMANYO_ARRAY];
        rellenarArray(array,VALOR_MINIMO, VALOR_MAXIMO);

        System.out.println("Inserte el numero que quiere encontrar:");
        int numero = scanner.nextInt();

        int posicion = busquedaLineal(array, numero);

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
     * Encontrar la posicion de un numero en un array
     * @param array el array
     * @param numero el numero a encontrar
     * @return la posicion del numero
     */
    public static int busquedaLineal(int[] array, int numero) {
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == numero){
                posicion = i;
            }

        }
        return posicion;
    }
}