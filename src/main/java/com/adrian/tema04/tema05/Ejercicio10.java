package com.adrian.tema04.tema05;

public class Ejercicio10 {
    public static void main(String[] args) {
        String palabra = "reconocer";
        boolean esPalindroma = esPalindromo(palabra);
        System.out.println("¿Es palíndroma la palabra '" + palabra + "'? " + esPalindroma);
    }

    /**
     * Verificar si una palabra es palindroma
     * @param palabra la palabra e cuastion
     * @return booleano de confirmacion de palindromo
     */
    public static boolean esPalindromo(String palabra) {
        int inicio = 0;
        int fin = palabra.length() - 1;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }
}
