/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondetransportepublico.Modelo.Entidades;

import gestiondetransportepublico.Constantes.EstadoVehiculo;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author ivan
 */
class Vehiculo {

    private int idVehiculo;
    private String numPlaca;
    private String marca;
    private String modelo;
    private int capacidadPasajeros;
    private double kilometrajeActual;
    private EstadoVehiculo estadoVehiculo;
    private LocalDate fechaUltimaRevisionTecnica;
    private List<Ruta> rutas;
    private List<Viaje> viajes;
    private List<Incidente> incidentes;

    public Vehiculo(
            int idVehiculo, 
            String numPlaca, 
            String marca, 
            String modelo, 
            int capacidadPasajeros, 
            double kilometrajeActual, 
            EstadoVehiculo estadoVehiculo, 
            LocalDate fechaUltimaRevisionTecnica, 
            List<Ruta> rutas, 
            List<Viaje> viajes, 
            List<Incidente> incidentes) {
        this.idVehiculo = idVehiculo;
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.kilometrajeActual = kilometrajeActual;
        this.estadoVehiculo = estadoVehiculo;
        this.fechaUltimaRevisionTecnica = fechaUltimaRevisionTecnica;
        this.rutas = rutas;
        this.viajes = viajes;
        this.incidentes = incidentes;
    }

    public Vehiculo() {
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(double kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
    }

    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public LocalDate getFechaUltimaRevisionTecnica() {
        return fechaUltimaRevisionTecnica;
    }

    public void setFechaUltimaRevisionTecnica(LocalDate fechaUltimaRevisionTecnica) {
        this.fechaUltimaRevisionTecnica = fechaUltimaRevisionTecnica;
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idVehiculo;
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
        final Vehiculo other = (Vehiculo) obj;
        return this.idVehiculo == other.idVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo 
                + ", numPlaca=" + numPlaca 
                + ", marca=" + marca 
                + ", modelo=" + modelo 
                + ", capacidadPasajeros=" + capacidadPasajeros 
                + ", kilometrajeActual=" + kilometrajeActual 
                + ", estadoVehiculo=" + estadoVehiculo 
                + ", fechaUltimaRevisionTecnica=" + fechaUltimaRevisionTecnica + '}';
    }
    
    
    
    
}
