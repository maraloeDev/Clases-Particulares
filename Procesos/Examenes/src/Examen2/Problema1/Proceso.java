package Examen2.Problema1;

public class Proceso implements Runnable {

    private Contador contador;
    private int contadorP;

    @Override
    public void run() {
        while (contadorP < 5000) {

            synchronized (contador){

                contador.setContador(contador.getContador()+1);
                contadorP++;

                System.out.println("Soy el proceso " + hilo.getName() + " y he contado hasta el numero " + contador.getContador());
            }
        }
        System.out.println(hilo.getName() + " he parado");
    }

    Thread hilo;

    public Proceso(String nombre, Contador contador) {
        this.hilo = new Thread(this, nombre);
        this.contador = contador;
    }

    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }

    public int getContadorP() {
        return contadorP;
    }

    public void setContadorP(int contadorP) {
        this.contadorP = contadorP;
    }

    public Thread getHilo() {
        return hilo;
    }

    public void setHilo(Thread hilo) {
        this.hilo = hilo;
    }
}
