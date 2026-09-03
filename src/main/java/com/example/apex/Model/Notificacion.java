package com.example.apex.Model;

import java.time.LocalDateTime;

public class Notificacion {

    private long id;
    private String tipo;
    private String canal;
    private String estado;
    private String entidadTipo;
    private long entidadID;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaEnvio;

    public Notificacion() {
    }

    public Notificacion(long id, String tipo, String canal, String estado, String entidadTipo, long entidadID, String mensaje, LocalDateTime fechaCreacion, LocalDateTime fechaEnvio) {
        this.id = id;
        this.tipo = tipo;
        this.canal = canal;
        this.estado = estado;
        this.entidadTipo = entidadTipo;
        this.entidadID = entidadID;
        this.mensaje = mensaje;
        this.fechaCreacion = fechaCreacion;
        this.fechaEnvio = fechaEnvio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEntidadTipo() {
        return entidadTipo;
    }

    public void setEntidadTipo(String entidadTipo) {
        this.entidadTipo = entidadTipo;
    }

    public long getEntidadID() {
        return entidadID;
    }

    public void setEntidadID(long entidadID) {
        this.entidadID = entidadID;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
}