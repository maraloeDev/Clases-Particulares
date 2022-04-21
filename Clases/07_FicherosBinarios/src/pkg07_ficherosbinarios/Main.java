/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07_ficherosbinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lecturaFileInputStream();
        //escrituraFileOutputStream();
        lecturaFileReader();
    }
    
    
    
    
    // --- FILE INPUT/OUTPUT STREAM ---
    public static void escrituraFileOutputStream(){
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
        
        File ficheroAbierto = new File(jf.getSelectedFile().getPath());
        try {
            FileOutputStream escrituraFOS = new FileOutputStream(ficheroAbierto);
            String cadenaDeSalida = "Esta es la salida";
            
            for (int i = 0; i < cadenaDeSalida.length(); i++) {
                char caracter = cadenaDeSalida.charAt(i);
                byte byteAEscribir = (byte) caracter;
                escrituraFOS.write(byteAEscribir);
            }
            escrituraFOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void lecturaFileInputStream(){
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
        
        File ficheroAbierto = new File(jf.getSelectedFile().getPath());
        
        try {
            FileInputStream lecturaFIS = new FileInputStream(ficheroAbierto);
            int byteRecogido;
            while((byteRecogido = lecturaFIS.read()) != -1){
                System.out.print((char) byteRecogido);
            }
            lecturaFIS.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    // --- FILE READER/WRITER ---
    public static void lecturaFileReader(){
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
        
        File ficheroAbierto = new File(jf.getSelectedFile().getPath());
        try {
            FileReader lecturaFR = new FileReader(ficheroAbierto);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
