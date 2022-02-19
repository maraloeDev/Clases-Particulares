package EjerciciosPDF.EjerciciosCondicionales;

public class Ejercicio3 {

    public static void main(String[] args) {


        boolean sePudedeVerJugador = true;
        boolean articuloMortal = true;

        if (sePudedeVerJugador == true && articuloMortal == true) {

            System.out.println("Ataque!");

        } else if (sePudedeVerJugador==true && articuloMortal == true){
            System.out.println("huye");
        }

    else{
        System.out.println("Libre de peligro");
        }
    }
}
