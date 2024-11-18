package com.adrian.tema04.recursividad;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejemplo de número
        int numero = 456; // Cambia este valor para probar otros números

        // recursivo y mostrar el resultado
        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
    }

    /**
     * calcular la cantidad de dígitos de un número entero positivo.
     * @param numero El número entero positivo del cual se calcularán los dígitos.
     * @return La cantidad de dígitos del número.
     */
    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1; // Caso base: si el número es menor a 10, tiene un solo dígito
        }

        // Llamada recursiva: dividir entre 10 para eliminar el último dígito
        return 1 + contarDigitos(numero / 10);
    }
}
