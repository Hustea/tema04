package com.adrian.tema04.tema05.array;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;

        int[] p = new int[TAMANYO_ARRAY];
        rellenarArray(p);

        int[] s = rellenarArrayConValoresDeDiezOMas(p);

        System.out.println("array P");
        visualizarArray(p);

        System.out.println("array S");
        visualizarArray(s);

    }

    /**
     * Rellenar todos los valores de un array de forma aleatoria
     * @param array el array en cuestion
     */
    public static void rellenarArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio();
        }
    }


    /**
     * asignar valores aleatorios de un array
     * @return valores aleatorios de un array
     */
    public static int aleatorio() {
        Random random = new Random();
        return random.nextInt();
    }


    /**
     * rellenar un array con los valores de otro
     * @param array el array original
     * @return su copia
     */
    public static int[] rellenarArrayConValoresDeDiezOMas(int[] array) {
        int[] s = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if(array[i] > 10){
                s[i] = array[i];
            }else{
                s[i] = -1;
            }
        }
        return s;
    }


    /**
     * Mostrar todos los elmentos de un array
     * @param array el array en cuastion
     */
    public static void visualizarArray(int[] array) {
        System.out.println("Estos sonlos numeros");
        for (int numero : array) {
            System.out.println(numero);
        }
    }
}

