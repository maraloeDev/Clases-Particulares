/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany._ficheros;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class App {

    public static void main(String[] args) {
        //iniciacion();
        ej1();
    }

    static Scanner miScanner = new Scanner(System.in);

    public static void ej1() {
        String tipoFichero;
        long tamanio;
        String nombreFichero;
        String ruta;
        ruta = miScanner.nextLine();

        File ficheroTotal = new File(ruta); // Creación del fichero
        String[] rutas = ficheroTotal.list();

        for (int i = 0; i < rutas.length; i++) {
            File fichero = new File(ruta+"/"+rutas[i]);
            // Comprobamos si es un directorio o un archivo
            if (fichero.isDirectory() == true) {
                tipoFichero = "<DIR>";
            } else {
                tipoFichero = "";
            }

            // Tamaño del archivo
            tamanio = fichero.length();
            
            // Nombre del fichero
            nombreFichero = fichero.getName();

            System.out.println(tipoFichero + "\t" + tamanio + "\t" + nombreFichero);
        }
    }

    public static void iniciacion() {
        File fichero1 = new File("C:\\Users/Rafa/Desktop/pruebas.txt");
        File fichero2 = new File("C:/Users/Rafa/Desktop/pruebas2.txt");

        System.out.println("Can execute? " + fichero1.canExecute());
        System.out.println("Se puede leer? " + fichero1.canRead());
        System.out.println("Se puede escribir? " + fichero1.canWrite());
        System.out.println("CompareTo: " + fichero1.compareTo(fichero2)); // Compara dos ficheros. Devuelve <0 si 

        String cadena = "                   a                    ";
        System.out.println("Is empty? " + cadena.isEmpty()); // Comprueba si está vacío
        System.out.println("Is blank? " + cadena.isBlank()); // Comprueba si está vacío o en blanco
    }
}
