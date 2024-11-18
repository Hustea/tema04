package com.adrian.tema04.recursividad;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Ejemplo de entrada
        int a = 2; // Base
        int b = 3; // Exponente

        // recursivo y mostrar el resultado
        int resultado = calcularPotencia(a, b);
        System.out.println(a + " elevado a la potencia " + b + " es: " + resultado);
    }

    /**
     * calcular a^b (a elevado a la potencia b).
     * @param a La base (un número entero).
     * @param b El exponente (un número entero no negativo).
     * @return El resultado de a^b.
     */
    public static int calcularPotencia(int a, int b) {
        if (b == 0) {
            return 1; // Caso base: cualquier número elevado a 0 es 1
        }

        // Llamada recursiva para multiplicar la base por el resultado de a^(b-1)
        return a * calcularPotencia(a, b - 1);
    }
}
