package com.example.apex.Model;

import java.time.LocalDateTime;

public class Reembolso {

    private long id;
    private long matriculaID;
    private long monto;
    private String motivo;
    private String estado;
    private long aprovadoPorUsuario;
    private LocalDateTime fechaSolicitud;
    private LocalDateTime fechaResolucion;

    public Reembolso() {
    }

    public Reembolso(long id, long matriculaID, long monto, String motivo, String estado, long aprovadoPorUsuario, LocalDateTime fechaSolicitud, LocalDateTime fechaResolucion) {
        this.id = id;
        this.matriculaID = matriculaID;
        this.monto = monto;
        this.motivo = motivo;
        this.estado = estado;
        this.aprovadoPorUsuario = aprovadoPorUsuario;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaResolucion = fechaResolucion;
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

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getAprovadoPorUsuario() {
        return aprovadoPorUsuario;
    }

    public void setAprovadoPorUsuario(long aprovadoPorUsuario) {
        this.aprovadoPorUsuario = aprovadoPorUsuario;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDateTime getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDateTime fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }
}