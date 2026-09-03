package com.example.apex.Model;

import java.util.Date;

public class HorarioRecurrente {

    private long id;
    private long grupoID;
    private long diaSemana;
    private Date horaInicio;
    private Date horaFin;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;

    public HorarioRecurrente() {
    }

    public HorarioRecurrente(long id, long grupoID, long diaSemana, Date horaInicio, Date horaFin, Date fechaInicioVigencia, Date fechaFinVigencia) {
        this.id = id;
        this.grupoID = grupoID;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGrupoID() {
        return grupoID;
    }

    public void setGrupoID(long grupoID) {
        this.grupoID = grupoID;
    }

    public long getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(long diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }
}