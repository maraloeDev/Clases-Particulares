public class Residentes {

    //ATTRIBUTES

    private String dni;
    private String nombre;
    private String apellidos;
    private int nºHabitacion;
    private int incidencias;

    //CONSTRUCTORS

    public Residentes(String dni, String nombre, String apellidos, int nºHabitacion, int incidencias) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nºHabitacion = nºHabitacion;
        this.incidencias = incidencias;
    }

    //METHODS GETTER AND SETTER

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNºHabitacion() {
        return nºHabitacion;
    }

    public void setNºHabitacion(int nºHabitacion) {
        this.nºHabitacion = nºHabitacion;
    }

    public int getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(int incidencias) {
        this.incidencias = incidencias;
    }

    @Override
    public String toString() {
        return
                "dni='" + dni + '\n' +
                "nombre='" + nombre + '\n' +
                "apellidos='" + apellidos + '\n' +
                "nºHabitacion=" + nºHabitacion + '\n' +
                "incidencias=" + incidencias;
    }
}
