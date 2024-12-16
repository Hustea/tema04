package com.adrian.tema04.tema05.matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args) {
        final int DECIMALES = 4;
        final int PADDING = 3;
        final int FILAS = 4;
        final int COLUMNAS = 8;
        final int VALOR_MIN = 0;
        final int VALOR_MAX = 10;
        double[][] matriz = crearMatrizAleatoria(FILAS, COLUMNAS, VALOR_MIN, VALOR_MAX);

        System.out.println("Matriz ordenada por filas:");
        System.out.println(matrizToStringFilas(matriz, DECIMALES, PADDING));

        System.out.println("Matriz ordenada por columnas:");
        System.out.println(matrizToStringColumnas(matriz, DECIMALES, PADDING));

        System.out.println("Mayor y Menor:");
        System.out.println(matrizToStringValorMinimoYMaximo(matriz, DECIMALES, PADDING));

        System.out.println("La media de todos los valores de la matriz:");
        System.out.println(matrizToStringMedia(matriz, DECIMALES, PADDING));

        System.out.println("Busquemos el valor que quieras de la matriz:");
        System.out.println(matrizToStringSeleccion(matriz, DECIMALES, PADDING));

        System.out.println("Busquemos la fila que quieras de la matriz:");
        System.out.println(matrizToStringFilasAEleccion(matriz, DECIMALES, PADDING));

        System.out.println("Busquemos la columna que quieras de la matriz:");
        System.out.println(matrizToStringColumnaAEleccion(matriz, DECIMALES, PADDING));

        matrizSumaEnLaColumnaFinal(matriz);

        System.out.println("Matriz ordenada por filas con el nuevo valor:");
        System.out.println(matrizToStringFilas(matriz, DECIMALES, PADDING));


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
    public static String matrizToStringFilas(double[][] matriz, int decimales, int padding) {
        int anchoColumna = determinarLongitudMaxima(matriz, decimales) + padding;
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            sb.append("Fila numero "+(i + 1)+": ");
            for (int j = 0; j < matriz[1].length; j++) {
                sb.append(String.format(formatoDecimales, matriz[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Imprimir las columnas de una matriz
     * @param matriz la matriz
     * @param decimales formato
     * @param padding formato
     * @return string con las columnas
     */
    public static String matrizToStringColumnas(double[][] matriz, int decimales, int padding) {
        int anchoColumna = determinarLongitudMaxima(matriz, decimales) + padding;
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz[1].length; i++) {
            sb.append("Columna numero "+(i + 1)+": ");
            for (int j = 0; j < matriz.length; j++) {
                sb.append(String.format(formatoDecimales, matriz[j][i]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    /**
     * Mostrar el valor maximo y el minimo de la matriz
     * @param matriz la matriz en cuestion
     * @param decimales formato
     * @param padding formato
     * @return String con los valores
     */
    public static String matrizToStringValorMinimoYMaximo(double[][] matriz, int decimales, int padding) {
        double numeroMayor = matriz[0][0];
        double numeroMenos = matriz[0][0];

        int anchoColumna = determinarLongitudMaxima(matriz, decimales) + padding;
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                if(matriz[i][j] > numeroMayor){
                    numeroMayor = matriz[i][j];
                }
                if(matriz[i][j] < numeroMenos){
                    numeroMenos = matriz[i][j];
                }
            }
        }
        sb.append("Mayor numero de la matriz: ");
        sb.append(String.format(formatoDecimales, numeroMayor));
        sb.append("\n");
        sb.append("Menor numero de la matriz: ");
        sb.append(String.format(formatoDecimales, numeroMenos));
        sb.append("\n");
        return sb.toString();
    }

    /**
     * Mostrar la media de valores de una matriz
     * @param matriz la matriz en cuestion
     * @param decimales formato
     * @param padding formato
     * @return String
     */
    public static String matrizToStringMedia(double[][] matriz, int decimales, int padding) {
        int contador = 0;
        double valorTotal = 0;
        double media;
        int anchoColumna = determinarLongitudMaxima(matriz, decimales) + padding;
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                valorTotal += matriz[i][j];
                contador++;
            }
        }
        media = valorTotal / contador;

        sb.append("media: ");
        sb.append(String.format(formatoDecimales, media));
        sb.append("\n");
        return sb.toString();
    }

    /**
     * Elegir una posicion de una matriz y mostrar el valor que la ocupe
     * @param matriz la matriz en cuestion
     * @param decimales formato
     * @param padding formato
     * @return String
     */
    public static String matrizToStringSeleccion(double[][] matriz, int decimales, int padding) {
        Scanner scanner = new Scanner(System.in);
        int columna, fila;
        boolean valido = false;
        int anchoColumna = determinarLongitudMaxima(matriz, decimales) + padding;
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        StringBuilder sb = new StringBuilder();

        do{
            System.out.println("Elige la fila:");
            fila = scanner.nextInt();
            if(fila < 1 || fila > matriz.length){
                System.err.println("El numero escogido es invalido");
            }else{
                valido = true;
            }
        }while(!valido);

        valido = false;

        do{
            System.out.println("Elige la columna:");
            columna = scanner.nextInt();
            if(columna < 1 || columna > matriz[1].length){
                System.err.println("El numero escogido es invalido");
            }else{
                valido = true;
            }
        }while(!valido);

        sb.append("El valor que esta en la fila " +fila+ " y la columna " +columna+ " es: ");
        sb.append(String.format(formatoDecimales, matriz[fila-1][columna-1]));
        sb.append("\n");
        return sb.toString();
    }

    /**
     * Elegir una fila y mostrar los valores
     * @param matriz la matriz en cuestion
     * @param decimales formato
     * @param padding formato
     * @return String
     */
    public static String matrizToStringFilasAEleccion(double[][] matriz, int decimales, int padding) {
        Scanner scanner = new Scanner(System.in);
        int fila;
        boolean valido = false;
        int anchoColumna = determinarLongitudMaxima(matriz, decimales) + padding;
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        StringBuilder sb = new StringBuilder();

        do{
            System.out.println("Elige la fila:");
            fila = scanner.nextInt();
            if(fila < 1 || fila > matriz.length){
                System.err.println("El numero escogido es invalido");
            }else{
                valido = true;
            }
        }while(!valido);

        sb.append("La fila " + fila + ": ");

        for (int i = 0; i < matriz[1].length; i++) {
                sb.append(String.format(formatoDecimales, matriz[fila-1][i]));
        }

        sb.append("\n");
        return sb.toString();
    }

    /**
     * Elegir una columna y mostrar sus valores
     * @param matriz la matriz en cuestion
     * @param decimales formato
     * @param padding formato
     * @return String
     */
    public static String matrizToStringColumnaAEleccion(double[][] matriz, int decimales, int padding) {
        Scanner scanner = new Scanner(System.in);
        int columna;
        boolean valido = false;

        int anchoColumna = determinarLongitudMaxima(matriz, decimales) + padding;
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        StringBuilder sb = new StringBuilder();

        do{
            System.out.println("Elige la columna:");
            columna = scanner.nextInt();
            if(columna < 1 || columna > matriz[1].length){
                System.err.println("El numero escogido es invalido");
            }else{
                valido = true;
            }
        }while(!valido);

        sb.append("La columna " + columna + ": ");

        for (int i = 0; i < matriz.length; i++) {
            sb.append(String.format(formatoDecimales, matriz[i][columna-1]));
        }

        sb.append("\n");
        return sb.toString();
    }

    /**
     * Sumar todos los valores n la columna final de una matriz
     * @param matriz la matriz en cuestion
     */
    public static void matrizSumaEnLaColumnaFinal(double[][] matriz) {
        double valorTotal;

        for (int i = 0; i < matriz.length; i++) {
            valorTotal = 0;
            for (int j = 0; j < (matriz[1].length-1); j++) {
                valorTotal += matriz[i][j];
            }
            matriz[i][matriz[1].length - 1] = valorTotal;
        }

    }
}
