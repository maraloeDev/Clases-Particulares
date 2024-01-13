package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contactos> contactos = new ArrayList<Contactos>();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.print("""
                    1. Añadir contacto
                    2. Buscar contacto (por nombre o por telefono)
                    3. Modificar un contacto
                    4. Eliminar contacto
                    5. Mostrar un listado de los contactos
                    6. Vaciar agenda
                    Selecciona una opcion de la agenda: 
                    """);

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();


                    System.out.println("Telefono: ");
                    int telefono = scanner.nextInt();
                    Contactos contactosNuevo = new Contactos(nombre, telefono);
                    anadirContacto(contactosNuevo);
                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }

    public static void anadirContacto(Contactos c) {

            boolean encontradoNombre=false;
            boolean encontradoTelefono=false;
        for (Contactos item : contactos) {


            if (item.getNombre().equalsIgnoreCase(c.getNombre())) {
                encontradoNombre=true;
            }

            if (item.getTelefono()==(c.getTelefono())){

                encontradoTelefono=true;
            }
        }
        if (!encontradoNombre && !encontradoTelefono){
            System.out.println("Contacto creado");
        }

    }

    public static void
}