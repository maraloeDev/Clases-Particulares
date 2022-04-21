/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_ascensor;

import java.util.Scanner;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Ascensor {

    private int piso; // Piso en el que se encuentra el ascensor en un momento determinado
    private int pisos; // nº máximo de pisos del ascensor
    private boolean puertas; // ùertas abiertas o cerradas
    private boolean alarma; // 
    private double capacidad;
    private double ocupacion;

    public Ascensor(int pisos, double capacidad) {
        this.piso = 0;
        this.pisos = pisos;
        this.capacidad = capacidad;
        this.puertas = false;
        this.alarma = false;
        this.ocupacion = 0.0;
    }

    // métodos getter and setter
    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public boolean isPuertas() {
        return puertas;
    }

    public void setPuertas(boolean puertas) {
        this.puertas = puertas;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(double ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * Método para abrir y cerrar las puertas del ascensor
     *
     * Método que mira si las puertas están abiertas (true) y las cierra. Si la
     * spuertas están cerradas (false) las abre.
     */
    public void cambiarEstadoPuertas() {
        if (this.isPuertas() == true) {
            this.setPuertas(false);
        } else {
            this.setPuertas(true);
        }
    }

    /**
     * Método para entrar y salir una persona
     *
     * Comprueba si esa persona puede entrar (comprobando el peso total del
     * ascensor si este entrara) Si sale, resta su peso a la ocupación del
     * ascensor.
     *
     * @param persona Persona que va a entrar al ascensor
     * @param entra TRUE si va a entrar, FALSE si va a salir
     */
    public void entrarSalirPersona(Persona persona, boolean entra) {
        if (entra) {
            double futuroPeso = this.getOcupacion() + persona.getPeso();
            if (futuroPeso <= getCapacidad()) {
                this.setOcupacion(futuroPeso);
            }
        } else {
            this.setOcupacion(this.getOcupacion() - persona.getPeso());
        }
    }

    // Para mover el ascensor a un piso determinado
    public void moverAscensor() {
        System.out.println("¿A qué piso desea ir?");
        Scanner miScanner = new Scanner(System.in);
        int piso = -1;

        do {
            piso = miScanner.nextInt();
            miScanner.next();

            if (piso >= 0 || piso <= this.getPisos()) {
                if (this.getPiso() == piso) { // estoy en el mismo piso
                    System.out.println("Estás en ese piso");
                } else { // Puedo cambiar de piso
                    setPiso(piso);
                }
            }
        } while (piso < 0 || piso > this.getPisos()); // Para que me introduzcan valores correctos
    }

    // Activar la alarma manualmente
    public void activarDesactivarAlarma() {
        this.setAlarma(!this.isAlarma());
    }

}
