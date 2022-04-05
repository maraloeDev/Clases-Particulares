/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.awt.datatransfer.DataFlavor;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero o salir");
        int numero = teclado.nextInt();
        do {

            System.out.println("Introduce un numero o salir");

            numero = teclado.nextInt();

        } while (numero < 0 || numero > 0);
        
        System.out.println("Introduce un numero o salir");
        
        String frase = teclado.nextLine();
        System.out.println("Has introducido " + frase.toUpperCase());

    }
}
