package navidad.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 50;
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 10;

        int[] array = new int[TAMANYO_ARRAY];
        rellenarArray(array,VALOR_MINIMO, VALOR_MAXIMO);

        System.out.println("Vamos a intercambiar 2 valores de este array");
        System.out.println("array V");
        visualizarArrayEntero(array);

        System.out.println("Introduzca la posicion del primer valor");
        int a = validarSeleccion(TAMANYO_ARRAY);

        System.out.println("Introduce ahora la posicion del valor con el que lo quieres intercambiar");
        int b = validarSeleccion(TAMANYO_ARRAY);

        cambiarValoresArray(array, a, b);
        visualizarArrayEntero(array);


    }


    /**
     * Rellenar todos los valores de un array de forma aleatoria
     * @param array el array en cuestion
     * @param valorMinimo valor minimo de los datos
     * @param valorMaximo valor maximo de los datos
     */
    public static void rellenarArray(int[] array, int valorMinimo, int valorMaximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio(valorMinimo, valorMaximo);
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
     * Vlida que el numero seleccionado sea una posicion valida del array
     * @param tamanyo el tamaño del array
     * @return la posicion validada
     */
    public static int validarSeleccion(int tamanyo) {
        Scanner scanner = new Scanner(System.in);
        int posicion;

        do{
            System.out.println("Ingrese un numero entre 0 y " + (tamanyo-1));
            posicion = scanner.nextInt();
            if(posicion < 0 | posicion >= tamanyo){
                System.err.println("El numero introducido no es valido");
            }
        }while(posicion < 0 | posicion >= tamanyo);

        return posicion;
    }


    /**
     * Intercambia dos posiciones en un array
     * @param array el array en cuestion
     * @param a la primera posicion
     * @param b la segunda posicion
     */
    public static void cambiarValoresArray(int[] array, int a, int b) {

        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }


    /**
     * Mostrar todos los elmentos de un array (entero)
     * @param array el array en cuastion
     */
    public static void visualizarArrayEntero(int[] array) {
        System.out.println("Estos sonlos numeros");
        for (int i = 0; i < array.length; i++) {
            System.out.println("["+i+". "+array[i]+"]");
        }
    }
}
