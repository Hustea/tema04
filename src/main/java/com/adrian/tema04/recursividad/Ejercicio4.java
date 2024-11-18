package com.adrian.tema04.recursividad;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ejemplo de número
        int numero = 456; // Cambia este valor para probar otros números

        // recursivo y mostrar el resultado
        int suma = sumarDigitos(numero);
        System.out.println("La suma de los dígitos del número " + numero + " es: " + suma);
    }

    /**
     * calcular la suma de los dígitos de un número entero positivo.
     * @param numero El número entero positivo.
     * @return La suma de todos los dígitos del número.
     */
    public static int sumarDigitos(int numero) {
        if (numero == 0) {
            return 0; // Caso base: si el número es 0, la suma es 0
        }

        // Separar el último dígito y sumar recursivamente
        return (numero % 10) + sumarDigitos(numero / 10);
    }
}
