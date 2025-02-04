package navidad.arrays;

import java.util.Random;

public class Ejercicio03 {
    enum Nota {
        DO, DOs, RE, REs, MI, FA, FAs, SOL, SOLs, LA, LAs, SI
    }
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 50;
        final int VALOR_MINIMO = 1;
        final int VALOR_MAXIMO = 4;

        int[] v = new int[TAMANYO_ARRAY];
        rellenarArray(v,VALOR_MINIMO, VALOR_MAXIMO);

        Nota[] notas = new Nota[TAMANYO_ARRAY];
        llenarArrayConNotasAleatorias(notas);

        System.out.println("La partitura");
        visualizarArrayEntero(v, notas);
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
     * Rellenar array con enumerado
     * @param array el array
     */
    public static void llenarArrayConNotasAleatorias(Nota[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int indiceAleatorio = random.nextInt(Nota.values().length);
            array[i] = Nota.values()[indiceAleatorio];
        }
    }

    /**
     * Mostrar todos los elmentos de un array (entero)
     * @param array el array en cuastion
     */
    public static void visualizarArrayEntero(int[] array, Nota[] nota) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("["+nota[i]+"."+array[i]+"] a");

        }
    }
}