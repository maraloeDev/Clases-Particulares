/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen1ºEvaluacion;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Ejercicio_6 {

    public static Scanner teclado = new Scanner(System.in); //Creo el objeto Scanner, lo pongo estatico, para que lo vean todas las clases del paquete

    public static void main(String[] args) {

        int numero = teclado.nextInt();

        if (numero % 2 == 0) { //Si el numero introducido por el usuario entre 2 es = 0, entonces...

            System.out.println("Es par");

        } else {

            System.out.println("Es impar");
        }
    }

}
