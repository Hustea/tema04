package com.adrian.tema04.recursividad;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Ejemplo de entrada
        int n = 5; // Cambia este valor para probar con otros números

        // recursivo y mostrar el resultado
        int factorial = calcularFactorial(n);
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    /**
     *calcular el factorial de un número entero positivo.
     * @param n El número entero positivo.
     * @return El factorial de n.
     */
    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base: el factorial de 0 o 1 es 1
        }

        // Llamada recursiva para calcular el factorial
        return n * calcularFactorial(n - 1);
    }
}
