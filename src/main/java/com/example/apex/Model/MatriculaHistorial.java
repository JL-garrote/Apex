package com.example.apex.Model;

import java.util.Date;

public class MatriculaHistorial {

    private long id;
    private long matriculaID;
    private long grupoAnteriorID;
    private long grupoNumevoID;
    private Date fechaCambio;
    private long autorizadoPorUsuario;
    private String motivo;

    public MatriculaHistorial() {
    }

    public MatriculaHistorial(long id, long matriculaID, long grupoAnteriorID, long grupoNumevoID, Date fechaCambio, long autorizadoPorUsuario, String motivo) {
        this.id = id;
        this.matriculaID = matriculaID;
        this.grupoAnteriorID = grupoAnteriorID;
        this.grupoNumevoID = grupoNumevoID;
        this.fechaCambio = fechaCambio;
        this.autorizadoPorUsuario = autorizadoPorUsuario;
        this.motivo = motivo;
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

    public long getGrupoAnteriorID() {
        return grupoAnteriorID;
    }

    public void setGrupoAnteriorID(long grupoAnteriorID) {
        this.grupoAnteriorID = grupoAnteriorID;
    }

    public long getGrupoNumevoID() {
        return grupoNumevoID;
    }

    public void setGrupoNumevoID(long grupoNumevoID) {
        this.grupoNumevoID = grupoNumevoID;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public long getAutorizadoPorUsuario() {
        return autorizadoPorUsuario;
    }

    public void setAutorizadoPorUsuario(long autorizadoPorUsuario) {
        this.autorizadoPorUsuario = autorizadoPorUsuario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
