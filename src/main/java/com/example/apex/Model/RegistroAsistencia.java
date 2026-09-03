package com.example.apex.Model;

import java.time.LocalDateTime;

public class RegistroAsistencia {

    private long id;
    private long sesionClaseID;
    private long alumnoID;
    private String estado;
    private String observacion;
    private long registradoPorUsuario;
    private LocalDateTime created_at;

    public RegistroAsistencia() {
    }

    public RegistroAsistencia(long id, long sesionClaseID, long alumnoID, String estado, String observacion, long registradoPorUsuario, LocalDateTime created_at) {
        this.id = id;
        this.sesionClaseID = sesionClaseID;
        this.alumnoID = alumnoID;
        this.estado = estado;
        this.observacion = observacion;
        this.registradoPorUsuario = registradoPorUsuario;
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSesionClaseID() {
        return sesionClaseID;
    }

    public void setSesionClaseID(long sesionClaseID) {
        this.sesionClaseID = sesionClaseID;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public long getRegistradoPorUsuario() {
        return registradoPorUsuario;
    }

    public void setRegistradoPorUsuario(long registradoPorUsuario) {
        this.registradoPorUsuario = registradoPorUsuario;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
