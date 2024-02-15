package Examen4SocketsAPasado.Ejercicio1;

import java.io.*;
import java.net.Socket;

public class ProcesoUsuarios implements Runnable {

    public Socket socket;
        InputStream inputStream;

    @Override
    public void run() {

        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Iniciando proceso de chat");
        while (true) {
            try {


                Mensaje mensaje;
                try {
                    mensaje = (Mensaje) objectInputStream.readObject();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                // Si no se envia información
                if (mensaje != null) {

                    if (!Servidor.usuarios.containsKey(mensaje.getOrigen())) {
                        Servidor.usuarios.put(mensaje.getOrigen(), socket); //Asociar socket a el nombre
                    }

                    if (Servidor.usuarios.containsKey(mensaje.getDestino())) {
                        OutputStream outputStream = Servidor.usuarios.get(mensaje.getDestino()).getOutputStream();
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(mensaje);
                        objectOutputStream.flush();
                    }
                }
                System.out.println("No se ha esperado ningun mensaje");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

    }

    Thread hilo;

    public ProcesoUsuarios(Socket socket) {
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
