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
public class PracticaParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio = 0.5;
        Maquina laMaquina = new Maquina(precio);
        Terminal laTerminal = new Terminal(precio);

        Ticket elTicket = new Ticket(1, "3515-BVW", 0, 0);
        laTerminal.getListadoTickets().add(elTicket);
        
        elTicket = new Ticket(2, "3515-BVW", 0, 1);
        laTerminal.getListadoTickets().add(elTicket);
        
        elTicket = new Ticket(3, "3515-BVW", 0, 2);
        laTerminal.getListadoTickets().add(elTicket);
        
        elTicket = new Ticket(4, "3515-BVW", 0, 3);
        laTerminal.getListadoTickets().add(elTicket);
        
        elTicket = new Ticket(5, "3515-BVW", 0, 4);
        laTerminal.getListadoTickets().add(elTicket);
        
        elTicket = new Ticket(6, "3515-BVW", 0, 5);
        laTerminal.getListadoTickets().add(elTicket);
        
        elTicket = new Ticket(7, "3515-BVW", 0, 6);
        laTerminal.getListadoTickets().add(elTicket);

        laTerminal.init();
    }

}
