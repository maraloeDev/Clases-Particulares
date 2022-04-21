/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_ascensor;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ascensor miAscensor = new Ascensor(11, 350);
        miAscensor.entrarSalirPersona(new Persona("Paco perez", 100), true);
        System.out.println(miAscensor.getOcupacion());
        
        miAscensor.entrarSalirPersona(new Persona("xituka", 300), true);
        System.out.println(miAscensor.getOcupacion());
        
        
        miAscensor.entrarSalirPersona(new Persona("Paco perez", 100), false);
        System.out.println(miAscensor.getOcupacion());
        
        miAscensor.entrarSalirPersona(new Persona("xituka", 300), true);
        System.out.println(miAscensor.getOcupacion());
    }
    
}
