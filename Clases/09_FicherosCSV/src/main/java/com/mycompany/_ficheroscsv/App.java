/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._ficheroscsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class App {

    public static void main(String[] args) {
        //Comunidad autonoma , Estacion , Altura , Mes , T , TM , Tm , R , H , DR , DN , DT , DF , DH , DD , I
        
        // LECTURA
        ArrayList objetos = new ArrayList();
        String direccionFichero = "C:\\Users\\Rafa\\Desktop\\ValoresClimatologicosFINAL_V3.csv";
        File ficheroClima = new File(direccionFichero);
        try {
            Scanner lector = new Scanner(ficheroClima);
            while(lector.hasNext()){
                String lectura = lector.nextLine();
                String[] datosFichero = lectura.split(",");
                DatosFichero datos = new DatosFichero(datosFichero[0], datosFichero[1], datosFichero[2], datosFichero[3], datosFichero[4], datosFichero[5], datosFichero[6], datosFichero[7], datosFichero[8], datosFichero[9], datosFichero[10], datosFichero[11], datosFichero[12], datosFichero[13], datosFichero[14], datosFichero[15]);
                objetos.add(datos);
            }
            lector.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        // ESCRITURA
        String direccionSalida = "C:\\Users\\Rafa\\Desktop\\salida.csv";
        File ficheroSalida = new File(direccionSalida);
        try {
            FileWriter fW = new FileWriter(ficheroSalida);
            for(int i = 0; i<objetos.size(); i++){
                DatosFichero datoRecogido = (DatosFichero) objetos.get(i);
                fW.write(datoRecogido.toString()+"\n");
            }
            fW.close();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
