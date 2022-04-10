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
