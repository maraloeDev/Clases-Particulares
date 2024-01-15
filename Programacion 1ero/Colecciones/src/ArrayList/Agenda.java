package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Agenda {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contactos> contactos = new ArrayList<Contactos>();

    public static void main(String[] args) {

        menu();
        submenu();
    }

    public static void menu() {
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
                    String nombreNuevo = scanner.nextLine();

                    System.out.println("Telefono: ");
                    int telefonoNuevo = scanner.nextInt();
                    Contactos c = new Contactos(nombreNuevo, telefonoNuevo);

                    anadirContacto(c);
                    break;
                case 2:
                    submenu();
                    break;
                case 3:
                    System.out.println("Introduce el id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Introduce el nuevo nombre");
                    String nuevoNombre = scanner.nextLine();

                    System.out.println("Introduce el nuevo telefono");
                    int nuevoTelefono = scanner.nextInt();

                    modificarContacto(id, nuevoNombre, nuevoTelefono);
                    break;
                case 4:
                    System.out.println("Introduce el nombre a eliminar");
                    String eliminarNombre = scanner.nextLine();

                    eliminarContacto(eliminarNombre);
                    break;
                case 5:
                    listarContactos();
                    break;
                case 6:
                    vaciarAgenda();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }

    public static void submenu() {
        int opcionSm;
        do {
            System.out.print("""
                    1. Buscar por nombre
                    2. Buscar por telefono
                    3. Volver
                    """);

            opcionSm = scanner.nextInt();
            scanner.nextLine();

            switch (opcionSm) {
                case 1:

                    System.out.println("Nombre: ");
                    String nombreBuscado = scanner.nextLine();

                    buscarContactoNombre(nombreBuscado);

                    break;
                case 2:
                    System.out.println("Telefono: ");
                    int telefonoBuscado = scanner.nextInt();

                    buscarContactoTelefono(telefonoBuscado);
                    break;
                case 3:
                    menu();
                    break;
            }
        } while (opcionSm != 3);
    }

    public static void anadirContacto(Contactos c) {

        boolean encontradoNombre = false;
        boolean encontradoTelefono = false;
        for (Contactos item : contactos) {
            if (item.getNombre().equalsIgnoreCase(c.getNombre())) {
                encontradoNombre = true;
            } else{
                System.out.println("Contacto repetido");
                break;
            }

            if (item.getTelefono() == (c.getTelefono())) {

                encontradoTelefono = true;
            } else{
                System.out.println("Contacto repetido");
                break;
            }
        }
        if (!encontradoNombre && !encontradoTelefono) {
            contactos.add(c);
            System.out.println("Contacto creado");

        }

    }

    public static void buscarContactoNombre(String nombre) {
        boolean encontrado = false;

        for (Contactos contactosBuscar : contactos) {

            if (contactosBuscar.getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("Contacto encontrado: " + contactosBuscar.getNombre() + " " + contactosBuscar.getTelefono());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado");
        }
    }

    public static void buscarContactoTelefono(int telefono) {
        boolean encontrado = false;

        for (Contactos contactosBuscar : contactos) {

            if (contactosBuscar.getTelefono() == (telefono)) {

                System.out.println("Contacto encontrado: " + contactosBuscar.getNombre() + " " + contactosBuscar.getTelefono());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado");
        }
    }

    public static void modificarContacto(int id ,String nombre ,int telefono) {

        for (Contactos contactosModificar : contactos) {
            if (contactosModificar.getId()==id) {
                contactosModificar.setNombre(nombre);
                contactosModificar.setTelefono(telefono);
                System.out.println("Contacto modificado correctamente");
                break;
            }
        }

    }

    public static void eliminarContacto(String nombre) {
        for (Contactos contactosEliminar : contactos) {
            if (contactosEliminar.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(contactosEliminar);
                System.out.println("Contacto eliminado correctamente");
                break;
            }
        }
    }

    public static void listarContactos() {
        for (Contactos listadoContactos : contactos) {
            System.out.println(listadoContactos);
        }
    }

    public static void vaciarAgenda() {
        contactos.clear();
        System.out.println("La agenda se ha  vaciado correctamente.");
    }


}