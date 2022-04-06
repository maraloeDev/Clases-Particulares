package Ejercicio6;

import java.util.Scanner;

public class ParoImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        int numero = teclado.nextInt();


        if (numero%2==0){

            System.out.println("Es Par");
        } else
            System.out.println("Es Impar");
    }
}
