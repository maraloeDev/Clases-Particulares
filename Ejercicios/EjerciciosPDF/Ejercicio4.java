package EjerciciosPDF;

public class Ejercicio4 {

    public static void main(String[] args) {


        //INICIALIZO LAS VARIABLES PARA UTILIZARLAS DESPUES
        boolean estaNevando=true;
        boolean estaLloviendo=true;
        float Temperatura=90;

        if (estaLloviendo || estaNevando==true && Temperatura <=5 ){

            System.out.println("Quedate en casa");
        }
        else{
            System.out.println("Vamos a salir");
        }
    }
}
