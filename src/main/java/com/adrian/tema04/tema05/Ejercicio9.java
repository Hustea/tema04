package com.adrian.tema04.tema05;

public class Ejercicio9 {
    public static void main(String[] args) {
        String frase = "Este es un ejemplo de prueba";
        String resultado = obtenerCaracteresImpares(frase);
        System.out.println("Frase original: " + frase);
        System.out.println("Frase con caracteres en posiciones impares: " + resultado);
    }

    /**
     * Dada una frase devolver la misma pero solo las letras en posicion impar
     * @param frase la fraseen cuestions
     * @return solo las letras en posicion impar
     */
    public static String obtenerCaracteresImpares(String frase) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i < frase.length(); i += 2) {
            resultado.append(frase.charAt(i));
        }

        return resultado.toString();
    }
}
