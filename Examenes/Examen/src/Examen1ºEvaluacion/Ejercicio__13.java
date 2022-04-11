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
public class Ejercicio__13 {

    public static void main(String[] args) {
        
        /**
         * 
         * hay 2 condiciones, el if dice que es par, si no es par, pasa a 
         * else if, tiene que cumplir 2 condiciones( si el numero
         * que ha introducido el usuario entre 2 es igual a 1, &&(op. logico,
         * se tienen que cumplir las 2 condiciones si o si)
         * si el numero entre 1 ==0)
         */

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {

            System.out.println("Es Par");
        } else if (numero % 2 == 1 && numero % 1 == 0) {

            System.out.println("Es Impar");

            System.out.println("ES PRIMO");
        }

    }

}
