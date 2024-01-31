package Examen2.Problema2;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Contador contador = new Contador(0);
        Proceso proceso = new Proceso(contador);
        Random random = new Random();

        int aleatorio;

        proceso.getHilo().start();
        for (int i = 0; i <= 100; i++) {
            aleatorio = random.nextInt(0, 20);
            if (aleatorio == 10) {
                synchronized (proceso) {

                    proceso.getHilo().notify(); //Se notifica que se ha encontrado un numero
                }

            }
            System.out.println(aleatorio);

        }
        int totalTens = proceso.getContador().getContador();
        System.out.println("Se ha contado " + totalTens + " 10s");
        proceso.getHilo().interrupt();

    }
}
