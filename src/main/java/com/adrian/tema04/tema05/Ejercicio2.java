package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        System.out.println("En total hay: " + contadorVocales(texto)+ " vocales, y " +contadorConsonantes(texto) + " consonantes");
    }

    /**
     * contara las vocales que hay en el texto
     * @param texto el texto
     * @return la cantidad de vocales en el texto
     */
    public static int contadorVocales(String texto){
        String bajado = texto.toLowerCase();
        int vocales = 0;
        char letra;
        char[] array = bajado.toCharArray();
        for (int i = 0; i <= array.length -1; i++){
            letra = array[i];
            switch (letra){
                case 'a','e','i','o','u' -> vocales++;
            }
        }
        return vocales;
    }

    /**
     * contara las consonantes que hay en el texto
     * @param texto el texto
     * @return la cantidad de consonantes en el texto
     */
    public static int contadorConsonantes(String texto){
        String bajado = texto.toLowerCase();
        int consonantes = 0;
        char letra;
        char[] array = bajado.toCharArray();
        for (int i = 0; i <= array.length -1; i++){
            letra = array[i];
            switch (letra){
                case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z' -> consonantes++;
            }
        }
        return consonantes;
    }
}
