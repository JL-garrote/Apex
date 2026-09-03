package com.example.apex.Model;

public class AlumnoTutor {

    private long alumnoID;
    private long tutorUsuarioID;
    private String relacion;
    private long contactoPrincipal;

    public AlumnoTutor() {
    }

    public AlumnoTutor(long alumnoID, long tutorUsuarioID, String relacion, long contactoPrincipal) {
        this.alumnoID = alumnoID;
        this.tutorUsuarioID = tutorUsuarioID;
        this.relacion = relacion;
        this.contactoPrincipal = contactoPrincipal;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }

    public long getTutorUsuarioID() {
        return tutorUsuarioID;
    }

    public void setTutorUsuarioID(long tutorUsuarioID) {
        this.tutorUsuarioID = tutorUsuarioID;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public long getContactoPrincipal() {
        return contactoPrincipal;
    }

    public void setContactoPrincipal(long contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }
}