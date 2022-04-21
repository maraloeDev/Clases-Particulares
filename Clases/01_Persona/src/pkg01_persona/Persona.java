/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_persona;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Rafa
 */
public class Persona {
    // Propiedades
    
    private String dni;
    private String nombre;
    private String apellidos;
    private char sexo;
    private LocalDate fechaNacimiento;
    private int edad;
    private int altura;
    private double peso;
    private boolean casado;

    public Persona(String dni, String nombre, String apellidos, char sexo, LocalDate fechaNacimiento, int altura, double peso, boolean casado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(fechaNacimiento);
        this.altura = altura;
        this.peso = peso;
        this.casado = casado;
    }

    public String getDni() {
        return dni;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", casado=" + casado + '}';
    }
    
    public char letraDNI(){
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        
        
        int division = 0;
        char letra = letrasDNI.charAt(division);
        
        return letra;
    }
    
    
    public void devuelveFecha(){
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        
        
    }
    
    public int calcularEdad(LocalDate fecha){
        LocalDate ahora = LocalDate.now();
        
        return Period.between(fecha, ahora).getYears();
        
    }
    
    
}
