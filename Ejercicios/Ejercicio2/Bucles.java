package Ejercicio2;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int opcion;
        do {
            System.out.println("***** BIENVENIDO A SU BANCO *****\n" +
                    "Seleccione una de las siguientes opciones en el teclado numérico:\n" +
                    "1.- Consultar saldo\n" +
                    "2.- Realizar una transferencia\n" +
                    "3.- Consultar/cambiar los datos personales\n" +
                    "4.- Solicitar un préstamo\n" +
                    "5.- Pagar impuestos\n" +
                    "0.- Cerrar sesión\n" +
                    "*********************************");

            opcion=teclado.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Su saldo es de 1000 €");

                    AppBucles b1 = new AppBucles();
                    System.out.println(b1.metodo1(1));
                break;

                case 2:
                    System.out.println("A quien quiere realizar la transferencia");

                    AppBucles b2 = new AppBucles();
                    System.out.println(b2.metodo2(3));
                break;

                case 3:

                    System.out.println("Consultar/cambiar los datos personales");

                    AppBucles b3 = new AppBucles();
                    System.out.println(b3.metodo3(7));
                break;

                case 4:

                    System.out.println("Solicitar un préstamo");

                    AppBucles b4 = new AppBucles();
                    System.out.println(b4.metodo4(14));

                break;

                case 5:

                    AppBucles b5 = new AppBucles();
                    System.out.println(b5.metodo5(10));
                    break;

                case 0:
                    System.out.println("“Muchas gracias por utilizar nuestros servicios. ¡Hasta\n" +
                            "pronto!”");

                break;

                default:
                    System.out.println("Ha introducido un valor que no está en el menú");
            }


        } while (opcion==1 || opcion==2 || opcion==3 || opcion==4 || opcion==5); //Si se cumple la condicion se repite hasta que no se cumpla

    }
}
