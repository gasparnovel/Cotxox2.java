package edu.ping.cotxox.carrera;

import javax.crypto.interfaces.DHPublicKey;

import edu.ping.cotxox.conductores.Conductor;
import edu.ping.cotxox.conductores.PoolConductores;

public class Carrera {

    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperdo;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;

    
    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /*public double getCosteEsperado(){
        
    }*/

    public int getTiempoEsperdo() {
        return this.tiempoEsperdo;
    }

    public void setTiempoEsperdo(int tiempoEsperdo) {
        this.tiempoEsperdo = tiempoEsperdo;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setConductor(Conductor conductor){

    }

    /*public Conductor getConductor(){
    }*/

    /*public void asignarConductor(PoolConductores poolConductores){

    }*/

    /*public void realizarPago(double pago){

    }*/

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }

    public int getPropina() {
        return this.propina;
    }

    /*public void liberarConductor(){
        
    }*/

}

