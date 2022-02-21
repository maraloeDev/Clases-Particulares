package EjerciciosPDF.EjerciciosObjetos;

public class Proyectos {

    //ATTRIBUTES

    protected int codigoProyecto;
    protected String nombre;
    protected String coordinador;

    //CONSTRUCTORS

    public Proyectos(int codigoProyecto, String nombre, String coordinador) {
        this.codigoProyecto = codigoProyecto;
        this.nombre = nombre;
        this.coordinador = coordinador;
    }

    //METHODS GETTER AND SETTER

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public String toString() {
        return "Proyectos{" +
                "codigoProyecto=" + codigoProyecto +
                ", nombre='" + nombre + '\'' +
                ", coordinador='" + coordinador + '\'' +
                '}';
    }

    //METHODS OF UTILITY
}
