/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._staticnonstatic;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        metodoPrimero();
        
        App miApp = new App();
        miApp.metodoSegundo();
    }
    
    public static void metodoPrimero(){
        System.out.println("Metodo Primero");
    }
    
    public void metodoSegundo(){
        System.out.println("Metodo segundo");
    }
}
