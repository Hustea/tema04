package com.adrian.tema04.recursividad;

public class Ejercicio1 {
    public static void main(String[] args) {
        // recursivo con un ejemplo
        int n = 5; // Cambia este valor para probar con otros números
        System.out.println("Cuenta regresiva desde " + n + ":");
        cuentaRegresiva(n);
    }

    /**
     * imprime una cuenta regresiva desde n hasta 1.
     * @param n El número desde el cual comienza la cuenta regresiva.
     */
    public static void cuentaRegresiva(int n) {
        if (n < 1) {
            return; // Caso base: termina la recursión cuando n es menor que 1
        }

        // Imprime el número actual
        System.out.print(n);

        // Formato: separa por coma si quedan más números, o termina con salto de línea
        if (n > 1) {
            System.out.print(", ");
        } else {
            System.out.println();
        }

        // Llamada recursiva con n - 1
        cuentaRegresiva(n - 1);
    }
}
