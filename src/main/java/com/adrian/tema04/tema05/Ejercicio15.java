package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el ancho del rectángulo: ");
        int ancho = scanner.nextInt();

        System.out.print("Introduce el alto del rectángulo: ");
        int alto = scanner.nextInt();

        System.out.print("Introduce el carácter para dibujar el rectángulo: ");
        char caracter = scanner.next().charAt(0);

        rectangulo(ancho, alto, caracter);

        scanner.close();
    }

    /**
     * Hacer el dibujo de una tabla
     * @param ancho de la tabla
     * @param alto de la tabla
     * @param caracter
     */
    public static void rectangulo(int ancho, int alto, char caracter) {

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
