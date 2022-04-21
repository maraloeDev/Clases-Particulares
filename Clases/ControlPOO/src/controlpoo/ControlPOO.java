/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlpoo;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class ControlPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Cuentas bancarias de prueba: (Los DC se generan por el programa)
         * Entidad: 00781641 Cuenta: 3080053174. Los DC son: 31
         * E: 20857508 C: 3560295397 => DC: 93
         * E: 00788915 C: 7073274383 => DC: 34
         * E: 00192184 C: 4899750893 => DC: 85
         * E: 20480319 C: 5893353270 => DC: 11
         */
        
         // Crear un núevo cliente para pasarselo a la cuenta bancaria como titular
        Cliente elCliente = new Cliente(0, "111-A", "Francisco", "Pérez", "Carrer de las Alforjas Viejas, 3", "+34654456456");
        // Crear la cuenta bancaria
        CuentaCorriente laCuenta = new CuentaCorriente("00781641", "3080053174", elCliente);
        CuentaJoven laCuentaJoven = new CuentaJoven("20480319", "5893353270", elCliente, 1000);
        
        // Probando los métodos (CuentaJoven)
        laCuentaJoven.ingresar(1100);
        System.out.println("Saldo Actual: "+laCuentaJoven.getSaldo());
        
        laCuentaJoven.incrementar();
        System.out.println("Saldo Actual: "+laCuentaJoven.getSaldo());

        // Probando los métodos (CuentaCorriente - CuentaBancaria)
        System.out.println("Datos Cuenta: \n"+laCuenta);
        System.out.println("\n");
        
        laCuenta.ingresar(1000);
        System.out.println("Saldo Actual: "+laCuenta.getSaldo());
        
        laCuenta.incrementar();
        System.out.println("Saldo Actual: "+laCuenta.getSaldo());
        
        double cantidad = 1500; // Para modificarlo y ver si funciona
        if(laCuenta.retirar(cantidad) == false){
            System.out.println("No se ha podido retirar esa cantidad. Saldo insuficiente.");
        }else{
            System.out.println("Saldo retirado correctamente.");
        }
        System.out.println("Saldo Actual: "+laCuenta.getSaldo());
        
        laCuenta.incrementar();
        System.out.println("Saldo Actual: "+laCuenta.getSaldo());
    }

}
