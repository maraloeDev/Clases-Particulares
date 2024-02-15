package Examen5Sockets.Ejercicio1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) {

		int nClientesConectados = 0;
		
		int numero=0;
		ServerSocket serverSocket;
		Scanner scanner = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(1234);

			System.out.println("Servidor Inciado...");

			ArrayList<Socket> listaUsuarios = new ArrayList<>();

			for (int i = 0; i < 3; i++) {
				listaUsuarios.add(serverSocket.accept());
				System.out.println("Se ha conectado un cliente");
				
				if (listaUsuarios.size() > 3) {
					String opcion = scanner.next();
					System.out.println("Quiere volver a intentarlo, " + "\n" + " 1. Si" + " \n" + " 2. No");
					do {

						switch (opcion) {
						case "Si":
							try {
								Thread.sleep(1000);
								System.out.println("Intentando...");
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
							
						case "No":
							System.exit(0); //Finaliza el cliente
							break;
							
							default:
								System.out.println("Opcion no contemplada");

						}

					} while (opcion.equalsIgnoreCase("Si"));
					
					Mensaje mensaje = new Mensaje(numero);
					
					break;
				} else {
					System.out.println("No puedes conectarse por estar al límite de su capacidad");
				}
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
