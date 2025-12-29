/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondetransportepublico.Modelo.Entidades;

import gestiondetransportepublico.Constantes.CategoriaLicencia;
import gestiondetransportepublico.Constantes.TurnoAsignado;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author ivan
 */
class Conductor {

    private int idConductor;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String numLicencia;
    private CategoriaLicencia categoriaLicencia;
    private LocalDate fechaVencimientoLicencia;
    private TurnoAsignado turnoAsignado;
    private List<Viaje> viajesAsignados;
    private List<Incidente> Incidentes;

    public Conductor(
            int idConductor, 
            String nombre, 
            String pApellido, 
            String sApellido, 
            String numLicencia, 
            CategoriaLicencia categoriaLicencia, 
            LocalDate fechaVencimientoLicencia, 
            TurnoAsignado turnoAsignado, 
            List<Viaje> viajesAsignados, 
            List<Incidente> Incidentes) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.numLicencia = numLicencia;
        this.categoriaLicencia = categoriaLicencia;
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
        this.turnoAsignado = turnoAsignado;
        this.viajesAsignados = viajesAsignados;
        this.Incidentes = Incidentes;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public CategoriaLicencia getCategoriaLicencia() {
        return categoriaLicencia;
    }

    public void setCategoriaLicencia(CategoriaLicencia categoriaLicencia) {
        this.categoriaLicencia = categoriaLicencia;
    }

    public LocalDate getFechaVencimientoLicencia() {
        return fechaVencimientoLicencia;
    }

    public void setFechaVencimientoLicencia(LocalDate fechaVencimientoLicencia) {
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
    }

    public TurnoAsignado getTurnoAsignado() {
        return turnoAsignado;
    }

    public void setTurnoAsignado(TurnoAsignado turnoAsignado) {
        this.turnoAsignado = turnoAsignado;
    }

    public List<Viaje> getViajesAsignados() {
        return viajesAsignados;
    }

    public void setViajesAsignados(List<Viaje> viajesAsignados) {
        this.viajesAsignados = viajesAsignados;
    }

    public List<Incidente> getIncidentes() {
        return Incidentes;
    }

    public void setIncidentes(List<Incidente> Incidentes) {
        this.Incidentes = Incidentes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.idConductor;
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
        final Conductor other = (Conductor) obj;
        return this.idConductor == other.idConductor;
    }

    @Override
    public String toString() {
        return "Conductor{" + "idConductor=" + idConductor 
                + ", nombre=" + nombre 
                + ", pApellido=" + pApellido 
                + ", sApellido=" + sApellido 
                + ", numLicencia=" + numLicencia 
                + ", categoriaLicencia=" + categoriaLicencia 
                + ", fechaVencimientoLicencia=" + fechaVencimientoLicencia 
                + ", turnoAsignado=" + turnoAsignado + '}';
    }
    
    
}
