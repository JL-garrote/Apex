package com.example.apex.Model;

public class Grupo {

    private long id;
    private long categoriaID;
    private String nombre;
    private long instructorUsuarioID;
    private long sedeID;
    private long recursoFisicoID;
    private long cupoMaximo;
    private long precioBase;
    private long duracionMinutos;
    private int activo;

    public Grupo() {}

    public Grupo(long id, long categoriaID, String nombre, long instructorUsuarioID, long sedeID, long recursoFisicoID, long cupoMaximo, long precioBase, long duracionMinutos, int activo) {
        this.id = id;
        this.categoriaID = categoriaID;
        this.nombre = nombre;
        this.instructorUsuarioID = instructorUsuarioID;
        this.sedeID = sedeID;
        this.recursoFisicoID = recursoFisicoID;
        this.cupoMaximo = cupoMaximo;
        this.precioBase = precioBase;
        this.duracionMinutos = duracionMinutos;
        this.activo = activo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(long categoriaID) {
        this.categoriaID = categoriaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getInstructorUsuarioID() {
        return instructorUsuarioID;
    }

    public void setInstructorUsuarioID(long instructorUsuarioID) {
        this.instructorUsuarioID = instructorUsuarioID;
    }

    public long getSedeID() {
        return sedeID;
    }

    public void setSedeID(long sedeID) {
        this.sedeID = sedeID;
    }

    public long getRecursoFisicoID() {
        return recursoFisicoID;
    }

    public void setRecursoFisicoID(long recursoFisicoID) {
        this.recursoFisicoID = recursoFisicoID;
    }

    public long getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(long cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public long getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(long precioBase) {
        this.precioBase = precioBase;
    }

    public long getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(long duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
}