package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        int dni = solicitarDNI();
        System.out.println(calcularNIF(dni));

    }

    /**
     * Pedir y validar wl numweo del DNI
     * @returnNumero de DNI validado
     */
    public static int solicitarDNI() {
        Scanner scanner = new Scanner(System.in);
        int dni;

        do{
            System.out.println("Ingresa el numero de tu DNI:");
            dni = scanner.nextInt();

            if(dni < 10000000 || dni > 99999999){
                System.err.println("Numero invalido");
            }

        }while(dni < 10000000 || dni > 99999999);

        scanner.close();

        return dni;
    }

    /**
     * Calcular la letra del NIF
     * @param dni Los numeros del DNI
     * @return El NIF
     */
    public static String calcularNIF(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int resto = dni % 23;

        char letra = letras.charAt(resto);

        String nif = dni + " " + letra;

        return nif;
    }
}

