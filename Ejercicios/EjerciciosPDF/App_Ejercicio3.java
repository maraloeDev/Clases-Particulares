package EjerciciosPDF;

import java.util.Scanner;

public class App_Ejercicio3 {

  static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Ejercicio3 ataque = new Ejercicio3(true,false);
        Ejercicio3 huye   = new Ejercicio3(true,false);
        Ejercicio3 Libre  = new Ejercicio3(false,false);

        System.out.println( "1 Atacar" + '\n'
                +           "2 huir"   + '\n'
                +           "3 Libre de peligro");
        System.out.println("------------------------------");
        System.out.println("Selecciona una opción");
        int opcion=teclado.nextInt();
do {
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
}while (opcion!=0);
        System.out.println("Selecciona una opcion : " + '\n'
                + "1 Atacar" + '\n'
                + "2 huir" + '\n'
                + "3 Libre de peligro");
        System.out.println("------------------------------");

        opcion=teclado.nextInt();



    }
}
