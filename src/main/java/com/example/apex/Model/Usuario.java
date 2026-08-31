package com.example.apex.Model;

import java.time.LocalDateTime;

public class Usuario {

    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String passwordHash;
    private String telefono;
    private String rol;
    private long sedeID;
    private long activo;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Usuario() {

    }

    public Usuario(long id, String nombre, String apellido, String email, String passwordHash, String telefono, String rol, long sedeID, long activo, LocalDateTime created_at, LocalDateTime updated_at) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.passwordHash = passwordHash;
        this.telefono = telefono;
        this.rol = rol;
        this.sedeID = sedeID;
        this.activo = activo;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public long getSedeID() {
        return sedeID;
    }

    public void setSedeID(long sedeID) {
        this.sedeID = sedeID;
    }

    public long getActivo() {
        return activo;
    }

    public void setActivo(long activo) {
        this.activo = activo;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
