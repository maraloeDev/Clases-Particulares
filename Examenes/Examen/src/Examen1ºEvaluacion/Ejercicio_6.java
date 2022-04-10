/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen1;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Ejercicio_6 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int numero = teclado.nextInt();
        
        if (numero% 2 == 0) {
            
            System.out.println("Es par");
            
        }
        else{
            
            System.out.println("Es impar");
        }
    }
    
}
