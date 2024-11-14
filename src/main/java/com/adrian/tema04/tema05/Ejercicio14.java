package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        char letra = (char) scanner.nextShort();
        mostrarContadorConSustitucion(numero, letra);
    }

    /**
     * Contador
     * @param numeroASustituir numero que quiero sustituir por una letra
     * @param letra la letra en cuastion
     */
    public static void mostrarContadorConSustitucion(int numeroASustituir, char letra) {
        // Validación del dígito a sustituir (debe estar entre 0 y 9)
        if (numeroASustituir < 0 || numeroASustituir > 9) {
            System.out.println("El número a sustituir debe estar entre 0 y 9.");
            return;
        }

        // Recorre las combinaciones de un contador de 4 dígitos
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        // Generar la secuencia del contador como una cadena de texto
                        String secuencia = String.format("%d-%d-%d-%d", i, j, k, l);

                        // Reemplaza el dígito especificado por la letra
                        String secuenciaConSustitucion = secuencia.replace(Integer.toString(numeroASustituir), Character.toString(letra));

                        // Imprime la secuencia con la sustitución aplicada
                        System.out.println(secuenciaConSustitucion);
                    }
                }
            }
        }
    }
}

