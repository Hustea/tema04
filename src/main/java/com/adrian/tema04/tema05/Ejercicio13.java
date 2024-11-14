package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int opcion;

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1 -> System.out.println("La palabra más larga es: " + palabraMasLarga());
                case 2 -> System.out.println("La palabra más corta es: " + palabraMasCorta());
                case 3 -> System.out.println("El número de vocales en la palabra es: " + contarVocales());
                case 0 -> System.out.println("Saliendo del programa...");

            }
            System.out.println();
        } while (opcion != 0);
    }

    /**
     * MENU
     * @return opcion
     */
    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Palabra más larga.");
        System.out.println("2. Palabra más corta.");
        System.out.println("3. Número de vocales.");
        System.out.println("------------------------------------");
        System.out.println("0. Salir");
        System.out.print("Introduce opción: ");
        do{
            opcion = scanner.nextInt();
            if(opcion < 0 || opcion > 3){
                System.err.println("Numero incorrecto");
            }
        }while(opcion < 0 || opcion > 3);
        return opcion;
    }

    // Opción 1: Encontrar la palabra más larga entre tres palabras
    public static String palabraMasLarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tres palabras:");
        String palabra1 = scanner.nextLine();
        String palabra2 = scanner.nextLine();
        String palabra3 = scanner.nextLine();

        String palabraLarga = palabra1;
        if (palabra2.length() > palabraLarga.length()) {
            palabraLarga = palabra2;
        }
        if (palabra3.length() > palabraLarga.length()) {
            palabraLarga = palabra3;
        }

        return palabraLarga;

    }

    // Opción 2: Encontrar la palabra más corta entre tres palabras
    public static String palabraMasCorta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tres palabras:");
        String palabra1 = scanner.nextLine();
        String palabra2 = scanner.nextLine();
        String palabra3 = scanner.nextLine();

        String palabraCorta = palabra1;
        if (palabra2.length() < palabraCorta.length()) {
            palabraCorta = palabra2;
        }
        if (palabra3.length() < palabraCorta.length()) {
            palabraCorta = palabra3;
        }

        return palabraCorta;
    }

    // Opción 3: Contar el número de vocales (acentuadas y sin acentuar) en una palabra
    public static int contarVocales() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = scanner.nextLine();

        int contadorVocales = 0;
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.indexOf(palabra.charAt(i)) != -1) {
                contadorVocales++;
            }
        }

        return contadorVocales;
    }
}
