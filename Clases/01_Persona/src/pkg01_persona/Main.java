/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_persona;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Rafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate fechita = LocalDate.of(2000, Month.MARCH, 20);
        Persona laPersona = new Persona("111A", "Eduardo", "Martin-Sonseca", 'H', fechita, 180, 70.0, false);
        
        System.out.println(laPersona);
    }


    
}
