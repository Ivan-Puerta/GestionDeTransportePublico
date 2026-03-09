/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.modelo;

import domain.enums.TipoServicio;
import java.util.List;

/**
 *
 * @author ivan
 */
public class Ruta {
    
    private int codigoRuta;
    private String nombreRuta;
    private Parada puntoOrigen;
    private Parada puntoDestino;
    private List<Parada> paradasIntermedias;
    private double kilometrajeTotal;
    private int tiempoEstimadoMin;
    private TipoServicio tipoServicio;
    private List<Horario> horarios;
    
//contructores

    public Ruta(int codigoRuta, String nombreRuta, Parada puntoOrigen, 
            Parada puntoDestino, List<Parada> paradasIntermedias,
            double kilometrajeTotal, int tiempoEstimadoMin, 
            TipoServicio tipoServicio, List<Horario> horarios) {
        
        this.codigoRuta = codigoRuta;
        this.nombreRuta = nombreRuta;
        this.puntoOrigen = puntoOrigen;
        this.puntoDestino = puntoDestino;
        this.paradasIntermedias = paradasIntermedias;
        this.kilometrajeTotal = kilometrajeTotal;
        this.tiempoEstimadoMin = tiempoEstimadoMin;
        this.tipoServicio = tipoServicio;
        this.horarios = horarios;
    }
    




    public Ruta() {
    }

    // getters y setters

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

    public Parada getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(Parada puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public Parada getPuntoDestino() {
        return puntoDestino;
    }

    public void setPuntoDestino(Parada puntoDestino) {
        this.puntoDestino = puntoDestino;
    }

    public List<Parada> getParadasIntermedias() {
        return paradasIntermedias;
    }

    public void setParadasIntermedias(List<Parada> paradasIntermedias) {
        this.paradasIntermedias = paradasIntermedias;
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

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
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
        return "Ruta{" + "codigoRuta=" + codigoRuta + ", nombreRuta=" + nombreRuta 
                + ", puntoOrigen=" + puntoOrigen + ", puntoDestino=" + puntoDestino 
                + ", paradasIntermedias=" + paradasIntermedias 
                + ", kilometrajeTotal=" + kilometrajeTotal 
                + ", tiempoEstimadoMin=" + tiempoEstimadoMin 
                + ", tipoServicio=" + tipoServicio + ", horarios=" + horarios + '}';
    }
    



    
}
