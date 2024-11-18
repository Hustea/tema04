package com.adrian.tema04.recursividad;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Número de ejemplo
        int n = 5; // Cambia este valor para probar con otros números

        // recursivo y mostrar el resultado
        int suma = sumaDesdeUnoHastaN(n);
        System.out.println("La suma de los números desde 1 hasta " + n + " es: " + suma);
    }

    /**
     * calcular la suma de los números desde 1 hasta n.
     * @param n El número hasta el cual se calculará la suma.
     * @return La suma de todos los números desde 1 hasta n.
     */
    public static int sumaDesdeUnoHastaN(int n) {
        if (n <= 1) {
            return n; // Caso base: si n es 1 o menor, la suma es n
        }

        // Llamada recursiva y suma de n con el resultado para n-1
        return n + sumaDesdeUnoHastaN(n - 1);
    }
}
