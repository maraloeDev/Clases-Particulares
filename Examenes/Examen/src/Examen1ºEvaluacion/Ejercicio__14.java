/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen1;

import static Examen1.Ejercicio_6.teclado;

/**
 *
 * @author Eduardo
 */
public class Ejercicio__14 {

    public static void main(String[] args) {

        System.out.println("Escribe un número entre el 1 y el 50: ");

        int numero = teclado.nextInt();

        for (int i = 1; i < 25; i--) {

            if (numero < 25) {

                System.out.println(numero - i);
            }

        }
        if (numero == 25) {

            System.out.println("El numero es 25");
        }
    }
}
