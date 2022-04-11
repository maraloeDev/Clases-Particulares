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
public class Ejercicio_9 {

    public static void main(String[] args) {

        System.out.println("introduce una frase, que la dare la vuelta");
        String cadena = teclado.next();
        int longitud = cadena.length();
        
        /**
         * Si 0 es ,menor que la longitud (Que es igual a la longitud 
         * de la cadena que introduczca el usuario, 
         * entonces i va incrementando, hasta que la variable longitud supere a i
         */

        for (int i = 0; i < longitud; i++) {

            System.out.println(cadena.charAt(i));

        }

    }

}
