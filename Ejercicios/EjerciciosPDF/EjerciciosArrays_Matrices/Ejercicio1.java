package EjerciciosPDF.EjerciciosArrays_Matrices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Ejercicio1 {

    static String[] arrayDeAlimentos = new String[5];

    public static void main(String[] args) {
        introducirDatos();
        mostrarDatos();
        System.out.println(clonarArray());
        clonarArrayV2();
        System.out.println(agregarArrayList());
    }

    public static void introducirDatos() {


        arrayDeAlimentos[0] = "Hamburguesa";
        arrayDeAlimentos[1] = "Perrito Caliente";
        arrayDeAlimentos[2] = "Croquetas";
        arrayDeAlimentos[3] = "Sopa Castellana";
        arrayDeAlimentos[4] = "Crema de calabazin";
    }

    public static void mostrarDatos() {

        System.out.println(Arrays.toString(arrayDeAlimentos));
    }

    public static String clonarArray() {

        System.out.println();
        System.out.println("CLONADO");
        System.out.println();

        String[] arrayClonado = arrayDeAlimentos.clone();

        return "";
    }

    public static void clonarArrayV2() {
// Completar el método
    }

    public static String agregarArrayList() {

// Completar el método
        return "";
    }
}