package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nif;

        System.out.println("Ingrese su NIF con la letra en mayuscula y sin espacios:");
        nif = scanner.nextLine();

        boolean validar = (validarNIF(nif.trim()));
        if(validar == true){
            System.out.println("Su NIF es valido");
        }else{
            System.out.println("Su NIF no es valido");
        }
    }


    public static boolean validarNIF(String nif) {

        int dni = Integer.parseInt(nif.substring(0, 8));
        String nif2 = calcularNIF(dni);

        if(nif.equals(nif2)){
            return true;
        }else{
            return false;
        }
    }

    public static String calcularNIF(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int resto = dni % 23;

        char letra = letras.charAt(resto);

        String nif = dni +""+ letra;

        return nif;
    }
}


