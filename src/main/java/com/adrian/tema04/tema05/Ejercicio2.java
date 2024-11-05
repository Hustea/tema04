package com.adrian.tema04.tema05;

public class Ejercicio2 {
    /**
     * contara las vocales que hay en el texto
     * @param texto el texto
     * @return devolvera la cantidad de vocales en el texto
     */
    public static int contadorVocales(String texto){
        String bajado = texto.toLowerCase();
        int cuentaVocales = 0;
        char letra;
        char[] array = bajado.toCharArray();
        for (int i = 0; i <= array.length -1; i++){
            letra = array[i];
            switch (letra){
                case 'a','e','i','o','u' -> cuentaVocales++;
            }
        }
        return cuentaVocales;
    }

    /**
     * contara las consonantes que hay en el texto
     * @param texto el texto
     * @return devolvera la cantidad de consonantes en el texto
     */
    public static int contadorConsonantes(String texto){
        String bajado = texto.toLowerCase();
        int cuentaConsonantes = 0;
        char letra;
        char[] array = bajado.toCharArray();
        for (int i = 0; i <= array.length -1; i++){
            letra = array[i];
            switch (letra){
                case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z' -> cuentaConsonantes++;
            }
        }
        return cuentaConsonantes;
    }

    public static void main(String[] args) {
        String texto = "hoLa Que Taleeñs";
        System.out.println("En total hay: " + contadorVocales(texto)+ " vocales, y " +contadorConsonantes(texto) + " consonantes");
    }
}
