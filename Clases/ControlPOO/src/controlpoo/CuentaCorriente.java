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
public class CuentaCorriente extends CuentaBancaria {
    // Permite descubiertos
    // Si estamos en descubierto, el interés será 0

    public CuentaCorriente(String entidad, String cuenta, Cliente titular) {
        super(entidad, cuenta, titular);
    }

    // Permite descubiertos
    /**
     * Retira una determinada cantidad de dinero de la cuenta bancaria Si esa
     * cantidad es menor que el dinero que hay en la cuenta (es decir, la cuenta
     * tiene suficientes fondos para afrontar esa retirada), retira el dinero.
     * Si no, no hace nada
     *
     * @param cantidad
     * @return TRUE si ha podido hacer la retirada, FALSE en caso contrario
     */
    @Override
    public boolean retirar(double cantidad) {
        setSaldo(this.getSaldo() - cantidad);
        return true;
    }

    // Si estamos en descubierto, el interés será 0
    /**
     * El día 15 de cada mes, el banco ingresa unos intereses en función del
     * saldo. Comprobamos si el día de hoy es igual al día de paga y, si es así,
     * se ingresan los intereses. Sino, no hace nada.
     */
    @Override
    public void incrementar() {
        int diaDePaga = 15;
        if (this.getSaldo() > 0) {
            if (LocalDate.now().getDayOfMonth() == diaDePaga) {
                double intereses = (this.getSaldo()) * 0.02;
                double saldoFinal = this.getSaldo() + intereses;
                setSaldo(saldoFinal);
            }
        }
    }
}
