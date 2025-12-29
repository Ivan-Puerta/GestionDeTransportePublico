/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondetransportepublico.Modelo.Entidades;

import gestiondetransportepublico.Constantes.TipoServicio;
import java.util.List;

/**
 *
 * @author ivan
 */
public class Ruta {
    
    private int codigoRuta;
    private String nombreRuta;
    private String puntoOrigen;
    private String puntoDestino;
    private List<String> paradas;
    private double kilometrajeTotal;
    private int tiempoEstimadoMin;
    private TipoServicio tipoServicio;
    private List<Vehiculo> vehiculos;
    private List<Viaje> viajes;
    private Horario horario;
    
//contructores
    
    public Ruta(int codigoRuta, String nombreRuta, String puntoOrigen, 
            String puntoDestino, List<String> paradas, double kilometrajeTotal, 
            int tiempoEstimadoMin, TipoServicio tipoServicio, 
            List<Vehiculo> vehiculos, List<Viaje> viajes, Horario horario) {
        this.codigoRuta = codigoRuta;
        this.nombreRuta = nombreRuta;
        this.puntoOrigen = puntoOrigen;
        this.puntoDestino = puntoDestino;
        this.paradas = paradas;
        this.kilometrajeTotal = kilometrajeTotal;
        this.tiempoEstimadoMin = tiempoEstimadoMin;
        this.tipoServicio = tipoServicio;
        this.vehiculos = vehiculos;
        this.viajes = viajes;
        this.horario = horario;
    }



    public Ruta() {
    }

    // getters y setters
    
    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    public int getCodigoRuta() {
        return codigoRuta;
    }

    public void setCodigoRuta(int codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public String getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(String puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public String getPuntoDestino() {
        return puntoDestino;
    }

    public void setPuntoDestino(String puntoDestino) {
        this.puntoDestino = puntoDestino;
    }

    public List<String> getParadas() {
        return paradas;
    }

    public void setParadas(List<String> paradas) {
        this.paradas = paradas;
    }

    public double getKilometrajeTotal() {
        return kilometrajeTotal;
    }

    public void setKilometrajeTotal(double kilometrajeTotal) {
        this.kilometrajeTotal = kilometrajeTotal;
    }

    public int getTiempoEstimadoMin() {
        return tiempoEstimadoMin;
    }

    public void setTiempoEstimadoMin(int tiempoEstimadoMin) {
        this.tiempoEstimadoMin = tiempoEstimadoMin;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    // hash y equals
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.codigoRuta;
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
        final Ruta other = (Ruta) obj;
        return this.codigoRuta == other.codigoRuta;
    }

    // toString
    
    @Override
    public String toString() {
        return "Ruta{" + "codigoRuta=" + codigoRuta 
                + ", nombreRuta=" + nombreRuta 
                + ", puntoOrigen=" + puntoOrigen 
                + ", puntoDestino=" + puntoDestino 
                + ", paradas=" + paradas 
                + ", kilometrajeTotal=" + kilometrajeTotal 
                + ", tiempoEstimadoMin=" + tiempoEstimadoMin 
                + ", tipoServicio=" + tipoServicio 
                + ", vehiculos=" + vehiculos 
                + ", viajes=" + viajes 
                + ", horario=" + horario + '}';
    }


    
}
