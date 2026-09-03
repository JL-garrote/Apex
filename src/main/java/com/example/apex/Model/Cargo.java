package com.example.apex.Model;

import java.util.Date;

public class Cargo {

    private long id;
    private long matriculaID;
    private String periodo;
    private long montoBase;
    private long descuentoTotal;
    private long montoFinal;
    private Date fechaEmisor;
    private Date fechaVencimiento;
    private String estado;

    public Cargo() {
    }

    public Cargo(long id, long matriculaID, String periodo, long montoBase, long descuentoTotal, long montoFinal, Date fechaEmisor, Date fechaVencimiento, String estado) {
        this.id = id;
        this.matriculaID = matriculaID;
        this.periodo = periodo;
        this.montoBase = montoBase;
        this.descuentoTotal = descuentoTotal;
        this.montoFinal = montoFinal;
        this.fechaEmisor = fechaEmisor;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMatriculaID() {
        return matriculaID;
    }

    public void setMatriculaID(long matriculaID) {
        this.matriculaID = matriculaID;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public long getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(long montoBase) {
        this.montoBase = montoBase;
    }

    public long getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(long descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public long getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(long montoFinal) {
        this.montoFinal = montoFinal;
    }

    public Date getFechaEmisor() {
        return fechaEmisor;
    }

    public void setFechaEmisor(Date fechaEmisor) {
        this.fechaEmisor = fechaEmisor;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
