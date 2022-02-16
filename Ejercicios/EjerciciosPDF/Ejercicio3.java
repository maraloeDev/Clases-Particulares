package EjerciciosPDF;

public class Ejercicio3 {

        //ATTRIBUTES

        private boolean sePuedeVerJugardor;
        private boolean ArticuloMortal;

        //CONSTRUCTORS

        public Ejercicio3(boolean sePuedeVerJugardor, boolean articuloMortal) {
                this.sePuedeVerJugardor = sePuedeVerJugardor;
                ArticuloMortal = articuloMortal;
        }

        //METHODS GETTER AND SETTER

        public boolean isSePuedeVerJugardor() {
                return sePuedeVerJugardor;
        }

        public void setSePuedeVerJugardor(boolean sePuedeVerJugardor) {
                this.sePuedeVerJugardor = sePuedeVerJugardor;
        }

        public boolean isArticuloMortal() {
                return ArticuloMortal;
        }

        public void setArticuloMortal(boolean articuloMortal) {
                ArticuloMortal = articuloMortal;
        }

        //METHODS OF UTILITY

        @Override
        public String toString() {
                return "Condiciones" + "sePuedeVerJugardor=" + sePuedeVerJugardor + ", ArticuloMortal=" + ArticuloMortal;
        }

        public void Ataque( boolean puedeVer, boolean derrotar) {

                if (puedeVer==true && derrotar==true){
                        System.out.println("El enemigo puede ver al jugador");
                        System.out.println("-------------------------------------");
                }
                else {
                        System.out.println("El jugador puede ver al enemigo");

                }
        }

        public void huye( boolean salir, boolean derrotar){

                if (salir==true && derrotar==false ){
                        System.out.println("El enemigo puede ver al jugador");
                }
                else {
                        System.out.println("No puedes derrotar al enemigo");
                }
        }

        public void LibreDePeligro(boolean NoDetectado){

                if (NoDetectado==false){
                        System.out.println("El jugador no esta siendo visto por el enemigo");
                }
                else {
                        System.out.println("El jugador esta siendo visto por el enemigo");
                }
        }

}

