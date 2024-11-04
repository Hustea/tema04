package com.adrian.tema04.manejo_de_fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu1;

        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do{
            do{
                System.out.println("*********************************");
                System.out.println("***FECHA CALCULADA: "+fecha.format(formatter)+"***");
                System.out.println("*********************************");

                System.out.println("1.Modificar fecha calculada");
                System.out.println("2.Operacion");
                System.out.println("----------------------------");
                System.out.println("0.salir del programa");

                menu1 = scanner.nextInt();

                if(menu1 < 0 || menu1 > 2){
                    System.err.println("Numero incorrecto");
                }
            }while(menu1 < 0 || menu1 > 2);

            switch (menu1){
                case 1 -> fecha = cambiarFecha();
                case 2 -> fecha= menuOpercaiones(fecha);
            }
        }while(menu1 != 0);

    }


    /**
     * Metodo para cambiar la fecha de referencia
     * @return La fecha cambiada
     */
    public static LocalDateTime cambiarFecha() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresse la fecha que quiera (dd/mm/yyyy):");
        String fechaStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime fechaSalida = LocalDateTime.parse(fechaStr, formatter);

        return fechaSalida;
    }

    /**
     * Aplicar operaciones a una fecha
     * @param fecha la fecha en cuaestion
     * @return la fecha despues de aplicarle las formulas
     */
    public static LocalDateTime menuOpercaiones(LocalDateTime fecha) {
        Scanner scanner = new Scanner(System.in);
        int menu2;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do{
            do{
                System.out.println("*********************************");
                System.out.println("***********OPERACIONES***********");
                System.out.println("***FECHA CALCULADA: "+fecha.format(formatter)+"***");
                System.out.println("*********************************");

                System.out.println("1.Sumar años");
                System.out.println("2.Sumar meses");
                System.out.println("3.Sumar días");
                System.out.println("4.Restar años");
                System.out.println("5.Restar meses");
                System.out.println("6.Restar días");
                System.out.println("--------------------");
                System.out.println("0.salir del programa");

                menu2 = scanner.nextInt();

                if(menu2 < 0 || menu2 > 6){
                    System.err.println("Numero incorrecto");
                }
            }while(menu2 < 0 || menu2 > 6);

            switch (menu2){
                case 1 -> fecha = opercaionSumaAno(fecha);
                case 2 -> fecha = opercaionSumaMes(fecha);
                case 3 -> fecha = opercaionSumaDia(fecha);
                case 4 -> fecha = opercaionRestaAno(fecha);
                case 5 -> fecha = opercaionRestaMes(fecha);
                case 6 -> fecha = opercaionRestaDia(fecha);
            }
        }while(menu2 != 0);

        return fecha;
    }

    /**
     * sumar años a la fecha de referencia
     * @param fecha la fecha de referencia
     * @return resultado de la operacion
     */
    public static LocalDateTime opercaionSumaAno(LocalDateTime fecha) {
        int x = 0;
        System.out.println("Quantos años quieres añadir (Ingresa solo numeros enteros positivos)");
        x = validarNumero(x);
        fecha = fecha.plusYears(x);

        return fecha;

    }

    /**
     * sumar meses a la fecha de referencia
     * @param fecha la fecha de referencia
     * @return resultado de la operacion
     */
    public static LocalDateTime opercaionSumaMes(LocalDateTime fecha) {
        int x = 0;
        System.out.println("Quantos meses quieres añadir (Ingresa solo numeros enteros positivos)");
        x = validarNumero(x);
        fecha = fecha.plusMonths(x);

        return fecha;
    }

    /**
     * sumar dias a la fecha de referencia
     * @param fecha la fecha de referencia
     * @return resultado de la operacion
     */
    public static LocalDateTime opercaionSumaDia(LocalDateTime fecha) {
        int x = 0;
        System.out.println("Quantos dias quieres añadir (Ingresa solo numeros enteros positivos)");
        x = validarNumero(x);
        fecha = fecha.plusDays(x);

        return fecha;

    }

    /**
     * restar años a la fecha de referencia
     * @param fecha la fecha de referencia
     * @return resultado de la operacion
     */
    public static LocalDateTime opercaionRestaAno(LocalDateTime fecha) {
        int x = 0;
        System.out.println("Quantos años quieres restar (Ingresa solo numeros enteros positivos)");
        x = validarNumero(x);
        fecha = fecha.minusYears(x);

        return fecha;

    }

    /**
     * restar meses a la fecha de referencia
     * @param fecha la fecha de referencia
     * @return resultado de la operacion
     */
    public static LocalDateTime opercaionRestaMes(LocalDateTime fecha) {
        int x = 0;
        System.out.println("Quantos meses quieres restar (Ingresa solo numeros enteros positivos)");
        x = validarNumero(x);
        fecha = fecha.minusYears(x);

        return fecha;

    }

    /**
     * restar dias a la fecha de referencia
     * @param fecha la fecha de referencia
     * @return resultado de la operacion
     */
    public static LocalDateTime opercaionRestaDia(LocalDateTime fecha) {
        int x = 0;

        System.out.println("Quantos dias quieres restar (Ingresa solo numeros enteros positivos)");
        x = validarNumero(x);
        fecha = fecha.minusDays(x);

        return fecha;

    }

    /**
     * Validar numero
     * @param x numero que queremos validar
     * @return comprobacion de que sea valido
     */
    public static int validarNumero(int x) {
        Scanner scanner = new Scanner(System.in);
        do{
            x = scanner.nextInt();

            if(x < 0){
                System.err.println("Numero invalido");
            }
        }while(x < 0);

        return x;
    }
}