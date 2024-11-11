package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una frase:");
        String frase = scanner.nextLine();

        System.out.println("Cuantas veces la quieres repetir?");
        int veces = scanner.nextInt();

        for(int i = 1; i <= veces; i++){
            System.out.println(frase);
        }
    }
}
