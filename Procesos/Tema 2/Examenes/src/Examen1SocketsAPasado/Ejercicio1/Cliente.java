package Examen4SocketsAPasado.Ejercicio1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    static Socket socket;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        try {
            socket = new Socket("localhost", 4444);
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(new Mensaje(nombre, "",""));

            objectOutputStream.flush();

            ProcesoCliente pCliente = new ProcesoCliente(socket);

            while (true){
                System.out.println("1. Enviar mensaje");
                System.out.println("2. Leer mensajes recibidos");
                System.out.print("Elija una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (opcion) {
                    case 1:
                        System.out.print("Destino : ");
                        String destino = scanner.nextLine();

                        System.out.print("Mensaje: " );
                        String mensaje = scanner.nextLine();

                        objectOutputStream.writeObject(new Mensaje(nombre, destino, mensaje));
                        objectOutputStream.flush();
                        break;
                    case 2:
                        for (String msg : pCliente.mensajesRecibidos) {
                            System.out.println(msg);
                        }
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}