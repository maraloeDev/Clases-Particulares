package Examen2Sincronismo.Problema2;


public class Proceso implements Runnable {
    private Contador contador;

    @Override
    public void run() {

        while (!this.hilo.isInterrupted()) {


                esperar();

                System.out.println("Se ha encontrado otro 10");
            contador.incrementar();
        }
    }

    Thread hilo;

    public Proceso(Contador contador) {

        this.contador = contador;
        this.hilo = new Thread(this);
    }

    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }

    public Thread getHilo() {
        return hilo;
    }

    public void setHilo(Thread hilo) {
        this.hilo = hilo;
    }

    public synchronized void esperar() {

        try {
            wait();
        } catch (InterruptedException e) {
        }

    }

    public synchronized void notificar(){
        notify();
    }
}
