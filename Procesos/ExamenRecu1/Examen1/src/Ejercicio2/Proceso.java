package Ejercicio2;


public class Proceso implements Runnable {
    private Contador contador;

    @Override
    public void run() {

        while (!this.hilo.isInterrupted()) {
            try {
                System.out.println("JA");
                getHilo().wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            contador.setContador(contador.getContador() + 1);
        System.out.println("Se ha encontrado otro 10");
        }

       // this.getHilo().notify();
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
}
