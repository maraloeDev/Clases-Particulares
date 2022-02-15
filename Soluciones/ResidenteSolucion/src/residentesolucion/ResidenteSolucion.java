/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentesolucion;

import java.util.*;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o)
 * @version 1.0
 */
public class ResidenteSolucion {

    static Scanner miScanner; // El lecto del teclado
    static ArrayList<Residente> listadoResidentes; // ArrayList donde iremos guardando todos los residentes. A su vez, le indico que solo admita datos de tipo Residente

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcionSeleccionada;

        miScanner = new Scanner(System.in); // Inicializo el Scanner
        listadoResidentes = new ArrayList(); // Inicializo el ArrayList

        do { // Bucle para repetir todo el programa hasta que el usuario introduzca un 0
            do { // Bucle para repetir el menú hasta que el usuario introduzca una opción válida
                opcionSeleccionada = menu();
            } while (opcionSeleccionada < 0 || opcionSeleccionada > 5);

            opcionSeleccionada(opcionSeleccionada);
        } while (opcionSeleccionada != 0);
    }

    /**
     * Muestra al usuario el menú disponible del programa. Si el usuario
     * introduce un dato inválido, se le avisa mediante un mensaje
     *
     * @return la opción seleccionada por el usuario (el número) o -1 en caso de
     * error
     */
    public static int menu() {
        int opcion;
        System.out.print("\n***** GESTIÓN DE RESIDENTES *****\n"
                + "1) Introducir los datos de un nuevo residente\n"
                + "2) Mostrar los datos de TODOS los residentes\n"
                + "3) Mostrar los datos de UN residente(mediante DNI)\n"
                + "4) Modificar los datos de un residente\n"
                + "0) Salir del menú\n"
                + "--> ");

        // Recoger datos
        try { // Hago un try-catch porque el usuario puede introducir una cadena de texto. Por tanto, debo controlarlo
            opcion = miScanner.nextInt();
            miScanner.nextLine(); // Hacemos esto para recoger el caracter de retorno de carro y no tener problemas al leer Strings más adelante
        } catch (InputMismatchException imEx) {
            System.err.println("ERROR!! Debe introducir un NÚMERO entre 0 y 4.\n");
            miScanner.next(); // Leo lo siguiente para vaciar la entrada y que no exista un bucle infinito
            return -1;
        } catch (Exception ex) {
            System.err.println("Error genérico.");
            miScanner.next(); // Leo lo siguiente para vaciar la entrada y que no exista un bucle infinito
            return -1;
        }

        // Comprobación de los datos
        if (opcion >= 0 && opcion < 5) {
            System.out.println(""); //Es solo para hacer un salto de línea y que quede más visual todo
            return opcion;
        } else {
            System.err.println("ERROR!!! La opción debe estar entre 0 y 4.\n");
        }
        return -1;
    }

    /**
     *
     *
     * @param opcionSeleccionada Número que introdujo el usuario para hacer lo
     * que indicaba la opción
     */
    private static void opcionSeleccionada(int opcionSeleccionada) {
        String dni;
        switch (opcionSeleccionada) {
            case 1: // Crearemos un residente nuevo
                nuevoResidente();
                break;
            case 2: // Mostrar todos los datos
                mostrarDatos(null);
                break;
            case 3: //Mostrar solo un dato
                System.out.print("Dame el DNI del Residente a consultar: ");
                dni = miScanner.nextLine();
                mostrarDatos(dni.toUpperCase());
                break;
            case 4: // modificar datos
                System.out.print("Dame el DNI del Residente a modificar: ");
                dni = miScanner.nextLine();
                modificarDatos(dni.toUpperCase());
                break;
            default:
                break;
        }
    }

    /**
     * Realiza la lectura de todos los datos para el nuevo Residente. Va
     * mostrando mensaje al usuario de lo que debe introducir y, tras introducir
     * todo, crera el nuevo objeto y lo almacena en el ArrayList
     */
    public static void nuevoResidente() {
        String dni, nomApe;
        int numHab, numIncidencias;

        try {
            System.out.print("Dame el DNI del nuevo Residente: ");
            dni = miScanner.nextLine();
            System.out.print("Dame el Nombre y el Apellido del nuevo Residente: ");
            nomApe = miScanner.nextLine();
            System.out.print("Dame el Número de habitación del nuevo Residente: ");
            numHab = miScanner.nextInt();
            miScanner.nextLine(); // Hacemos esto para recoger el caracter de retorno de carro y no tener problemas al leer Strings más adelante
            System.out.print("Dame elNúmero de incidencias del nuevo Residente: ");
            numIncidencias = miScanner.nextInt();
            miScanner.nextLine(); // Hacemos esto para recoger el caracter de retorno de carro y no tener problemas al leer Strings más adelante

            Residente elResidente = new Residente(dni, nomApe, numHab, numIncidencias);
            listadoResidentes.add(elResidente);

        } catch (InputMismatchException imEx) {
            System.err.println("\nERROR!! Uno de los datos introducidos no es válido!\n"
                    + "\tDNI y Nombre y apellido: Cadena de texto\n"
                    + "\tNúmero de habitación y número de incidencias: Números");
            System.out.println("\nVolviendo a pedir datos...\n");
            miScanner.next(); // Leo lo siguiente para vaciar la entrada y que no exista un bucle infinito
            opcionSeleccionada(1); // Para volver a ejecutar esta función desde el principio
        } catch (Exception ex) {
            System.err.println("Error genérico.");
            miScanner.next(); // Leo lo siguiente para vaciar la entrada y que no exista un bucle infinito
            opcionSeleccionada(1); // Para volver a ejecutar esta función desde el principio
        }
    }

    /**
     * En este método existen dos soluciones, una con un bucle for y otra con un
     * bucle for-each
     *
     * @param dni
     */
    public static void mostrarDatos(String dni) {
        // FOR
        /*for (int i = 0; i < listadoResidentes.size(); i++) {
            Residente miResidente = (Residente) listadoResidentes.get(i);
            if (dni == null || miResidente.getDNI().equalsIgnoreCase(dni)) {
                System.out.println(miResidente);
            }
        }*/

        // FOR-EACH
        for (Residente miResidente : listadoResidentes) {
            if (dni == null || miResidente.getDNI().equalsIgnoreCase(dni)) {
                System.out.println(miResidente);
            }
        }
    }

    /**
     * Modifica los datos del objeto que tiene el DNI que se ha psado por
     * parámetro. Si este no existe, no hace nada.
     *
     * @param dni DNI del Residente del que se quiere modificar los datos
     */
    public static void modificarDatos(String dni) {
        System.out.print("\n" + "Qué desea modificar?\n" + "1) DNI\n" + "2) Nombre y apellidos\n" + "3) Número de Habitación\n" + "4) Agregar incidencia\n --> ");
        int opcion = miScanner.nextInt();
        miScanner.nextLine();

        try {
            for (Residente miResidente : listadoResidentes) {
                if (dni != null || dni.equalsIgnoreCase("") || miResidente.getDNI().equalsIgnoreCase(dni)) {
                    switch (opcion) {
                        case 1: // DNI
                            System.out.println("Cuál es el nuevo DNI?");
                            String nuevoDNI = miScanner.nextLine();
                            miResidente.setDNI(nuevoDNI);
                            break;
                        case 2: // Nombre y apellidos
                            System.out.println("Cuáles son los nuevos Nombre y Apellidos?");
                            String nuevoNomApe = miScanner.nextLine();
                            miResidente.setNomApe(nuevoNomApe);
                            break;
                        case 3: //Habitación
                            System.out.println("Cuál es la nueva Habitación?");
                            int nuevoHabi = miScanner.nextInt();
                            miScanner.nextLine();
                            miResidente.setNumHabi(nuevoHabi);
                            break;
                        case 4: // Añadir incidencias
                            System.out.println("Cuántas incidencias quieres añadir?");
                            int nuevaInci = miScanner.nextInt();
                            miScanner.nextLine();
                            miResidente.setNumInci(nuevaInci);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            }
        } catch (InputMismatchException imEx) {
            System.err.println("\nERROR!! Uno de los datos introducidos no es válido!\n"
                    + "\tDNI y Nombre y apellido: Cadena de texto\n"
                    + "\tNúmero de habitación y número de incidencias: Números");
            System.out.println("\nVolviendo a pedir datos...\n");
            miScanner.next(); // Leo lo siguiente para vaciar la entrada y que no exista un bucle infinito
            opcionSeleccionada(4); // Para volver a ejecutar esta función desde el principio
        } catch (Exception ex) {
            System.err.println("\nError genérico.\n");
            miScanner.next(); // Leo lo siguiente para vaciar la entrada y que no exista un bucle infinito
            opcionSeleccionada(4); // Para volver a ejecutar esta función desde el principio
        }
    }

}
