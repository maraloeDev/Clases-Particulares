/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_herencias;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Camion extends Vehiculo{
    private String matriculaSemirremolque;
    
    public Camion(String matriculaSemirremolque, String matricula){
        super.matricula = matricula;
        this.matriculaSemirremolque = matriculaSemirremolque;
    }

    public String getMatricula() {
        return "Desde clase Camion: "+matricula;
    }
    
    
    
}
