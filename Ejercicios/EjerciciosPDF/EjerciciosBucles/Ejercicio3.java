package EjerciciosPDF.EjerciciosBucles;

public class Ejercicio3 {

    public static void main(String[] args) {

        double total=100;

        int contador=0;
        for (int i=5; total<1000000; i++){

           //total=(total*(1+(5/100)));
            total=total*1.05;

            contador++;
            System.out.println(contador);
            System.out.println();
            System.out.println(total);
        }
    }
}

// base * (1 +/- porcentaje/100)
// 100 * (1 + 5/100) = 105 * (1 + 5/100) = etc =