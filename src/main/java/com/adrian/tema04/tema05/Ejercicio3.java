package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();

        int numeroDePalabras = contarPalabras(texto);
        System.out.println("El número de palabras es: " + numeroDePalabras);

        scanner.close();
    }

    /**
     * Contar la cantidad de palabras que tiene una ferase
     * @param texto la frase en cuestion
     * @return numero de palabras de la frase
     */
    public static int contarPalabras(String texto) {
        // Verificar si el texto es nulo o vacío
        if (texto == null) {
            return 0;
        }

        // Dividimos el texto por espacios en blanco y contamos las partes resultantes
        String[] palabras = texto.split(" ");
        return palabras.length;
    }
}