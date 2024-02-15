package Examen4SocketsAPasado.Ejercicio1;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ProcesoCliente implements Runnable {

    public ArrayList<String> mensajesRecibidos;
    private Socket socket;
    private InputStream inputStream;

    @Override
    public void run() {

        mensajesRecibidos = new ArrayList<>();

        while (true) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);


                Mensaje mensajeRecibido = (Mensaje) objectInputStream.readObject();
                mensajesRecibidos.add(mensajeRecibido.toString());

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }

    }

    Thread hilo;

    public ProcesoCliente(Socket socket) {
        this.hilo = new Thread(this);
        this.socket = socket;
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        hilo.start();
    }


}
