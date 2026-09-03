package com.example.apex.Model;

import java.time.LocalDateTime;
import java.util.Date;

public class Matricula {

    private long id;
    private long alumnoID;
    private long grupoID;
    private String estado;
    private Date fechaInicio;
    private Date fichaFinal;
    private String motivoBaja;
    private long ordenEspera;
    private Date fechaLimiteConfirmacion;
    private LocalDateTime created_at;

    public Matricula() {
    }

    public Matricula(long id, long alumnoID, long grupoID, String estado, Date fechaInicio, Date fichaFinal, String motivoBaja, long ordenEspera, Date fechaLimiteConfirmacion, LocalDateTime created_at) {
        this.id = id;
        this.alumnoID = alumnoID;
        this.grupoID = grupoID;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fichaFinal = fichaFinal;
        this.motivoBaja = motivoBaja;
        this.ordenEspera = ordenEspera;
        this.fechaLimiteConfirmacion = fechaLimiteConfirmacion;
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }

    public long getGrupoID() {
        return grupoID;
    }

    public void setGrupoID(long grupoID) {
        this.grupoID = grupoID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFichaFinal() {
        return fichaFinal;
    }

    public void setFichaFinal(Date fichaFinal) {
        this.fichaFinal = fichaFinal;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public long getOrdenEspera() {
        return ordenEspera;
    }

    public void setOrdenEspera(long ordenEspera) {
        this.ordenEspera = ordenEspera;
    }

    public Date getFechaLimiteConfirmacion() {
        return fechaLimiteConfirmacion;
    }

    public void setFechaLimiteConfirmacion(Date fechaLimiteConfirmacion) {
        this.fechaLimiteConfirmacion = fechaLimiteConfirmacion;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
