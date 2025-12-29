/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondetransportepublico.Modelo.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author ivan
 */
class Viaje {

    private int idViaje;
    private LocalDate fecha;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private Conductor conductor;
    private Vehiculo vehiculo;
    private Ruta ruta;
    private Horario horario;
    private List<Boleto> boletos;
    private List<Pasajero> pasajeros;
    

    public Viaje(
            int idViaje, 
            LocalDate fecha, 
            LocalTime horaSalida, 
            LocalTime horaLlegada, 
            Conductor conductor, 
            Vehiculo vehiculo, 
            Ruta ruta, 
            Horario horario, 
            List<Boleto> boletos, 
            List<Pasajero> pasajeros) {
        this.idViaje = idViaje;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.ruta = ruta;
        this.horario = horario;
        this.boletos = boletos;
        this.pasajeros = pasajeros;
    }

    public Viaje() {
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idViaje;
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
        final Viaje other = (Viaje) obj;
        return this.idViaje == other.idViaje;
    }

    @Override
    public String toString() {
        return "Viaje{" + "idViaje=" + idViaje 
                + ", fecha=" + fecha 
                + ", horaSalida=" + horaSalida 
                + ", horaLlegada=" + horaLlegada + '}';
    }
    
    
    
}
