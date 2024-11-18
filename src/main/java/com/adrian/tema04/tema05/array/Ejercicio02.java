package com.adrian.tema04.tema05.array;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];
        char caracter;
        int par = 1;
        int impar = 2;

        for(int i = 0; i < caracteres.length; i++ ) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Ingresa el caracter "+(i+1)+"/10:");
            caracter = scanner.next().charAt(0);
            caracteres[i] = caracter;
        }
        scanner.close();

        System.out.println("Caracteres en posicion par:");
        mostrarParImparDeArray(caracteres, par);

        System.out.println("Caracteres en posicion impar:");
        mostrarParImparDeArray(caracteres, impar);
    }

    /**
     * Ordenar caracteres en su posicion en un array
     * @param a array de caracter
     * @param x par o impar
     */
    public static void mostrarParImparDeArray(char[] a, int x) {
        StringBuilder secuenciaDeCaracteres = new StringBuilder("");
        for(int i = 0; i < a.length; i++ ) {

            if( (i+ x) % 2 == 0 ) {
                secuenciaDeCaracteres.append(a[i]+", ");
            }
        }
        System.out.println(secuenciaDeCaracteres);
    }
}
