package com.adrian.tema04.manejo_de_fechas;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDateTime;


public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float distanciaMarte = 225000000;

        System.out.println("Ingresse su fecha del despeque (dd/mm/yyyy hh:mm:ss):");
        String fechaStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime fechaSalida = LocalDateTime.parse(fechaStr, formatter);

        System.out.println("Ingrese la velocidad de la nave en Kh:");
        float velocidad = scanner.nextFloat();

        long segundosViaje = (long)(distanciaMarte / velocidad) * 3600;
        long segundos= segundosViaje%60;
        long minutosViaje = segundosViaje/ 60;
        long minutos= minutosViaje%60;
        long horas = minutosViaje/60;

        LocalDateTime fechaLlegada1 = fechaSalida.plusHours(horas);
        LocalDateTime fechaLlegada2 = fechaLlegada1.plusMinutes(minutos);
        LocalDateTime fechaLlegada3 = fechaLlegada2.plusSeconds(segundos);

        System.out.println("Vas a llegar el " +fechaLlegada3);

    }
}