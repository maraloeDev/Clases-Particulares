package ExamenRecuperacion;

public class ProcesoDormido implements Runnable {

    private Contador contador;
    private int contadorP;

    @Override
    public void run() {


        esperar();
        System.out.println("“El ProcesoDormido\n" +
                "se despertó");

    }

    Thread hilo;

    public ProcesoDormido(String nombre, Contador contador) {
        this.hilo = new Thread(this, nombre);
        this.contador = contador;
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

    public synchronized void despertar() {
        notify();
    }

    public synchronized void esperar() {

        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
