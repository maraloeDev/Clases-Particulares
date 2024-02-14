package ExamenRecuperacion;

import java.util.ArrayList;
import java.util.Scanner;

public class PideDatos {

    public static void main(String[] args) {

        ThreadGroup subprocesos = new ThreadGroup("subprocesos");
        Contador contador = new Contador(0);
        ProcesoContador procesoContador;
        Scanner teclado = new Scanner(System.in);

        int x = 0;

        System.out.print("Introduzca un número de procesos: ");
        int numero = teclado.nextInt();

        ArrayList<ProcesoContador> listaProcesos = new ArrayList<>();
        ProcesoDormido procesoDormido = new ProcesoDormido("proceso dormido", contador);
        procesoDormido.getHilo().start();

        for (int i = 0; i < numero; i++) {

            procesoContador = new ProcesoContador("Proceso " + i, contador, subprocesos);
            listaProcesos.add(procesoContador);
            procesoContador.getHilo().start();
            x++;
        }
        if (numero > 10) {
            while (contador.getContador() < 500) {
            }
            subprocesos.interrupt();
        } else {

            for (ProcesoContador item : listaProcesos){
                try {
                    item.getHilo().join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        System.out.println("Fin de la aplicación y de los " + x + " subprocesos");

        procesoDormido.despertar();
    }

}
