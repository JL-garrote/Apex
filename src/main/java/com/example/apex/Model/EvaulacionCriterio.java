package com.example.apex.Model;

public class EvaulacionCriterio {

    private long id;
    private long evaulacionID;
    private String criterioNombre;
    private long calificacion;
    private String comentario;

    public EvaulacionCriterio() {
    }

    public EvaulacionCriterio(long id, long evaulacionID, String criterioNombre, long calificacion, String comentario) {
        this.id = id;
        this.evaulacionID = evaulacionID;
        this.criterioNombre = criterioNombre;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEvaulacionID() {
        return evaulacionID;
    }

    public void setEvaulacionID(long evaulacionID) {
        this.evaulacionID = evaulacionID;
    }

    public String getCriterioNombre() {
        return criterioNombre;
    }

    public void setCriterioNombre(String criterioNombre) {
        this.criterioNombre = criterioNombre;
    }

    public long getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(long calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
