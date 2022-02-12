import java.util.Scanner;

public class MenuResidentes {

    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        int opción;

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

                    break;
                case 2:

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
