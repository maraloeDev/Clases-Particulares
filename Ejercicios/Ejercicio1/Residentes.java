package Ejercicio1;

import java.time.Period;
import java.util.Scanner;

public class Residentes {
    public static Scanner teclado = new Scanner(System.in);

    //ATTRIBUTES

    private String dni;
    private String nombre;
    private String apellidos;
    private int nºHabitacion;
    private int incidencias;

    //CONSTRUCTORS

    public Residentes(String dni, String nombre, String apellidos, int nºHabitacion, int incidencias) {

        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nºHabitacion=nºHabitacion;
        this.incidencias=incidencias;

    }
    public Residentes(String Residente) { //Constructor para crear un residente

        this.dni = DNI();
        this.nombre = nombreyapellido();
        this.apellidos = apellidos;
        this.nºHabitacion = nºHabitacion();
        this.incidencias = nºIncidencias();
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
                 dni  +" --- " + nombre +" " + apellidos  + " --- " + nºHabitacion + " --- " + incidencias;
    }

    //METHODS OF UTILITY

    public String DNI(){
        System.out.println("Introduce DNI del residente: ");
        String DNI = teclado.nextLine();
        while ("" == DNI ) {

            System.out.println("DNI mal introducido : ");
            DNI = teclado.nextLine();
        }
        System.out.println("El DNI del residente es " + DNI);
        System.out.println();

        return null;

    }

    public String nombreyapellido() {
        System.out.println("Introduce el nombre y los apellidos del residente: ");

         String residente = teclado.nextLine();
        while ("" == residente) {

            System.out.println("Introduce el nombre y los apellidos del residente: ");
            residente = teclado.nextLine();
        }
        System.out.println("El nombre y los apellidos del residente es " + residente.toUpperCase());
        System.out.println();
        System.out.println();
        System.out.println();
        return null;
    }

    public int nºHabitacion(){
        System.out.println("Introduce nº de habitacion del residente: ");
        int habitación = teclado.nextInt();
        while (habitación<0 ) {

            System.out.println("nº de habitación mal introducido : ");
            habitación = teclado.nextInt();
        }
        System.out.println("El nº de habitación del residente es " + habitación);
        System.out.println();
        return habitación;
    }

    public int nºIncidencias(){
        System.out.println("Introduce nº de incidencias del residente: ");
        int nºIncidencias = teclado.nextInt();

        while (incidencias<0 ) {

            System.out.println("nº de incidencias mal introducido : ");
            incidencias = teclado.nextInt();
        }
        System.out.println("El nº de incidencias del residente es " + nºIncidencias);
        System.out.println();
        return nºIncidencias;
    }
}
