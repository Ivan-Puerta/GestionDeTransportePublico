/*
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs;//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondetransportepublico.Modelo.Entidades;

import gestiondetransportepublico.Constantes.EstadoBoleto;
import gestiondetransportepublico.Constantes.MetodoPago;
import gestiondetransportepublico.Constantes.TipoBoleto;

/**
 *
 * @author ivan
 */
class Boleto {
    
    private int numBoleto; 
    private TipoBoleto tipoBoleto; 
    private double precioBoleto; 
    private MetodoPago metodoPago; 
    private EstadoBoleto estadoBoleto; 
    private Viaje viaje;
    

    public Boleto(
            int numBoleto, 
            TipoBoleto tipoBoleto, 
            double precioBoleto, 
            MetodoPago metodoPago, 
            EstadoBoleto estadoBoleto, 
            Viaje viaje) {
        this.numBoleto = numBoleto;
        this.tipoBoleto = tipoBoleto;
        this.precioBoleto = precioBoleto;
        this.metodoPago = metodoPago;
        this.estadoBoleto = estadoBoleto;
        this.viaje = viaje;
    }



    public Boleto() {
    }

    public int getNumBoleto() {
        return numBoleto;
    }

    public void setNumBoleto(int numBoleto) {
        this.numBoleto = numBoleto;
    }

    public TipoBoleto getTipoBoleto() {
        return tipoBoleto;
    }

    public void setTipoBoleto(TipoBoleto tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public EstadoBoleto getEstadoBoleto() {
        return estadoBoleto;
    }

    public void setEstadoBoleto(EstadoBoleto estadoBoleto) {
        this.estadoBoleto = estadoBoleto;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numBoleto;
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
        final Boleto other = (Boleto) obj;
        return this.numBoleto == other.numBoleto;
    }

    @Override
    public String toString() {
        return "Boleto{" + "numBoleto=" + numBoleto 
                + ", tipoBoleto=" + tipoBoleto 
                + ", precioBoleto=" + precioBoleto 
                + ", metodoPago=" + metodoPago 
                + ", estadoBoleto=" + estadoBoleto 
                + ", viaje=" + viaje + '}';
    }
    
    
    
}
