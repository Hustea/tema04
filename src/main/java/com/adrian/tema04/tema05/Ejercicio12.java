package com.adrian.tema04.tema05;

public class Ejercicio12 {
    public static void main(String[] args) {
        String textoOriginal = "esto1234es5678bueno900";

        String resultado1 = reemplazarEs(textoOriginal);
        System.out.println("Resultado después de reemplazar 'es' por 'no por': " + resultado1);

        String resultado2 = reemplazarDigitos(textoOriginal);
        System.out.println("Resultado después de reemplazar grupos de dígitos por '*': " + resultado2);
    }

    /**
     * Reemplazar "es" por "no por"
     * @param texto
     * @return texto cambiado
     */
    public static String reemplazarEs(String texto) {
        return texto.replace("es", "no por");
    }

    /**
     * Reemplazar numeros por "*"
     * @param texto
     * @return texto cambiado
     */
    public static String reemplazarDigitos(String texto) {
        return texto.replaceAll("\\d+", "*");
    }
}
