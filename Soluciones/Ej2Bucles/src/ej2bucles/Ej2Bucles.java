/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Ej2Bucles {

    static Scanner miScanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcionSeleccionada;

        miScanner = new Scanner(System.in); // Inicializo el Scanner
        do { // Bucle para repetir todo el programa hasta que el usuario introduzca un 0
            do { // Bucle para repetir el menú hasta que el usuario introduzca una opción válida
                opcionSeleccionada = menu();
            } while (opcionSeleccionada < 0 || opcionSeleccionada > 5);

            opcionSeleccionada(opcionSeleccionada);
        } while (opcionSeleccionada != 0);
        miScanner.close(); // Cierro el Scanner al finalizar el programa
    }

    public static int menu() {
        int opcion;
        System.out.println("\n***** BIENVENIDO A SU BANCO *****\n"
                + "Seleccione una de las siguientes opciones en el teclado numérico:\n"
                + "\t1.- Consultar saldo\n"
                + "\t2.- Realizar una transferencia\n"
                + "\t3.- Consultar/cambiar los datos personales\n"
                + "\t4.- Solicitar un préstamo\n"
                + "\t5.- Pagar impuestos\n"
                + "\t0.- Cerrar sesión\n"
                + "*********************************");
        System.out.print("--> ");

        // Recoger datos
        try { // Hago un try-catch porque el usuario puede introducir una cadena de texto. Por tanto, debo controlarlo
            opcion = miScanner.nextInt();
            miScanner.nextLine(); // Hacemos esto para recoger el caracter de retorno de carro y no tener problemas al leer Strings más adelante
        } catch (InputMismatchException imEx) {
            System.err.println("Ha introducido un valor que no está en el menú (Número)\n");
            miScanner.next(); // Leo lo siguiente para vaciar la entrada y que no exista un bucle infinito
            return -1;
        } catch (Exception ex) {
            System.err.println("Error genérico.");
            miScanner.next(); // Leo lo siguiente para vaciar la entrada y que no exista un bucle infinito
            return -1;
        }

        // Comprobación de los datos
        if (opcion >= 0 && opcion < 6) {
            System.out.println(""); //Es solo para hacer un salto de línea y que quede más visual todo
            return opcion;
        } else {
            System.err.println("Ha introducido un valor que no está en el menú\n");
        }
        return -1;
    }

    public static void opcionSeleccionada(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1: // Crearemos un residente nuevo
                metodo1();
                break;
            case 2: // Mostrar todos los datos
                metodo2();
                break;
            case 3: //Mostrar solo un dato
                metodo3();
                break;
            case 4: // modificar datos
                metodo4();
                break;
            case 5:
                metodo5();
                break;
            default:
                break;
        }
    }


    /**
     * A partir de aquí es opcional. Está puesto para evitar errores de
     * compilación pero, con lo anterior, el ejercicio estaría resuelto.
     * 
     * Para que todo quede bien, he creado dos objetos (CuentaBancaria y Prestamo)
     */
    
    static CuentaBancaria laCuenta = new CuentaBancaria("111A", "TU NOMBRE", 1434.18f, false, null);
    
    
    private static void metodo1() {
        System.out.println("Tiene "+laCuenta.getBalance()+" € en su cuenta bancaria");
    }

    private static void metodo2() {
        System.out.print("¿A quíen desea realizar una transferencia? --> ");
        String destinatario = miScanner.nextLine();
        System.out.print("¿Cuánto desea enviar? --> ");
        int cantidad = miScanner.nextInt();
        miScanner.nextLine();
        if(cantidad<=laCuenta.getBalance()){
            System.out.println("\n\t** Dinero enviado correctamente. **\n");
        }else{
            System.err.println("\n\t** No tienes dinero suficiente **\n");
        }
    }

    private static void metodo3() {
        System.out.print("Indique el nuevo nombre y apellidos -->");
        String nombre = miScanner.nextLine();
        laCuenta.setNombreApellidosTitular(nombre);
    }

    private static void metodo4() {
        System.out.print("¿De cuánto desea solicitar el préstamo? --> ");
        float cantidad = miScanner.nextFloat();
        miScanner.nextLine();
        System.out.print("¿En cuánto tiempo desea devolverlo? --> ");
        int tiempo = miScanner.nextInt();
        miScanner.nextLine();
                
        Prestamo elPrestamo = new Prestamo(12345, 2.35f, cantidad, 0.0f, tiempo);
        laCuenta.setTienePrestamo(true);
        laCuenta.setPrestamo(elPrestamo);
        
        laCuenta.setBalance(laCuenta.getBalance()+elPrestamo.getCantidadPrestamo()); // Al pedir un préstamo, me dan dinero.
        
        System.out.println("Acaba de solicitar un préstamo con las siguientes características: \n"+elPrestamo);
    }

    private static void metodo5() {
        System.out.println("Pagar impuestos (ACTUALMENTE NO DISPONIBLE)");
    }
}
