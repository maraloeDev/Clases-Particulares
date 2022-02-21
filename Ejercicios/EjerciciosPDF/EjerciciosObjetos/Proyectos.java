package EjerciciosPDF.EjerciciosObjetos;

public class Proyectos {

    //ATTRIBUTES

    public int codigoProyecto;
    public Persona persona;

    //CONSTRUCTORS

    public Proyectos(int codigoProyecto, Persona persona) {
        this.codigoProyecto = codigoProyecto;
        this.persona = persona;

        // CREARE UN CONSTRUCTOR PARA LA CLASE PERSONA, DEBIDO A QUE EL ATRIBUTO PERSONA LO OBTENGO DE OTRA CLASE
    }

    //METHODS OF UTILITY

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Proyectos{" +
                "codigoProyecto=" + codigoProyecto +
                ", persona=" + persona +
                '}';
    }
}
