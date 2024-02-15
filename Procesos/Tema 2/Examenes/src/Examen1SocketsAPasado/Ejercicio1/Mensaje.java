package Examen4SocketsAPasado.Ejercicio1;

import java.io.Serializable;

public class Mensaje implements Serializable {

    private String origen;
    private String destino;
    private String mensaje;

    public Mensaje(String origen, String destino, String mensaje) {
        this.origen = origen;
        this.destino = destino;
        this.mensaje = mensaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return this.origen + ": " + this.mensaje;
    }
}
