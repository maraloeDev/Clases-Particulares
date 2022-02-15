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
class Prestamo {

    // ---- PROPIEDADES DEL OBJETO ----
    private int idPrestamo;
    private float tipoInteres;
    private float cantidadPrestamo;
    private float cantidadPagada;
    private int plazoDevolucion;

    // ---- MÉTODO CONSTRUCTOR ----
    public Prestamo(int idPrestamo, float tipoInteres, float cantidadPrestamo, float cantidadPagada, int plazoDevolucion) {
        this.idPrestamo = idPrestamo;
        this.tipoInteres = tipoInteres;
        this.cantidadPrestamo = cantidadPrestamo;
        this.cantidadPagada = cantidadPagada;
        this.plazoDevolucion = plazoDevolucion;
    }

    // ---- MÉTODOS GETTER Y SETTER ----
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public float getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(float tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public float getCantidadPrestamo() {
        return cantidadPrestamo;
    }

    public void setCantidadPrestamo(float cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }

    public float getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(float cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }

    public int getPlazoDevolucion() {
        return plazoDevolucion;
    }

    public void setPlazoDevolucion(int plazoDevolucion) {
        this.plazoDevolucion = plazoDevolucion;
    }

    // ---- MÉTODO TOSTRING (SOBREESCRITO) ----
    @Override
    public String toString() {
        return "ID del préstamo: " + this.getIdPrestamo() + "\n"
                + "Tipo de interés: " + this.getTipoInteres() + "\n"
                + "Cantidad: " + this.getCantidadPrestamo() + "\n"
                + "Cantidad pagada: " + this.getCantidadPagada() + "\n"
                + "Plazo devolución: " + this.getPlazoDevolucion() + " meses.\n";
    }

}
