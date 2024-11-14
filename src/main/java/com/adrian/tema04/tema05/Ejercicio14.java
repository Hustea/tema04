package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        char letra;

        do{
            System.out.println("¿Que numero desea substituir?");
            numero = scanner.nextInt();
            if(numero < 0 || numero > 9){
                System.err.println("Digito, invalido");
            }
        }while (numero < 0 || numero > 9);

        System.out.println("¿por que caracter");
        letra = (char) scanner.nextShort();

        scanner.close();

        mostrarContadorConSustitucion(numero, letra);
    }

    /**
     * Contador
     * @param numeroASustituir numero que quiero sustituir por una letra
     * @param letra la letra en cuastion
     */
    public static void mostrarContadorConSustitucion(int numeroASustituir, char letra) {
        Scanner scanner = new Scanner(System.in);
        int tramite;

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

                        tramite = scanner.nextInt();
                    }
                }
            }
        }
        scanner.close();
    }
}

