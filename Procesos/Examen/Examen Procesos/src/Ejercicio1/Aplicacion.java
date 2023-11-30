package Ejercicio1;

public class Aplicacion {

    public static void main(String[] args) {

        Contador contador = new Contador(0);

        Proceso proceso;

        for (int i = 1; i <= 4; i++) {

            if (i <= 2) {
            proceso = new Proceso("Ventanilla " + i, contador, Thread.MAX_PRIORITY);

            } else {
                proceso = new Proceso("Ventanilla " + i, contador, Thread.MIN_PRIORITY);
            }

            proceso.getHilo().start();
        }
    }
}
