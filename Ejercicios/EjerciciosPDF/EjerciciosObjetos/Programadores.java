package EjerciciosPDF.EjerciciosObjetos;

import java.time.LocalDate;

public class Programadores {

    //ATTRIBUTES

    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected String especialidad;
    protected LocalDate fechaDeAlta;
    protected LocalDate fechaDeBaja;
    protected char tipo; //1 SENIOR 2 JUNIOR Y 0 YA NO TRABAJA EN LA EMPRESA

    //CONSTRUCTORS

    public Programadores(String dni, String nombre, String apellidos, String especialidad, LocalDate fechaDeAlta, LocalDate fechaDeBaja, char tipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.fechaDeAlta = fechaDeAlta;
        this.fechaDeBaja = fechaDeBaja;
        this.tipo = tipo;
    }

    public Programadores (String dni, String nombre, String apellidos){ //CONSTRUCTOR PARA DAR DE ALTA AL TRABAJADOR

        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public LocalDate getFechaDeBaja() {
        return fechaDeBaja;
    }

    public void setFechaDeBaja(LocalDate fechaDeBaja) {
        this.fechaDeBaja = fechaDeBaja;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Programadores{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", fechaDeAlta=" + fechaDeAlta +
                ", fechaDeBaja=" + fechaDeBaja +
                ", tipo=" + tipo +
                '}';
    }

    //METHODS OF UTILITY

    public static void altaTrabajador(){


    }

    public static void bajaTrabajador(){

    }

}
