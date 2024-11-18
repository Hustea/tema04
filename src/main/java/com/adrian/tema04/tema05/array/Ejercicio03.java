package com.adrian.tema04.tema05.array;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int numero;

        for(int i = 0; i < numeros.length; i++ ) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Ingresa el numero "+(i+1)+"/20:");
            numero = scanner.nextInt();
            numeros[i] = numero;
        }
        scanner.close();

        ordenarArrayEnTabla(numeros);

    }

    /**
     * ordenar valores de un array en una tabla
     * @param a el array
     */
    public static void ordenarArrayEnTabla(int[] a) {
        System.out.println("\nNúmeros en una tabla de 4 columnas:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-5d", a[i]);
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
