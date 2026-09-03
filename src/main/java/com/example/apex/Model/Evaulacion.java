package com.example.apex.Model;

import java.util.Date;

public class Evaulacion {

    private long id;
    private long alumnoID;
    private long instructorUsuarioID;
    private long grupoID;
    private String periodo;
    private Date fecha;
    private String comentarioGeneral;
    private long recomiendaPromocion;

    public Evaulacion() {
    }

    public Evaulacion(long id, long alumnoID, long instructorUsuarioID, long grupoID, String periodo, Date fecha, String comentarioGeneral, long recomiendaPromocion) {
        this.id = id;
        this.alumnoID = alumnoID;
        this.instructorUsuarioID = instructorUsuarioID;
        this.grupoID = grupoID;
        this.periodo = periodo;
        this.fecha = fecha;
        this.comentarioGeneral = comentarioGeneral;
        this.recomiendaPromocion = recomiendaPromocion;
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

    public long getInstructorUsuarioID() {
        return instructorUsuarioID;
    }

    public void setInstructorUsuarioID(long instructorUsuarioID) {
        this.instructorUsuarioID = instructorUsuarioID;
    }

    public long getGrupoID() {
        return grupoID;
    }

    public void setGrupoID(long grupoID) {
        this.grupoID = grupoID;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentarioGeneral() {
        return comentarioGeneral;
    }

    public void setComentarioGeneral(String comentarioGeneral) {
        this.comentarioGeneral = comentarioGeneral;
    }

    public long getRecomiendaPromocion() {
        return recomiendaPromocion;
    }

    public void setRecomiendaPromocion(long recomiendaPromocion) {
        this.recomiendaPromocion = recomiendaPromocion;
    }
}