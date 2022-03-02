package EjerciciosPDF.EjerciciosMetodos;

public class Ejercicio1 {

    public static void main(String[] args) {

        int a = 24;
        int b = 5;

       System.out.println("--------------SUMA-------------" + "\n" +
            a + " + " + b + " = " + suma(24 , 5));

        System.out.println( "--------------RESTA-------------" + "\n" +
            a + " - " + b + " = " +  resta(24, 5));

        System.out.println( "--------------MULTIPLICACIÓN-------------" + "\n" +
                a + " * " + b + " = " +  multiplicacion(24,5));

        System.out.println( "--------------DIVISIÓN-------------" + "\n" +
                a + " / " + b + " = " +  division(24,5));

        System.out.println( "--------------MODULO-------------" + "\n" +
                a + " * " + b + " = " +  modulo(24, 5));

    }

    public static int suma(int a, int b) {

        int total = a + b;
        System.out.println(total);

return total;
    }

    public static int resta( int a, int b){

        int total= a - b;

        return total;
    }

    public static int multiplicacion(int a, int b){

        int total = a * b;

        return total;
    }

    public static int division(int a, int b){

        int total = a / b;

        return total;
    }

    public static int modulo( int a, int b){

        int total = a % b;
        return total;
    }

    /*public static int MayoryMenor(int a, int b){

    }*/
}
