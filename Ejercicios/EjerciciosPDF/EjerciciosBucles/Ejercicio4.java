package EjerciciosPDF.EjerciciosBucles;

public class Ejercicio4 {


    public static void main(String[] args) {

        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            String thisRow = "";
            for (int j = 0; j < i; j++) {
                thisRow = thisRow + "#";
            }
            System.out.println(thisRow);
        }

    }

    //LA SALIDA ES # ## ### DEBIDO A QUE SE EJECUTA EL SEGUNDO BUCLE, POR QUE j=0  ENTONCES, Si J ES MENOR QUE I=1, incrementa 1 si es verdad, si no se vuelve a repetir el bucle
}