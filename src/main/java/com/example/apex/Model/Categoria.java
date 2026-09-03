package com.example.apex.Model;

public class Categoria {

    private long id;
    private long disciplinaID;
    private String nombre;
    private int edadMin;
    private int edadMax;

    public Categoria() {
    }

    public Categoria(long id, long disciplinaID, String nombre, int edadMin, int edadMax) {
        this.id = id;
        this.disciplinaID = disciplinaID;
        this.nombre = nombre;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDisciplinaID() {
        return disciplinaID;
    }

    public void setDisciplinaID(long disciplinaID) {
        this.disciplinaID = disciplinaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }
}
