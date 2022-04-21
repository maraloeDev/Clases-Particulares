/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaparking;

import java.util.Scanner;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Terminal extends Maquina {

    // *** INTERFACE ***
    Scanner miScanner;

    Terminal(double precioPorMinuto) {
        super(precioPorMinuto);
    }

    public void init() {
        int datoSeleccionado;
        miScanner = new Scanner(System.in);
        do {
            mostrarMenu();

            datoSeleccionado = miScanner.nextInt();

            switch (datoSeleccionado) {
                case 1:
                    aparcarVehiculo();
                    break;
                case 2:
                    sacarVehiculo();
                    break;
            }
        } while (datoSeleccionado != 0);
    }

    public void mostrarMenu() {
        System.out.println("PARKING BLUE-ZONE");
        System.out.println("1. Estacionar vehiculo");
        System.out.println("2. Sacar vehiculo");
        System.out.print("Pulse botón: ");
    }

    /**
     * Muestra los datos
     */
    public void mostrarDatos() {
        for (int i = 0; i < this.getMatriz().length; i++) {
            for (int j = 0; j < this.getMatriz()[0].length; j++) {
                this.getMatriz()[i][j] = 0;
            }
        }
        

        for(int i = 0; i<this.getListadoTickets().size(); i++){
            Ticket ticketRecogido = this.getListadoTickets().get(i);
            int planta = ticketRecogido.getUbicacion().getPiso();
            int plaza = ticketRecogido.getUbicacion().getPlaza();
            int idTicket = ticketRecogido.getId();
            this.getMatriz()[planta][plaza] = idTicket;
        }
        
        /*for (Ticket elTicket : this.getListadoTickets()) {
            this.getMatriz()[elTicket.getUbicacion().getPiso()][elTicket.getUbicacion().getPlaza()] = elTicket.getId();
        }*/

        for (int i = 0; i < this.getMatriz().length; i++) {
            for (int j = 0; j < this.getMatriz()[0].length; j++) {
                System.out.print(this.getMatriz()[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void aparcarVehiculo() {

        String matricula;
        mostrarDatos();
        //miScanner.next();
        System.out.print("Verificando matrícula: ");
        matricula = miScanner.nextLine();
        matricula = miScanner.nextLine();
        System.out.println("Generando ticket...");
        Ticket elTicket = generarTicket(matricula);
        this.getListadoTickets().add(elTicket);
        System.out.println(elTicket);
        mostrarDatos();
    }

    /**
     * Este método genera el ticket de forma automática
     * @param matricula La matricula del vehículo a aparcar
     * @return el ticket generado
     */
    public Ticket generarTicket(String matricula) { 

        //--- ID ---
        int id = 1;
        boolean existePlaza = true;

        while (existePlaza) {
            existePlaza = comprobarPlaza(id);
            if (!existePlaza) {
                break;
            }
            id++;
        }

        //--- PLAZA PLANTA ----
        int piso = -1;
        int plaza = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 20; j++) {
                if (this.getMatriz()[i][j] == 0) { // Mi plaza está vacía
                    piso = i;
                    plaza = j;
                    break;
                }
            }
            if (piso != -1 && plaza != -1) {
                break;
            }
        }

        // --- GENERAR TICKET ---
        Ticket elTicket = new Ticket(id, matricula, piso, plaza);
        return elTicket;
    }

    private boolean comprobarPlaza(int id) {
        for (int i = 0; i < this.getMatriz().length; i++) {
            for (int j = 0; j < this.getMatriz()[0].length; j++) {
                if (this.getMatriz()[i][j] == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public void sacarVehiculo() {
        int ticket;
        System.out.print("Introduzca ticket (id): ");
        ticket = miScanner.nextInt();
        if (comprobarTicketLegible(ticket)) { // El ticket existe
            pagar();
        } else {
            System.out.println("Ticket ilegible");
        }
    }

    private boolean comprobarTicketLegible(int idTicket) {
        for(Ticket elTicket : this.getListadoTickets()){
           if(elTicket.getId() == idTicket)
               return true;
        }
        return false;
    }
    
    private void pagar(){
        System.out.println("Total a pagar: "+this.calcularPrecio());
    }

}
