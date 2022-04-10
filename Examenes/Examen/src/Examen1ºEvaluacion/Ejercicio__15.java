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
public class Ejercicio__15 {

    public static void main(String[] args) {

        System.out.println("Escribe un numero entre el 1 y el 50: ");

        int numero = teclado.nextInt();

        int total = numero + 1;
        int numAnterior = numero - 1;
        System.out.println("El siguiente numero al introducido es el: " + total);

        System.out.println("El anterior numero al introducido es el : " + numAnterior);

    }

}
