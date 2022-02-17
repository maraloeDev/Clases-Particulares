package EjerciciosPDF;

import java.util.Scanner;

public class App_Ejercicio3 {

  static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Ejercicio3 ataque = new Ejercicio3(true,true);
        Ejercicio3 huye   = new Ejercicio3(true,false);
        Ejercicio3 Libre  = new Ejercicio3(false,false);


        int opcion;
do {
    System.out.println( "1 Atacar" + '\n'
            +           "2 huir"   + '\n'
            +           "3 Libre de peligro");
    System.out.println("------------------------------");
    System.out.println("Selecciona una opción");
    opcion=teclado.nextInt();

    switch (opcion){

        case 1 :
            ataque.Ataque(true,true);
        break;

        case 2 :
            huye.huye(false,false);
        break;

        case 3 :

            Libre.LibreDePeligro(false);
        break;

    }
}while (opcion==1 || opcion==2 || opcion==3);
        System.out.println("Selecciona una opcion : " + '\n'
                + "1 Atacar" + '\n'
                + "2 huir" + '\n'
                + "3 Libre de peligro");
        System.out.println("------------------------------");

    }
}
