/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondetransportepublico.Modelo.Entidades;

import gestiondetransportepublico.Constantes.AccionTomada;
import java.time.LocalDate;

/**
 *
 * @author ivan
 */
class Incidente {

    private int codigoIncidente;
    private LocalDate fecha;
    private String hora;
    private String descripcion;
    private AccionTomada accionTomada;
    private Vehiculo vehiculoInvolucrado;
    private Conductor conductorInvolucrado;

    public Incidente(
            int codigoIncidente, 
            LocalDate fecha, 
            String hora, 
            String descripcion, 
            AccionTomada accionTomada, 
            Vehiculo vehiculoInvolucrado, 
            Conductor conductorInvolucrado) {
        this.codigoIncidente = codigoIncidente;
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.accionTomada = accionTomada;
        this.vehiculoInvolucrado = vehiculoInvolucrado;
        this.conductorInvolucrado = conductorInvolucrado;
    }

    public Incidente() {
    }

    public int getCodigoIncidente() {
        return codigoIncidente;
    }

    public void setCodigoIncidente(int codigoIncidente) {
        this.codigoIncidente = codigoIncidente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public AccionTomada getAccionTomada() {
        return accionTomada;
    }

    public void setAccionTomada(AccionTomada accionTomada) {
        this.accionTomada = accionTomada;
    }

    public Vehiculo getVehiculoInvolucrado() {
        return vehiculoInvolucrado;
    }

    public void setVehiculoInvolucrado(Vehiculo vehiculoInvolucrado) {
        this.vehiculoInvolucrado = vehiculoInvolucrado;
    }

    public Conductor getConductorInvolucrado() {
        return conductorInvolucrado;
    }

    public void setConductorInvolucrado(Conductor conductorInvolucrado) {
        this.conductorInvolucrado = conductorInvolucrado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigoIncidente;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Incidente other = (Incidente) obj;
        return this.codigoIncidente == other.codigoIncidente;
    }

    @Override
    public String toString() {
        return "Incidente{" + "codigoIncidente=" + codigoIncidente 
                + ", fecha=" + fecha 
                + ", hora=" + hora 
                + ", descripcion=" + descripcion 
                + ", accionTomada=" + accionTomada 
                + ", conductorInvolucrado=" + conductorInvolucrado + '}';
    }
    
    
}
