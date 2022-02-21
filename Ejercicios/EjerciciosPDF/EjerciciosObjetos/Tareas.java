package EjerciciosPDF.EjerciciosObjetos;

import java.util.Date;

public class Tareas {

    //ATTRIBUTES

    protected String aplicacion;
    protected Date horasAcabo;
    protected String programador;
    protected String descripcion;

    //METHODS GETTER AND SETTER

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public Date getHorasAcabo() {
        return horasAcabo;
    }

    public void setHorasAcabo(Date horasAcabo) {
        this.horasAcabo = horasAcabo;
    }

    public String getProgramador() {
        return programador;
    }

    public void setProgramador(String programador) {
        this.programador = programador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tareas{" +
                "aplicacion='" + aplicacion + '\'' +
                ", horasAcabo=" + horasAcabo +
                ", programador='" + programador + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
    //METHODS OF UTILITY
}
