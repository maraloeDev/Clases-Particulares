package Examen2Sincronismo.Problema2;

public class Contador {

    private int contador;

    public Contador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void  setContador(int contador) {
        this.contador = contador;
    }

    public synchronized void incrementar(){ //Se pone sync para que lo puedan llanar a varios procesos
            contador++;
    }
}
