
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class Lectura {
    
//LECTURA DE ARCHIVOS
    
    public static void main(String[] args) {

        JFileChooser jf = new JFileChooser();

        jf.showOpenDialog(null);

        //Recojo la ruta donde esta
        File fichero = new File(jf.getSelectedFile().getPath()); // getPath() sirve para que te de la ruta del fichero

        try {
            FileInputStream lecturaFIS = new FileInputStream(fichero);
            int byteRecogido;
            while ((byteRecogido = lecturaFIS.read()) != -1) {

                System.out.print((char) byteRecogido);

            }
            
            lecturaFIS.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
