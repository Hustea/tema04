package com.adrian.tema04.tema05;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = scanner.nextLine();

        scanner.close();

        String nombreCompleto = nombre.trim() + " " + apellido.trim() + " " + apellido2.trim();

        System.out.println(letrasMinuscula(nombreCompleto));
        System.out.println();
        System.out.println(letrasMayusculas(nombreCompleto));
        System.out.println();
        System.out.println(longitudTexto(nombreCompleto));
        System.out.println();
        System.out.println(primeros5caracteres(nombreCompleto));
        System.out.println();
        System.out.println(primeros2caracteres(nombreCompleto));
        System.out.println();
        System.out.println(repeticionesDelUltimoCaracter(nombreCompleto));
        System.out.println();
        System.out.println(repeticionesDelPrimerCaracter(nombreCompleto));
        System.out.println();
        System.out.println("***"+nombreCompleto+"***");
        System.out.println();
        System.out.println(cadenaInvertida(nombreCompleto));
        System.out.println();


    }

    /**
     * Convertir todas las mayusculas en minusculas
     * @param texto el texto en cuastion
     * @return texto sin mayusculas
     */
    public static String letrasMinuscula(String texto) {
        if (texto == null) {
            return null;
        }
        return texto.toLowerCase();
    }

    /**
     * Convertir todas las minusculas en mayusculas
     * @param texto el texto en cuastion
     * @return texto sin minusculas
     */
    public static String letrasMayusculas(String texto) {
        if (texto == null) {
            return null;
        }
        return texto.toUpperCase();
    }


/**
 * Devolver la longitud del texto
 * @param texto el texto en cuastion
 * @returnla longitud del texto
 */
public static int longitudTexto(String texto) {
    if (texto == null) {
        return 0;
    }
    return texto.length();
}


/**
 * Devolver los primeros 5 caracteres de un texto
 * @param texto el texto en cuastion
 * @return los primeros 5 caracteres
 */
public static String primeros5caracteres(String texto) {
    if (longitudTexto(texto) < 5) {
        System.err.println("Texto demasiado corrto, debe tener 5 caracteres o mas");

        return null;
    }

    return texto.length() < 5 ? texto : texto.substring(0, 5);
}

/**
 * Devolver los 2 ultimos caracteres de un texto
 * @param texto el texto en cuastion
 * @return las 2 ultimas letras
 */
public static String primeros2caracteres(String texto) {
    if (longitudTexto(texto) < 2) {
        System.err.println("Texto demasiado corrto, debe tener 2 caracteres o mas");

        return null;
    }

    return texto.length() < 2 ? texto : texto.substring(texto.length() - 2);
}

/**
 * Contar cuantas veces se repite la ultima letra de un texto
 * @param texto el texto en cuastion
 * @return el nunero de veces que se repite el ultimo caracter
 */
public static int repeticionesDelUltimoCaracter(String texto) {
    if (texto == null || texto.isEmpty()) {
        return 0; // Manejo de caso nulo o texto vacío
    }

    char ultimoCaracter = texto.charAt(texto.length() - 1); // Obtiene el último carácter
    int contador = 0;

    // Recorre cada carácter en el texto para contar las ocurrencias del último carácter
    for (int i = 0; i < texto.length(); i++) {
        if (texto.charAt(i) == ultimoCaracter) {
            contador++;
        }
    }

    return contador;
}


/**
 * devolver todas las letras que sean iguales a la primera de un texro y mostrarlas en mayuscula
 * @param texto
 * @return
 */
public static StringBuilder repeticionesDelPrimerCaracter(String texto) {
    if (texto == null || texto.isEmpty()) {
        return null; // Retorna una cadena vacía si el texto es nulo o vacío
    }

    char primerCaracter = texto.charAt(0); // Obtiene el primer carácter
    StringBuilder resultado = new StringBuilder();

    // Recorre cada carácter en el texto y agrega al resultado si es igual al primer carácter
    for (int i = 0; i < texto.length(); i++) {
        if (texto.charAt(i) == primerCaracter) {
            resultado.append(primerCaracter);
        }
    }

    return resultado;
}


public static String cadenaInvertida(String texto) {
    if (texto == null || texto.isEmpty()) {
        return texto; // Retorna el texto original si es nulo o vacío
    }

    StringBuilder textoInvertido = new StringBuilder(texto);
    return textoInvertido.reverse().toString(); // Invierte el texto y lo convierte a String

}


}
