package Examen4SocketsAPasado.Ejercicio1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Servidor {

    public static Map<String, Socket> usuarios;

    public static void main(String[] args) {
        usuarios = new HashMap<>();

        // Creamos el servidor
        try (ServerSocket serverSocket = new ServerSocket(4444);) {

            // Crea lista de sockets
            ArrayList<Socket> listaSockets = new ArrayList<>();
            ArrayList<ProcesoUsuarios> procesosUsuarios = new ArrayList<>();

            // Hay 2 conexiones
            for (int i = 0; i < 2; i++) {
                listaSockets.add(serverSocket.accept());
                System.out.println("Se ha conectado un cliente");
            }
            System.out.println("Ya se han conectado los 2 clientes");

            // Una vez que haya al menos 2 conectados, se escuchara si envian un mensaje al servidor, si es asi
            // el servidor intentara enviarlo a su destinatario
            for (int i = 0; i < listaSockets.size(); i++) {

                procesosUsuarios.add(new ProcesoUsuarios(listaSockets.get(i)));

            }
            while (true) {
                Socket socket = serverSocket.accept();
                listaSockets.add(socket);
                ProcesoUsuarios procesoUsuarios = new ProcesoUsuarios(socket);
            System.out.println("Se a unido alguien nuevo");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}