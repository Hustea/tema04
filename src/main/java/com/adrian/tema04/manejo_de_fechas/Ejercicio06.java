package com.adrian.tema04.manejo_de_fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio06 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                // Limpiar la pantalla con el código ANSI
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // Mostrar la fecha y hora actual en la primera línea
                mostrarFechaHoraActual();

                // Mostrar la cuenta atrás para Año Nuevo en la segunda línea
                mostrarCuentaAtrasAnoNuevo();
            }
        }, 0, 1000); // Ejecutar cada 1000 milisegundos (1 segundo)
    }

    /**
     * Método para mostrar la fecha y hora actual
     */
    private static void mostrarFechaHoraActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaHoraActual = sdf.format(new Date());
        System.out.println("\033[1;1H" + fechaHoraActual); // ANSI para la posición (1,1)
    }

    /**
     * Método para mostrar la cuenta atrás hasta Año Nuevo
     */
    private static void mostrarCuentaAtrasAnoNuevo() {
        Calendar ahora = Calendar.getInstance();
        Calendar anoNuevo = Calendar.getInstance();
        anoNuevo.set(ahora.get(Calendar.YEAR) + 1, Calendar.JANUARY, 1, 0, 0, 0);

        long diferenciaEnMilisegundos = anoNuevo.getTimeInMillis() - ahora.getTimeInMillis();

        long segundosRestantes = diferenciaEnMilisegundos / 1000;
        long meses = segundosRestantes / (30 * 24 * 60 * 60);
        segundosRestantes %= (30 * 24 * 60 * 60);

        long dias = segundosRestantes / (24 * 60 * 60);
        segundosRestantes %= (24 * 60 * 60);

        long horas = segundosRestantes / (60 * 60);
        segundosRestantes %= (60 * 60);

        long minutos = segundosRestantes / 60;
        long segundos = segundosRestantes % 60;

        // Imprimir la cuenta atrás en la posición
        System.out.printf("\033[2;1HQuedan %d meses, %d días, %02d:%02d:%02d para Año Nuevo\n",
                meses, dias, horas, minutos, segundos);
    }
}