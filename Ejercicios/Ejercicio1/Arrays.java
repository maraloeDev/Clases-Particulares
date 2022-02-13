package Ejercicio1;

public class Arrays {


    public static String[] arrayDeAlimentos;

    public static void main(String[] args) {
        introducirDatos();
        mostrarDatos();
        System.out.println(clonarArray());
        clonarArrayV2();
        System.out.println(agregarArrayList());
    }

    public static void introducirDatos() {

        String[] arrayDeAlimentos = new String[5];

        arrayDeAlimentos[0] = "Hambuarguesa";
        arrayDeAlimentos[1] = "Perrito Caliente";
        arrayDeAlimentos[2] = "Croquetas";
        arrayDeAlimentos[3] = "Sopa Castellana";
        arrayDeAlimentos[4] ="Crema de calabacin";


    }

        public static void mostrarDatos(){

            String[] arrayDeAlimentos = new String[5];

            arrayDeAlimentos[0] = "Hambuarguesa";
            arrayDeAlimentos[1] = "Perrito Caliente";
            arrayDeAlimentos[2] = "Croquetas";
            arrayDeAlimentos[3] = "Sopa Castellana";
            arrayDeAlimentos[4] ="Crema de calabacin";

            System.out.println(arrayDeAlimentos[0]);
            System.out.println(arrayDeAlimentos[1]);
            System.out.println(arrayDeAlimentos[2]);
            System.out.println(arrayDeAlimentos[3]);
            System.out.println(arrayDeAlimentos[4]);
    }
        public static String clonarArray(){

            return "";
        }
        public static void clonarArrayV2(){
// Completar el método
        }
        public static String agregarArrayList(){
// Completar el método
            return "";
        }
    }
