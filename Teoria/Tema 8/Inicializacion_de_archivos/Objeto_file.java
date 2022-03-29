import java.io.File;

public class Objeto_file {

    public static void main(String[] args) {

        File fichero1 = new File("C:\\Users\\Eduardo\\Desktop\\Rafa1.txt");

        File fichero2 = new File("C:\\Users\\Eduardo\\Desktop\\Rafa2.txt");


        System.out.println("can execute? " + fichero1.canExecute()); //Se puede ejecutar?

        System.out.println("Se puede leer? " + fichero1.canRead()); // Se puede leer?

        System.out.println("Se puede escribir? " + fichero1.canWrite()); //Se puede escribir?

        System.out.println("" + fichero1.compareTo(fichero2)); //Compara los 2 ficheros
    }
}
