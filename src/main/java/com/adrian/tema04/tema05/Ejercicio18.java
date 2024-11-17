package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento al usuario
        System.out.println("Introduce tu fecha de nacimiento en formato dd-mm-aaaa:");
        String fechaNacimiento = scanner.nextLine();

        // Calcular y mostrar el lucky number
        int luckyNumber = calcularLuckyNumber(fechaNacimiento);
        System.out.println("Tu número de la suerte es: " + luckyNumber);

        scanner.close();
    }

    /**
     * calcular el lucky number.
     * @param fecha La fecha de nacimiento en formato dd-mm-aaaa.
     * @return El número de la suerte como un entero de un solo dígito.
     */
    public static int calcularLuckyNumber(String fecha) {
        // Eliminar caracteres no numéricos (guiones) para obtener solo los dígitos
        String soloDigitos = fecha.replace("-", "");

        // Sumar los dígitos de la cadena
        int suma = sumarDigitos(soloDigitos);

        // Reducir la suma a un solo dígito
        while (suma >= 10) {
            suma = sumarDigitos(String.valueOf(suma));
        }

        return suma;
    }

    /**
     *sumar los dígitos de una cadena.
     * @param cadena Una cadena que contiene solo dígitos.
     * @return La suma de todos los dígitos en la cadena.
     */
    public static int sumarDigitos(String cadena) {
        int suma = 0;

        for (char c : cadena.toCharArray()) {
            // Convertir cada carácter a su valor numérico
            suma += Character.getNumericValue(c);
        }

        return suma;
    }
}
