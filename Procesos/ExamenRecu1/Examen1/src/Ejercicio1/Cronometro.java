package Ejercicio1;

public class Cronometro implements Runnable {

    private Contador contador;
    int segundosTranscurridos = 0;

    @Override
    public void run() {

        while (contador.getContador() < 20000) {
            try {
                Thread.sleep(1000);
                segundosTranscurridos++;
                System.out.println("Ha pasado 1 segundo");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Ha pasado un total de " + segundosTranscurridos + " segundos");

    }

    Thread hilo;
    public Cronometro(Contador contador) {
        this.hilo = new Thread(this);
        this.contador = contador;
    }

    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }

    public int getSegundosTranscurridos() {
        return segundosTranscurridos;
    }

    public void setSegundosTranscurridos(int segundosTranscurridos) {
        this.segundosTranscurridos = segundosTranscurridos;
    }

    public Thread getHilo() {
        return hilo;
    }

    public void setHilo(Thread hilo) {
        this.hilo = hilo;
    }
}
