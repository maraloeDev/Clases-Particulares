package EjerciciosPDF;

public class Ejercicio2 {
    public static void main(String[] args) {

        int dogs = 1;
        int cats = 2;
        if (dogs > 0 && cats == 0) {
            if (dogs > 1) {
                System.out.println("Dog lover");
            } else {
                System.out.println("Dog person");
            }
        } else if (cats > 0 && dogs == 0) {
            if (cats > 1) {
                System.out.println("Cat lover");
            } else {
                System.out.println("Cat person");
            }
            System.out.println("Meow!");
        } else if (cats > 0 && dogs > 0) {
            if (dogs > cats) {
                System.out.println("I guess you like dogs more");

            } else if (dogs == cats) {
                System.out.println("I guess you like both equally");
            } else {
                System.out.println("I guess you like cats more");
            }
        } else {
            System.out.println("What, don’t you like pets?");
        }

        //La salida que obtiene el codigo es I guess you like cats more, debido a que los cats no son iguales a los dogs y que los dogs no son mayores que los gatos
    }

}
