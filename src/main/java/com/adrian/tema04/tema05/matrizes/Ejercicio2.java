package com.adrian.tema04.tema05.matrizes;


import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int VALOR_V =50;
        final int VALOR_P =20;
        int[] V = new int[VALOR_V];
        int[] P = new int[VALOR_P];

        rellenarArray(V);
        rellenarArray(P);
        int[][] M = crearMatrizConArrays(V, P);
        imprimirMatriz(M);

    }

    /**
     * Rellenar un array
     * @param array el array en cuestion
     */
    public static void rellenarArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    /**
     * Crear una matriz con la multiplicacion de dos arrays
     * @param V El primer array
     * @param P El segundo array
     * @return la matriz
     */
    public static int[][] crearMatrizConArrays(int[] V, int[] P){
        int[][] M = new int[V.length][P.length];

        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < P.length; j++) {
                M[i][j] = V[i] * P[j];
            }
        }
        return M;
    }

    /**
     * imprimir una matriz
     * @param M la matriz
     */
    public static void imprimirMatriz(int[][] M){
        System.out.println("Matriz M (V[i] * P[j]):");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }
}






