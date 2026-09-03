package com.example.apex.Model;

public class InstructorEspecialidad {

    private long usuarioID;
    private long disciplinaID;

    public InstructorEspecialidad() {
    }

    public InstructorEspecialidad(long usuarioID, long disciplinaID) {
        this.usuarioID = usuarioID;
        this.disciplinaID = disciplinaID;
    }

    public long getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(long usuarioID) {
        this.usuarioID = usuarioID;
    }

    public long getDisciplinaID() {
        return disciplinaID;
    }

    public void setDisciplinaID(long disciplinaID) {
        this.disciplinaID = disciplinaID;
    }
}