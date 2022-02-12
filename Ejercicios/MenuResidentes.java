import java.util.Scanner;

public class MenuResidentes {

    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        int opción;

        Residentes r1=new Residentes("123456789", "Pablo","Rodriguez",4,8);
        Residentes r2=new Residentes("123456788", "Rafael","Alonso",8,5);
        Residentes r3=new Residentes("123456781", "Pablo","Alvarez",10,0);

        do {

            System.out.println(" ***** GESTIÓN DE RESIDENTES ***** ");
            System.out.println();
            System.out.println(" 1) Introducir los datos de un nuevo residente ");
            System.out.println(" 2) Mostrar los datos de TODOS los residentes ");
            System.out.println(" 3) Mostrar los datos de UN residente (Mediante DNI) ");
            System.out.println(" 4) Modificar los datos de un residente ");
            System.out.println(" 0) Salir del menú");
            System.out.println();
            System.out.println("Selecciona una opción :");
            opción=teclado.nextInt();

            switch (opción){

                case 1:
                    String residente=teclado.nextLine();

                    while (""==residente){

                        System.out.println("Introduce el nombre del residente: ");
                        residente=teclado.nextLine();
                    }
                    System.out.println("El nombre del residente es " + residente.toUpperCase());
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Residente 1 " +'\n' + r1);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Residente 2 " +'\n' + r2);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Residente 3 " +'\n' + r3);

                    break;
                case 3:

                    break;
                case 4:
                    break;
            }
        } while (opción==1 || opción==2 ||opción==3 || opción==4); //Si se cumple la condicion se repite hasta que no se cumpla
        System.out.println("Has salido del menu");


    }
}
