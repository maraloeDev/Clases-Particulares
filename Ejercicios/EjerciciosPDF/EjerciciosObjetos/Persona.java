package EjerciciosPDF.EjerciciosObjetos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

    //Los metodos son las acciones que puede hacer la clase

    //ATTRIBUTES
    private String dni;
    private String name;
    private String lastName;
    private char sex;
    private LocalDate dateOfBirth;
    private int age;
    private double height; //Altura
    private double weight; //Peso
    private boolean married; //casado

    //CONSTRUCTORS Son todos aquellos datos que tiene que recibir y son con el tipo de dato

    //this se utiliza para que sea el mismo nombre para referirse al atributo de la clase

    public Persona(String dni, String name, String lastName, char sex, LocalDate dateOfBirth, double height, double weight, boolean married) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.age = calcularEdad(dateOfBirth);
        this.height = height;
        this.weight = weight;
        this.married = married;

    }

    public Persona(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    //METHODS GETTER AND SETTER

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", married=" + married +
                '}';
    }
    //METHODS OF UTILITY

    public String dateOfBirth() {

        LocalDate.now(); //te devuelve la fecha altual

        SimpleDateFormat sdf = new SimpleDateFormat("dd-mmm-yyyy"); //Esta seria la plantilla que voy a aplicar

        String fechaNac = sdf.format(this.dateOfBirth); //Siempre que se crea un objeto, hay que definirlo con una variable para guardarlo

        return fechaNac;
    }

    public boolean Edad() {

        return this.age >= 18;

    }

    public char LetraDNI() { //*si fuera un Array devolveria String[]/*

        String dni = "TRWAGMYFPDXBNJZSQVHLCKE";

        int letra = Integer.parseInt(this.dni) % 23; //Integer es el objeto entero

        /*Arrays
        String[] letras = new String[23];  //Numeros que va haber en el Array
        letras[0]="T";
        letras[1]="R";
        letras[2]="W";
        letras[3]="W";
        letras[4]="A";
        letras[5]="G";
        letras[6]="M";
        letras[7]="Y";
        letras[8]="F";
        letras[9]="P";
        letras[10]="D";
        letras[11]="X";
        letras[12]="B";
        letras[13]="N";
        letras[14]="J";
        letras[15]="Z";
        letras[16]="S";
        letras[17]="Q";
        letras[18]="V";
        letras[19]="H";
        letras[20]="L";
        letras[21]="C";
        letras[22]="K";
*/


        return (char) letra;
    }

    public int calcularEdad(LocalDate fecha) { //Recibe por parametro

        LocalDate hoy = LocalDate.now();


        return Period.between(fecha, hoy).getYears(); //Devuelvo el periodo entre (Between)
    }

    public double Peso() {
        double peso = (0.75 * (this.height - 150) + 50);

        return (int) peso;
    }
}
