package EjerciciosPDF.EjerciciosMetodos;

import java.util.Scanner;

public class Ejercicio2App {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Seleccione una opción");


        System.out.println("--------------------");

        System.out.println("***** BIENVENIDO A SU BANCO *****\n" +
                "Seleccione una de las siguientes opciones en el teclado numérico:\n" +
                "1.- Consultar saldo\n" +
                "2.- Realizar una transferencia\n" +
                "3.- Consultar/cambiar los datos personales\n" +
                "4.- Solicitar un préstamo\n" +
                "5.- Pagar impuestos\n" +
                "0.- Cerrar sesión\n" +
                "*********************************");

        int opcion = teclado.nextInt();

    }


}
