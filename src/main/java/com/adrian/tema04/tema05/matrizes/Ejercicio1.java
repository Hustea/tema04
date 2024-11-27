package com.adrian.tema04.tema05.matrizes;

import java.util.Scanner;

public class Ejercicio1 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        float[][] matriz = crearMatriz();
        rellenarMatriz(matriz);

        String resultado = stringDeMatriz(matriz);
        System.out.println(resultado);
    }

    /**
     * Crear una matriz
     * @return la matriz
     */
    public static float[][] crearMatriz(){
        System.out.println("Cuantas filas quieres que tenga la matriz?:");
        int filas = scanner.nextInt();

        System.out.println("Cuantas coolumnas quieres que tenga la matriz?:");
        int columnas = scanner.nextInt();

        float[][] matriz = new float[filas][columnas];

        return matriz;
    }

    /**
     * Rellenar una matriz
     * @param matriz la matriz en cuestion
     */
    public static void rellenarMatriz(float[][] matriz){
        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz[1].length; j++){
                System.out.println("Dato de la fila "+(i+1)+"/"+matriz[0].length+" y la columna "+(j+1)+"/"+matriz[1].length+":");
                matriz[i][j] = scanner.nextFloat();
            }
        }
    }

    /**
     * devolverl el valor de una matriz en formato string
     * @param matriz la matriz encuestion
     * @return el string con los valores
     */
    public static String stringDeMatriz(float[][] matriz) {
        StringBuilder resultado = new StringBuilder();

        for (float[] fila : matriz) {
            for (float valor : fila) {
                String valorFormateado = String.format("%.4f", valor);
                resultado.append(valorFormateado).append("\t");
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }
}

