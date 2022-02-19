package EjerciciosPDF;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int DiaDeLaSemana=teclado.nextInt();
        boolean esFestivo=true;

        if (DiaDeLaSemana==1 || DiaDeLaSemana==2 || DiaDeLaSemana==3 || DiaDeLaSemana==4 || DiaDeLaSemana==5 || esFestivo==false){
            System.out.println("Despertador conectado a las 7:00");

        }else if (esFestivo==true || DiaDeLaSemana==6|| DiaDeLaSemana==7){

            System.out.println("Dormir");
        }



        /*switch (DiaDeLaSemana){

            case 1 :
                System.out.println("“Despertador conectado a las 7:00”");
                break;
            case 2 :
                System.out.println("“Despertador conectado a las 7:00”");
                break;
            case 3 :
                System.out.println("“Despertador conectado a las 7:00”");
                break;
            case 4:
                System.out.println("“Despertador conectado a las 7:00”");
                break;
            case 5 :
                System.out.println("“Despertador conectado a las 7:00”");
                break;
            case 6 :
                System.out.println("“Dormir!”");
                break;
            case 7 :
                System.out.println("“Dormir!”");
                break;

            default

                System.out.println("No se ha introducido el valor correcto entre 1 y 7");
        }*/

    }

}
