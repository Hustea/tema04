package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        contarVocalesConsonantesPorPalabra(frase);

        scanner.close();
    }

    /**
     * Cuenta el numero de vocales y consonantes de cada palabra
     * @param frase la frase en cuastion
     */
    public static void contarVocalesConsonantesPorPalabra(String frase) {
        // Dividimos la frase en palabras usando el espacio como delimitador
        String[] palabras = frase.split(" ");

        // Recorremos cada palabra de la frase
        for (String palabra : palabras) {

            // Imprimimos los resultados para la palabra actual
            System.out.printf("%-25s %s\n", palabra+":", palabra.length());
            System.out.println();
        }
    }
}