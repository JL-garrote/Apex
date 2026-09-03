package com.example.apex.Model;

public class CondicionMedica {

    private long id;
    private long alumnoID;
    private String descripcion;
    private long esRestrictiva;

    public CondicionMedica() {
    }

    public CondicionMedica(long id, long alumnoID, String descripcion, long esRestrictiva) {
        this.id = id;
        this.alumnoID = alumnoID;
        this.descripcion = descripcion;
        this.esRestrictiva = esRestrictiva;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getEsRestrictiva() {
        return esRestrictiva;
    }

    public void setEsRestrictiva(long esRestrictiva) {
        this.esRestrictiva = esRestrictiva;
    }
}