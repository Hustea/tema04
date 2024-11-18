package com.adrian.tema04.tema05.array;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int numero;

        for(int i = 0; i < numeros.length; i++ ) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Ingresa el numero "+(i+1)+"/10:");
            numero = scanner.nextInt();
            numeros[i] = numero;
        }
        scanner.close();

        mostrarValoresDeUnArray(numeros);
        mostrarMediaDeUnArray(numeros);
    }

    /**
     * Imprimir todos los valores del array
     * @param a el array
     */
    public static void mostrarValoresDeUnArray(int[] a) {
        for(int i = 0; i < a.length; i++ ) {

            System.out.println( a[i]+"   "+(i+1)+"/10:");
        }
    }

    /**
     * Imprimir la media de los valores del array
     * @param a el array
     */
    public static void mostrarMediaDeUnArray(int[] a) {
        float suma = 0;
        float media;

        for(int i = 0; i < a.length; i++ ) {

            suma = suma + a[i];
        }

        media = suma/a.length;

        System.out.println("La media es: " + media);
    }
}
