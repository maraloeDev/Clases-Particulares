package Ejercicio1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ComandoDir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una ruta");
        String ruta = scanner.nextLine();

        File file = new File(ruta);

        if (!file.isDirectory()) {
            System.out.println("Ruta no extistente.");
        } else {

            String[] list = file.list();
            for (String f : list) {
                System.out.println(f);
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        long milisex = 1705352176;
        Date date = new Date();

        System.out.println(simpleDateFormat.format(date));
    }


}
