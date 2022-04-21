/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaparking;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class Ticket {

    private int id;
    private String matricula;
    private LocalDate fechaYHora;
    private Ubicacion ubicacion;

    public Ticket(int id, String matricula, int piso, int plaza) {
        this.id = id;
        this.matricula = matricula;
        this.fechaYHora = LocalDate.now();
        this.ubicacion = new Ubicacion(piso, plaza);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDate fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    private String fechaCadena() {
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        String cadena = outputFormat.format(this.getFechaYHora());

        return cadena;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", matricula=" + this.getMatricula() + ", fechaYHora=" + this.getFechaYHora() + ", ubicacion=" + ubicacion + '}';
    }

}
