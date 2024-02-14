package Examen2.Problema1;

public class App {

    public static void main(String[] args) {

Contador contador = new Contador(0);

Cronometro cronometro = new Cronometro(contador);
        cronometro.getHilo().start();

        for (int i = 0; i < 4; i++) {
            Proceso proceso = new Proceso("Proceso " + i, contador);
            proceso.hilo.start();


        }

    }
}
