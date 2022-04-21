/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaparking;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Ubicacion {
    private int piso;
    private int plaza;

    public Ubicacion(int piso, int plaza) {
        this.piso = piso;
        this.plaza = plaza;
    }

    public int getPiso() {
        return piso;
    }

    public int getPlaza() {
        return plaza;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "piso=" + piso + ", plaza=" + plaza + '}';
    }
    
    
    
}
