package com.adrian.tema04.tema05.array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        int[] array = new int[TAMANYO_ARRAY];

        rellenarArray(array);

        menu(array);

    }


    /**
     * generar un menu
     * @param array se usa para las opciones del menu
     */
    public static void menu(int[] array){
        int opcionMenu;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("MENÚ PRINCIPAL");
            System.out.println("==============");
            System.out.println("1.-Rellenar array.");
            System.out.println("2.-Visualizar contenido del array");
            System.out.println("3.-Visualizar contenido par.");
            System.out.println("4.-Visualizar contenido múltiplo de 3");
            System.out.println("0.-Salir del menú.");
            System.out.println("Selecciona una opción:");

            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1 -> rellenarArray(array);
                case 2 -> visualizarArray(array);
                case 3 -> visualizarPares(array);
                case 4 -> visualizarMultiplos3(array);
                case 0 ->{}
                default -> System.err.println("Opcion invalida");
            }

        }while(opcionMenu != 0);
        scanner.close();
    }

    /**
     * Rellenar todos los valores de un array de forma aleatoria entre 0 y 50
     * @param array el array en cuestion
     */
    public static void rellenarArray(int[] array) {
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 50;
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio(VALOR_MINIMO, VALOR_MAXIMO);
        }
    }


    /**
     * Asignacion de valores aleatorios (INT)
     * @param valorMinimo valor minimo de datos
     * @param valorMaximo valor maximo de los datos
     * @return valor aleatorio
     */
    public static int aleatorio(int valorMinimo, int valorMaximo) {
        Random random = new Random();
        return random.nextInt(valorMinimo, valorMaximo + 1);
    }


    /**
     * Mostrar todos los elmentos de un array
     * @param array el array en cuastion
     */
    public static void visualizarArray(int[] array) {
        System.out.println("Estos sonlos numeros del array");
        for (int numero : array) {
            System.out.println(numero);
        }
    }

    /**
     * Mostrar contenido par de un array
     * @param array el array en cuestion
     */
    public static void visualizarPares(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                System.out.println("Posicion: "+ i);
                System.out.println("Numero: "+ array[i]);
                System.out.println();
            }
        }
    }

    /**
     * Mostrar contenido multiple de 3 de un array
     * @param array el array en cuestion
     */
    public static void visualizarMultiplos3(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 3 == 0){
                System.out.println("Posicion: "+ i);
                System.out.println("Numero: "+ array[i]);
                System.out.println();
            }
        }
    }
}
