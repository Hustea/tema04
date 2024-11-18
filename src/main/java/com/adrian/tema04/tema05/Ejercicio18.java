package com.adrian.tema04.tema05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresse su fecha de nacimiento (dd-mm-yyyy):");
        String fechaStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime fechaSalida = LocalDateTime.parse(fechaStr, formatter);
        String fechaNacimiento = String.valueOf(fechaSalida);

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
        // Eliminar caracteres no numéricos para obtener solo los dígitos
        String soloDigitos = fecha.replace("-", "");

        int suma = sumarDigitos(soloDigitos);

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
            suma += Character.getNumericValue(c);
        }

        return suma;
    }
}
