package com.example.apex.Model;

import java.time.LocalDateTime;

public class Certificacion {

    private long id;
    private long instructorUsuarioID;
    private String nombre;
    private LocalDateTime fechaEmision;
    private LocalDateTime fechaVencimiento;
    private String archivoURI;

    public Certificacion() {
    }

    public Certificacion(long id, long instructorUsuarioID, String nombre, LocalDateTime fechaEmision, LocalDateTime fechaVencimiento, String archivoURI) {
        this.id = id;
        this.instructorUsuarioID = instructorUsuarioID;
        this.nombre = nombre;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.archivoURI = archivoURI;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getInstructorUsuarioID() {
        return instructorUsuarioID;
    }

    public void setInstructorUsuarioID(long instructorUsuarioID) {
        this.instructorUsuarioID = instructorUsuarioID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getArchivoURI() {
        return archivoURI;
    }

    public void setArchivoURI(String archivoURI) {
        this.archivoURI = archivoURI;
    }
}