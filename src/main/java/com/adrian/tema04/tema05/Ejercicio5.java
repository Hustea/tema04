package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        
        encontrarPalabraMasLarga(frase);

        scanner.close();
    }

    public static void encontrarPalabraMasLarga(String frase) {
        // Dividimos la frase en palabras usando el espacio como delimitador
        String[] palabras = frase.split(" ");
        String palabraMasLarga = "";
        int longitudMaxima = 0;

        // Recorremos cada palabra de la frase
        for (String palabra : palabras) {
            // Si la palabra actual es más larga que la palabra más larga encontrada hasta ahora
            if (palabra.length() > longitudMaxima) {
                palabraMasLarga = palabra;
                longitudMaxima = palabra.length();
            }
        }

        // Mostramos la palabra más larga y su longitud
        System.out.println("La palabra más larga es: " + palabraMasLarga);
        System.out.println("Número de caracteres: " + longitudMaxima);
    }


}
