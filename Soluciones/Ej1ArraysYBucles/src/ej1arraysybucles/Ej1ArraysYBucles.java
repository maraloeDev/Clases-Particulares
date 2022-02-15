/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1arraysybucles;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 * @version 1.0
 */
public class Ej1ArraysYBucles {

    /**
     * @param args the command line arguments
     */
    static String[] arrayDeAlimentos;

    public static void main(String[] args) {
        introducirDatos();
        mostrarDatos();
        System.out.println(clonarArray());
        clonarArrayV2();
        System.out.println(agregarArrayList());
    }

    public static void introducirDatos() {
        arrayDeAlimentos = new String[5];
        arrayDeAlimentos[0] = "Hamburgesa";
        arrayDeAlimentos[1] = "Perrito caliente";
        arrayDeAlimentos[2] = "Croquetas";
        arrayDeAlimentos[3] = "Sopa castellana";
        arrayDeAlimentos[4] = "Crema de calabacín";
    }

    /**
     * Mostramos los datos que hay dentro del arrayDeAliemntos
     * 
     * Hay dos soluciones, una con un bucle for y la otra con un bucle for-each.
     * (Si ninguna se comenta, los datos salen dos veces)
     */
    public static void mostrarDatos() {
        //Solución 1
        System.out.println("\nSolcuión 1:");
        for (int i = 0; i < arrayDeAlimentos.length; i++) {
            System.out.println(arrayDeAlimentos[i]);
        }

        System.out.println("\nSolución 2");
        // Solución 2 (for-each)
        for (String dato : arrayDeAlimentos) {
            System.out.println(dato);
        }
        System.out.println();
    }

    /**
     * Crea un nuevo array (llamado arrayClonado) que contiene los mismos
     * elementos que el arrayDeAlimentos utilizando el método .clone()
     *
     * @return
     */
    public static String clonarArray() {
        String[] arrayClonado = arrayDeAlimentos.clone();
        return Arrays.toString(arrayClonado);
    }

    /**
     * Crea un nuevo array (llamado arrayClonadoV2) que contiene los mismos
     * elementos que el arrayDeAlimentos sin utilizar el método .clone()
     */
    public static void clonarArrayV2() {
        // No pongo el 5 directamente para hacerlo de forma genérica. Por tanto, si el arrayDeAlimentos cambia de tamño, éste también lo hará
        String[] arrayClonadoV2 = new String[arrayDeAlimentos.length];

        for (int i = 0; i < arrayClonadoV2.length; i++) {
            arrayClonadoV2[i] = arrayDeAlimentos[i];
        }
    }

    /**
     * Clona el arrayDeAlimentos a un ArrayList (arrayListAlimentos). Luego,
     * creamos una variable de tipo String en la que guardamos los elementos
     * del ArrayList separados por comas
     *
     * @return Cadena extraída del ArrayListAlimentos separando cada dato por
     * una coma
     */
    public static String agregarArrayList() {
        ArrayList<String> arrayListAlimentos = new ArrayList<>();

        // Utilizo arrayDeAlimentos.length porque si utilizo arrayListAlimentos.size() no se va a ejecutar nada porque su valor es 0 (ya que no hay ningún dato almacenado todavía en él)
        for (int i = 0; i < arrayDeAlimentos.length; i++) {
            String alimento = arrayDeAlimentos[i]; // Recojo el dato que hay en cada posición
            arrayListAlimentos.add(alimento);
        }

        //Creo la cadena que se devuelve para la salida por pantalla
        String salida = ""; // Para poder concatenar, debo haberlo inicializado antes
        for (int i = 0; i < arrayListAlimentos.size(); i++) {
            String alimento = arrayListAlimentos.get(i); // Recojo el dato que hay en cada posición

            if (i != arrayListAlimentos.size() - 1) { // Si no estoy en el último dato (n-1) debo poner la coma al final
                salida = salida + alimento + ",";
            } else { // Si estoy en el últimod dato, solo añado el dato
                salida = salida + alimento;

            }
        }

        return salida;
    }

}
