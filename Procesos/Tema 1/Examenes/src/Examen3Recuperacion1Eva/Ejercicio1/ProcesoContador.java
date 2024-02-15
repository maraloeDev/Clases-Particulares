package Examen3Recuperacion1Eva.Ejercicio1;

public class ProcesoContador implements Runnable{

private Contador contador;
private int contadorP;
    @Override
    public void run() {

        while (contador.getContador() < 1000){
            synchronized (contador){

                contador.setContador(contador.getContador()+2);
                contadorP++;

            System.out.println("Soy el contador Contador y he contado " + contador.getContador());
            }
        }
                System.out.println("He contado " + contadorP);

    }

    Thread hilo;

    public ProcesoContador(String nombre,Contador contador, ThreadGroup elGrupo) {
        this.hilo = new Thread(elGrupo, this, nombre);
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


}
