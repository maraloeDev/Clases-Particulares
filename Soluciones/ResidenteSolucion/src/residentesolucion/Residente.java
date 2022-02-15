/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentesolucion;

/**
 *
 * @author Rafa
 */
public class Residente {
    
    // ---- PROPIEDADES DEL OBJETO ----
    private String DNI; // DNI
    private String nomApe; // Nombre y apellidos
    private int numHabi; // Número de habitación
    private int numInci; // Número de incidencias
    
    
    // ---- MÉTODO CONSTRUCTOR ----
    public Residente(String DNI, String nomApe, int numHabi, int numInci) {
        this.DNI = DNI.toUpperCase(); // Da igual como me lo pase el usuario, lo guardará directamente en mayúsculas todo
        this.nomApe = nomApe.toUpperCase(); // Da igual como me lo pase el usuario, lo guardará directamente en mayúsculas todo
        this.numHabi = numHabi;
        this.numInci = numInci;
    }
    
    
    // ---- MÉTODOS GETTER Y SETTER ----
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI.toUpperCase(); // Si se cambia el dni, debo guardarlo en mayúsculas siempre. Por eso, el toUpperCase
    }

    public String getNomApe() {
        return nomApe;
    }

    public void setNomApe(String nomApe) {
        this.nomApe = nomApe.toUpperCase(); // Si se cambia el nombre y apellidos, debo guardarlo en mayúsculas siempre. Por eso, el toUpperCase
    }

    public int getNumHabi() {
        return numHabi;
    }

    public void setNumHabi(int numHabi) {
        this.numHabi = numHabi;
    }

    public int getNumInci() {
        return numInci;
    }

    public void setNumInci(int numInci) {
        this.numInci = numInci;
    }
    
    
    // ---- MÉTODO TOSTRING (SOBREESCRITO) ----

    @Override
    public String toString() {
        return this.getDNI() + " --- " + this.getNomApe() + " --- " + this.getNumHabi() + " --- " + this.getNumInci();
    }
    
    
}
