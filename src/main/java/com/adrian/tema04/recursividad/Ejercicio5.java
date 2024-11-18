package com.adrian.tema04.recursividad;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Ejemplo de entrada
        int n = 7; // Cambia este valor para probar otros términos de la sucesión

        // recursivo y mostrar el resultado
        int fibonacci = fibonacciRecursivo(n);
        System.out.println("El término " + n + " de la sucesión de Fibonacci es: " + fibonacci);
    }

    /**
     * calcular el n-ésimo número de la sucesión de Fibonacci.
     * @param n La posición en la sucesión (n ≥ 0).
     * @return El número de Fibonacci en la posición n.
     */
    public static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0; // Caso base 1: el primer número de Fibonacci es 0
        }
        if (n == 1) {
            return 1; // Caso base 2: el segundo número de Fibonacci es 1
        }

        // Llamadas recursivas para calcular los dos términos anteriores
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}
