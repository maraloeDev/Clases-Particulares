/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaparking;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Maquina {

    private int[][] matriz;
    private double precioPorMinuto;
    private Terminal laTerminal;
    private Deposito elDeposito;
    private ArrayList<Ticket> listadoTickets = new ArrayList();

    public Maquina(double precioPorMinuto) {
        this.precioPorMinuto = precioPorMinuto;
        this.matriz = new int[3][20];
        this.elDeposito = new Deposito();
    }

    public Terminal getLaTerminal() {
        return laTerminal;
    }

    public void setLaTerminal(Terminal laTerminal) {
        this.laTerminal = laTerminal;
    }

    public double getPrecioPorMinuto() {
        return precioPorMinuto;
    }

    public void setPrecioPorMinuto(double precioPorMinuto) {
        this.precioPorMinuto = precioPorMinuto;
    }

    public Deposito getElDeposito() {
        return elDeposito;
    }

    public void setElDeposito(Deposito elDeposito) {
        this.elDeposito = elDeposito;
    }

    public ArrayList<Ticket> getListadoTickets() {
        return listadoTickets;
    }

    public void setListadoTickets(ArrayList<Ticket> listadoTickets) {
        this.listadoTickets = listadoTickets;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    protected double calcularPrecio(){
        LocalDate ahora = LocalDate.now();
        
        return 0;
    }
    

}
