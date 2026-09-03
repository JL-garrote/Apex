package com.example.apex.Model;

import java.time.LocalDateTime;
import java.util.Date;

public class Alumno {

    private long id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String dni;
    private String fotoURI;
    private String contactoEmergenciaNombre;
    private String ContactoEmergenciaNumero;
    private LocalDateTime crated_at;

    public Alumno() {
    }

    public Alumno(long id, String nombre, String apellido, Date fechaNacimiento, String dni, String fotoURI, String contactoEmergenciaNombre, String contactoEmergenciaNumero, LocalDateTime crated_at) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.fotoURI = fotoURI;
        this.contactoEmergenciaNombre = contactoEmergenciaNombre;
        ContactoEmergenciaNumero = contactoEmergenciaNumero;
        this.crated_at = crated_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFotoURI() {
        return fotoURI;
    }

    public void setFotoURI(String fotoURI) {
        this.fotoURI = fotoURI;
    }

    public String getContactoEmergenciaNombre() {
        return contactoEmergenciaNombre;
    }

    public void setContactoEmergenciaNombre(String contactoEmergenciaNombre) {
        this.contactoEmergenciaNombre = contactoEmergenciaNombre;
    }

    public String getContactoEmergenciaNumero() {
        return ContactoEmergenciaNumero;
    }

    public void setContactoEmergenciaNumero(String contactoEmergenciaNumero) {
        ContactoEmergenciaNumero = contactoEmergenciaNumero;
    }

    public LocalDateTime getCrated_at() {
        return crated_at;
    }

    public void setCrated_at(LocalDateTime crated_at) {
        this.crated_at = crated_at;
    }
}
