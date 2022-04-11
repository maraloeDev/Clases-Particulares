/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen1ºEvaluacion;

import static Examen1ºEvaluacion.Ejercicio_6.teclado;

/**
 *
 * @author Eduardo
 */
public class Ejercicio__14 {

    public static void main(String[] args) {

        System.out.println("Escribe un numero entre el 1 y el 50: ");

        int numero = teclado.nextInt();

        /**
         *
         * Si el numero introducido es menor que 25, se restara 1 hasta que la
         * condicion del for, se cumpla, y si es igual, que el numero indicado
         * (25), que lo muestre por pantalla
         */
        for (int i = 0; i < 25; i++) {
            if (numero < 25) {

                System.out.println(numero - i);
            }

        }
        if (numero == 25) {

            System.out.println("El numero es 25");
        }
    }
}
