/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlpoo;

import java.time.LocalDate;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class CuentaJoven extends CuentaBancaria{

    private double saldoMinimo;

    public CuentaJoven(String entidad, String cuenta, Cliente titular, double saldoMinimo) {
        super(entidad, cuenta, titular);
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    
    /**
     * El día 15 de cada mes, el banco ingresa unos intereses en función del
     * saldo. Comprobamos si el día de hoy es igual al día de paga y, si es así,
     * se ingresan los intereses. Sino, no hace nada.
     */
    @Override
    public void incrementar() {
        int diaDePaga = 15;
        if (this.getSaldo() >= this.getSaldoMinimo()) {
            if (LocalDate.now().getDayOfMonth() == diaDePaga) {
                double intereses = (this.getSaldo()) * 0.02;
                double saldoFinal = this.getSaldo() + intereses;
                setSaldo(saldoFinal);
            }
        }
    }

    @Override
    public String toString() {
        return "-CCC: " + this.getCodigoCuentaCliente()
                + "\n-FECHA DE APERTURA: " + this.fechaAperturaCadena()
                + "\n-SALDO: " + this.getSaldo()
                + "\n-SALDO MINIMO: " + this.getSaldoMinimo()
                + "\n-DATOS DEL TITULAR: " + this.getTitular();
    }

}
