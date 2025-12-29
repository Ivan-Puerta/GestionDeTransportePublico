/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondetransportepublico.Modelo.Entidades;

import gestiondetransportepublico.Constantes.DiasDeOperacion;
import java.util.List;

/**
 *
 * @author ivan
 */
class Horario {

    private int codigoHorario;
    private String horarioSalida;
    private String horaEstimadaLlegada;
    private String frecuenciaServicio;
    private List<DiasDeOperacion> diasDeOperacion;
    private Ruta rutaAsignada;
    private List<Viaje> viajes;

    public Horario(
            int codigoHorario, 
            String horarioSalida, 
            String horaEstimadaLlegada, 
            String frecuenciaServicio, 
            List<DiasDeOperacion> diasDeOperacion, 
            Ruta rutaAsignada, 
            List<Viaje> viajes) {
        this.codigoHorario = codigoHorario;
        this.horarioSalida = horarioSalida;
        this.horaEstimadaLlegada = horaEstimadaLlegada;
        this.frecuenciaServicio = frecuenciaServicio;
        this.diasDeOperacion = diasDeOperacion;
        this.rutaAsignada = rutaAsignada;
        this.viajes = viajes;
    }

    public Horario() {
    }

    public int getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(int codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getHoraEstimadaLlegada() {
        return horaEstimadaLlegada;
    }

    public void setHoraEstimadaLlegada(String horaEstimadaLlegada) {
        this.horaEstimadaLlegada = horaEstimadaLlegada;
    }

    public String getFrecuenciaServicio() {
        return frecuenciaServicio;
    }

    public void setFrecuenciaServicio(String frecuenciaServicio) {
        this.frecuenciaServicio = frecuenciaServicio;
    }

    public List<DiasDeOperacion> getDiasDeOperacion() {
        return diasDeOperacion;
    }

    public void setDiasDeOperacion(List<DiasDeOperacion> diasDeOperacion) {
        this.diasDeOperacion = diasDeOperacion;
    }

    public Ruta getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(Ruta rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigoHorario;
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
        final Horario other = (Horario) obj;
        return this.codigoHorario == other.codigoHorario;
    }

    @Override
    public String toString() {
        return "Horario{" + "codigoHorario=" + codigoHorario 
                + ", horarioSalida=" + horarioSalida 
                + ", horaEstimadaLlegada=" + horaEstimadaLlegada 
                + ", frecuenciaServicio=" + frecuenciaServicio + '}';
    }
    
    
}
