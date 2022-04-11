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
public class Ejercicio_8 {

    public static void main(String[] args) {

        System.out.println("Introduce un numero o salir: ");

        int numeros = teclado.nextInt();
        String frase = teclado.nextLine();

        while (numeros > 0 || numeros < 0 || numeros != 0) {
            System.out.println("Introduce un numero o salir: ");

            numeros = teclado.nextInt();

            System.out.println("Has introducido " + frase.toLowerCase());
        }

    }

}
