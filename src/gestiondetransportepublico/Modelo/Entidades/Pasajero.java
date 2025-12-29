/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondetransportepublico.Modelo.Entidades;

import java.util.List;

/**
 *
 * @author ivan
 */
class Pasajero {

    private int idPasajero;
    private String nombreCompleto;
    private String numTarjetaTransporte;
    private double saldoEnTarjeta;
    private List<Viaje> historialViajes;

    public Pasajero(
            int idPasajero, 
            String nombreCompleto, 
            String numTarjetaTransporte, 
            double saldoEnTarjeta, 
            List<Viaje> historialViajes) {
        this.idPasajero = idPasajero;
        this.nombreCompleto = nombreCompleto;
        this.numTarjetaTransporte = numTarjetaTransporte;
        this.saldoEnTarjeta = saldoEnTarjeta;
        this.historialViajes = historialViajes;
    }

    public Pasajero() {
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumTarjetaTransporte() {
        return numTarjetaTransporte;
    }

    public void setNumTarjetaTransporte(String numTarjetaTransporte) {
        this.numTarjetaTransporte = numTarjetaTransporte;
    }

    public double getSaldoEnTarjeta() {
        return saldoEnTarjeta;
    }

    public void setSaldoEnTarjeta(double saldoEnTarjeta) {
        this.saldoEnTarjeta = saldoEnTarjeta;
    }

    public List<Viaje> getHistorialViajes() {
        return historialViajes;
    }

    public void setHistorialViajes(List<Viaje> historialViajes) {
        this.historialViajes = historialViajes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.idPasajero;
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
        final Pasajero other = (Pasajero) obj;
        return this.idPasajero == other.idPasajero;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "idPasajero=" + idPasajero 
                + ", nombreCompleto=" + nombreCompleto 
                + ", numTarjetaTransporte=" + numTarjetaTransporte 
                + ", saldoEnTarjeta=" + saldoEnTarjeta + '}';
    }
    
    
}
