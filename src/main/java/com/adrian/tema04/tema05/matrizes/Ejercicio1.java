
package com.adrian.tema04.tema05.matrizes;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>Tema 5 Arrays</p>
 * <p>Ejercicio 1. Simplemente una matriz</p>
 * <p>
 * Crea un programa permita al usuario introducir los valores de una matriz y al finalizar muestre los
 * datos introducidos en formato tabla. Para ello sigue los siguientes pasos:
 * a) Solicita al usuario el número de filas y columnas que debe tener la matriz.
 * b) Crea una matriz del tamaño indicado por el usuario.
 * c) Solicita al usuario los valores de la matriz iterando sobre cada uno de los elementos. Indica la
 * fila y columna actual para que el usuario sepa qué dato le estamos pidiendo.
 * d) Muestra los valores de la matriz en formato tabla.
 * </p>
 * <p>License: 🅮 Public Domain</p>
 *
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.3, 2024-11-27
 * @since 0.1
 **/
public class Ejercicio1 {

    public static void main(String[]args) {
        final int DECIMALES = 4;
        final int PADDING = 3;
        double[][] matriz = solicitarMatriz();
        // Para hacer pruebas rápidas sobre matrices he definido el método crearMatrizAleatoria
        // double[][] matriz = crearMatrizAleatoria(3, 3, 0, 10);
        System.out.println(matrizToString(matriz, DECIMALES, PADDING));
    }

    /**
     * Solicita al usuario los datos de una matriz (filas, columnas y sus valores) y la devuelve
     * @return La matriz generada por el usuario
     */
    public static double[][] solicitarMatriz() {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz;
        System.out.println("Indica el número de filas de la matriz");
        int filas = scanner.nextInt();
        System.out.println("Indica el número de columnas de la matriz");
        int columnas = scanner.nextInt();
        matriz = new double[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz[%d][%d]?\n", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }
        return matriz;
    }

    /**
     * Genera una matriz de valores aleatorios con las características indicadas en los parámetros
     * @param filas Número de filas de la matriz
     * @param columnas Número de columnas de la matriz
     * @param valorMinimo Valor mínimo a generar
     * @param valorMaximo Valor máximo a generar
     * @return La matriz de valores aleatorios generada
     */
    public static double[][] crearMatrizAleatoria(int filas, int columnas, double valorMinimo, double valorMaximo) {
        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio(valorMinimo, valorMaximo);
            }
        }
        return matriz;
    }

    /**
     * Genera un número aleatorio de tipo double entre valorMinimo y valorMaximo (ambos incluidos)
     * @param valorMinimo Valor mínimo a generar
     * @param valorMaximo Valor máximo a generar
     * @return El número aleatorio generado
     */
    public static double aleatorio(double valorMinimo, double valorMaximo) {
        Random random = new Random();
        return valorMinimo + random.nextDouble() * (valorMaximo - valorMinimo);
    }


    /**
     * Determina la longitud máxima, expresada en número de caracteres, de los elementos de la matriz.
     * Útil para saber el tamaño mínimo que deberá tener cada columna al imprimir un array en columnas
     * @param matriz Matriz sobre la que determinar la longitud máxima de sus valores
     * @param decimales Número de decimales con los que se expresará cada elemento
     * @return La longitud máxima expresada como número de caracteres
     */
    public static int determinarLongitudMaxima(double[][] matriz, int decimales) {
        int longitudMaxima = 0;
        String formato = "%." + decimales + "f";
        for (double[] fila : matriz) {
            for (double numero : fila) {
                int longitudActual = String.format(formato, numero).length();
                if (longitudMaxima < longitudActual) {
                    longitudMaxima = longitudActual;
                }
            }
        }
        return longitudMaxima;
    }

    /**
     * Obtiene la representación de la matriz como una cadena de texto con la cantidad de decimales indicada
     * y con una distancia entre las columnas igual al valor asignado a padding.
     *
     * @param matriz Matriz que se quiere representar como texto
     * @param decimales Cantidad de decimales que se mostrarán
     * @param padding Espaciado entre columnas
     * @return Representación de la matriz como texto
     */

    public static String matrizToString(double[][] matriz, int decimales, int padding) {
        int anchoColumna = determinarLongitudMaxima(matriz, decimales) + padding;
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        StringBuilder sb = new StringBuilder();
        for (double[] fila : matriz) {
            for (double valor : fila) {
                sb.append(String.format(formatoDecimales, valor));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Obtiene la representación de la matriz como una cadena de texto con la cantidad de decimales indicada
     * y con una distancia entre las columnas igual a 3.
     *
     * @param matriz Matriz que se quiere representar como texto
     * @param decimales Cantidad de decimales que se mostrarán
     * @return Representación de la matriz como texto
     */
    public static String matrizToString(double[][] matriz, int decimales) {
        return matrizToString(matriz, decimales, 3);
    }

    /**
     * Obtiene la representación de la matriz como una cadena de texto con 2 decimales indicada
     * y con una distancia entre las columnas igual a 3.
     *
     * @param matriz Matriz que se quiere representar como texto
     * @return Representación de la matriz como texto
     */
    public static String matrizToString(double[][] matriz) {
        return matrizToString(matriz, 2);
    }
}

