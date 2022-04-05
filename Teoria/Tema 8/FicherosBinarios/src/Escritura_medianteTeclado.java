
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduardo
 */
public class Escritura_medianteTeclado {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        JFileChooser jf = new JFileChooser();

        jf.showOpenDialog(null);

        //Recojo la ruta donde esta
        File fichero = new File(jf.getSelectedFile().getPath()); // getPath() sirve para que te de la ruta del fichero

        try {

            FileOutputStream escrituraFOS = new FileOutputStream(fichero);
            System.out.println("Escribe algo : ");
            String CadenaSalida = teclado.nextLine();

            for (int i = 0; i < CadenaSalida.length(); i++) {

                char caracter = CadenaSalida.charAt(i);

                char byteEscribir = caracter;

                escrituraFOS.write(byteEscribir);

            }

            escrituraFOS.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}