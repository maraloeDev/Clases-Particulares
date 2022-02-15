/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2bucles;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class CuentaBancaria {

    // ---- PROPIEDADES DEL OBJETO ----
    private String DNI;
    private String nombreApellidosTitular;
    private float balance;
    private boolean tienePrestamo;
    private Prestamo prestamo;

    // ---- MÉTODO CONSTRUCTOR ----
    public CuentaBancaria(String DNI, String nombreApellidosTitular, float balance, boolean tienePrestamo, Prestamo prestamo) {
        this.DNI = DNI.toUpperCase();
        this.nombreApellidosTitular = nombreApellidosTitular.toUpperCase();
        this.balance = balance;
        this.tienePrestamo = tienePrestamo;
        if (tienePrestamo == true) {
            this.prestamo = prestamo;
        } else {
            this.prestamo = null;
        }
    }

    // ---- MÉTODOS GETTER Y SETTER ----
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreApellidosTitular() {
        return nombreApellidosTitular;
    }

    public void setNombreApellidosTitular(String nombreApellidosTitular) {
        this.nombreApellidosTitular = nombreApellidosTitular.toUpperCase();
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isTienePrestamo() {
        return tienePrestamo;
    }

    public void setTienePrestamo(boolean tienePrestamo) {
        this.tienePrestamo = tienePrestamo;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

}
