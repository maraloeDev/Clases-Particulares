/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_arrays;

/**
 *
 * @author Rafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array es colección
        
        // tipoDato[] nombreArray = new tipoDato[numeroElementos]
        String[] nombresDePersonas = new String[4];
        nombresDePersonas[0] = "Juan";
        nombresDePersonas[1] = "Luis";
        nombresDePersonas[2] = "Laura";
        nombresDePersonas[3] = "Pedro";
        
        
        for(int i = 0; i<nombresDePersonas.length; i++){
            System.out.println(nombresDePersonas[i]);
        }
        
    }
    
}
