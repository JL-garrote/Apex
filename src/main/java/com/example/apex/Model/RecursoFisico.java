package com.example.apex.Model;

public class RecursoFisico {

    private long id;
    private long sedeId;
    private String nombre;
    private String tipo;
    private long capacidad;
    private long activo;

    public RecursoFisico() {

    }

    public RecursoFisico(long id, long sedeId, String nombre, String tipo, long capacidad, long activo) {
        this.id = id;
        this.sedeId = sedeId;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.activo = activo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSedeId() {
        return sedeId;
    }

    public void setSedeId(long sedeId) {
        this.sedeId = sedeId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }

    public long getActivo() {
        return activo;
    }

    public void setActivo(long activo) {
        this.activo = activo;
    }
}
