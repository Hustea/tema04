package com.adrian.tema04.manejo_de_fechas;

import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu fecha de nacimiento (dd/MM): ");
        String fechaInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
        MonthDay fecha = MonthDay.parse(fechaInput, formatter);
        String zodiaco = obtenerZodiaco(fecha);

        System.out.println("Su signo zodiacal es: " +zodiaco);

        scanner.close();
    }

    /**
     * Devuelve un signo zodiacal en funcion de la fecha
     * @param fecha la fecha de nacimiento
     * @return singo zodiacal
     */
    public static String obtenerZodiaco(MonthDay fecha) {
        int numero = obtenerNumero(fecha);
        String zodiaco = "";
        switch (numero){
            case 1 -> zodiaco += "Acuario";
            case 2 -> zodiaco += "Piscis";
            case 3 -> zodiaco += "Aries";
            case 4 -> zodiaco += "Tauro";
            case 5 -> zodiaco += "Gemisis";
            case 6 -> zodiaco += "Cancer";
            case 7 -> zodiaco += "Leo";
            case 8 -> zodiaco += "Virgo";
            case 9 -> zodiaco += "Libra";
            case 10 -> zodiaco += "Escorpio";
            case 11 -> zodiaco += "Ofiuco";
            case 12 -> zodiaco += "Sagitario";
            case 13 -> zodiaco += "Capricornio";
        }
        return zodiaco;
    }

    /**
     * devolver un numero en funcion de una fecha
     * @param fecha fecha de nacimiento
     * @return un numero del 1 al 13
     */
    public static int obtenerNumero(MonthDay fecha) {

        if ((fecha.isAfter(MonthDay.of(2, 17)) && fecha.isBefore(MonthDay.of(3, 12)))) {
            return 1;
        } else if ((fecha.isAfter(MonthDay.of(3, 11)) && fecha.isBefore(MonthDay.of(4, 17)))) {
            return 2;
        } else if ((fecha.isAfter(MonthDay.of(4, 16)) && fecha.isBefore(MonthDay.of(5, 15)))) {
            return 3;
        } else if ((fecha.isAfter(MonthDay.of(5, 14)) && fecha.isBefore(MonthDay.of(6, 22)))) {
            return 4;
        } else if ((fecha.isAfter(MonthDay.of(6, 21)) && fecha.isBefore(MonthDay.of(7, 20)))) {
            return 5;
        } else if ((fecha.isAfter(MonthDay.of(7, 19)) && fecha.isBefore(MonthDay.of(8, 11)))) {
            return 6;
        } else if ((fecha.isAfter(MonthDay.of(8, 10)) && fecha.isBefore(MonthDay.of(9, 17)))) {
            return 7;
        } else if ((fecha.isAfter(MonthDay.of(9, 16)) && fecha.isBefore(MonthDay.of(10, 31)))) {
            return 8;
        } else if ((fecha.isAfter(MonthDay.of(10, 30)) && fecha.isBefore(MonthDay.of(11, 23)))) {
            return 9;
        } else if ((fecha.isAfter(MonthDay.of(11, 22)) && fecha.isBefore(MonthDay.of(11, 29)))) {
            return 10;
        } else if ((fecha.isAfter(MonthDay.of(11, 28)) && fecha.isBefore(MonthDay.of(12, 18)))) {
            return 11;
        } else if ((fecha.isAfter(MonthDay.of(12, 17)) || fecha.isBefore(MonthDay.of(1, 21)))) {
            return 12;
        } else {
            return 13;
        }
    }
}
