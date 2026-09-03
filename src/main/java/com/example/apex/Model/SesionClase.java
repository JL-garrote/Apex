package com.example.apex.Model;

import java.time.LocalDateTime;
import java.util.Date;

public class SesionClase {

    private long id;
    private long grupoID;
    private Date fecha;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFinal;
    private String estado;
    private String motivoCancelacion;

    public SesionClase() {
    }

    public SesionClase(long id, long grupoID, Date fecha, LocalDateTime horaInicio, LocalDateTime horaFinal, String estado, String motivoCancelacion) {
        this.id = id;
        this.grupoID = grupoID;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.estado = estado;
        this.motivoCancelacion = motivoCancelacion;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalDateTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }
}