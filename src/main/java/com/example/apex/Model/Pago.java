package com.example.apex.Model;

import java.time.LocalDateTime;

public class Pago {

    private long id;
    private long cargoID;
    private long matriculaID;
    private long monto;
    private String metodo;
    private String referenciaExterna;
    private LocalDateTime fechaPago;
    private long registradoPorUsuarioID;

    public Pago() {
    }

    public Pago(long id, long cargoID, long matriculaID, long monto, String metodo, String referenciaExterna, LocalDateTime fechaPago, long registradoPorUsuarioID) {
        this.id = id;
        this.cargoID = cargoID;
        this.matriculaID = matriculaID;
        this.monto = monto;
        this.metodo = metodo;
        this.referenciaExterna = referenciaExterna;
        this.fechaPago = fechaPago;
        this.registradoPorUsuarioID = registradoPorUsuarioID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCargoID() {
        return cargoID;
    }

    public void setCargoID(long cargoID) {
        this.cargoID = cargoID;
    }

    public long getMatriculaID() {
        return matriculaID;
    }

    public void setMatriculaID(long matriculaID) {
        this.matriculaID = matriculaID;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getReferenciaExterna() {
        return referenciaExterna;
    }

    public void setReferenciaExterna(String referenciaExterna) {
        this.referenciaExterna = referenciaExterna;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public long getRegistradoPorUsuarioID() {
        return registradoPorUsuarioID;
    }

    public void setRegistradoPorUsuarioID(long registradoPorUsuarioID) {
        this.registradoPorUsuarioID = registradoPorUsuarioID;
    }
}
