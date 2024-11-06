package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        System.out.println(subirInicial(texto));
    }

    public static String subirInicial(String texto){
        char letra = texto.charAt(0);
        String subir = String.valueOf(letra);
        String subido = subir.toUpperCase();
        String sobrante = texto.substring(1);
        return subido.concat(sobrante);
    }

}