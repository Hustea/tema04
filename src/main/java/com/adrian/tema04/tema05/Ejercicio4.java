package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio4 {
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
            int vocales = 0;
            int consonantes = 0;

            // Recorremos cada carácter de la palabra
            for (char letra : palabra.toLowerCase().toCharArray()) {
                // Verificamos si es una vocal o consonante
                if (esVocal(letra)) {
                    vocales++;
                } else if (Character.isLetter(letra)) { // Verifica que sea una letra del alfabeto
                    consonantes++;
                }
            }

            // Imprimimos los resultados para la palabra actual
            System.out.println("Palabra: " + palabra);
            System.out.println("Vocales: " + vocales);
            System.out.println("Consonantes: " + consonantes);
            System.out.println();
        }
    }

    /**
     * Comprueba si la letra es una vocal
     * @param letra la letra en cuastion
     * @return booleano de si es vocal
     */
    public static boolean esVocal(char letra) {
        return "aeiou".indexOf(letra) != -1;
    }
}
