package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        separarPalabra(frase);

        scanner.close();
    }

    /**
     * Separa las palabras de una frase
     * @param frase la frase en cuastion
     */
    public static void separarPalabra(String frase) {
        // Dividimos la frase en palabras usando el espacio como delimitador
        String[] palabras = frase.split(" ");

        // Recorremos cada palabra de la frase
        for (String palabra : palabras) {

            // Imprimimos los resultados para la palabra actual
            System.out.println(palabra);
            System.out.println();
        }
    }
}
