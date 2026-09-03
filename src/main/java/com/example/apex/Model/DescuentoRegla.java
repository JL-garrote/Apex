package com.example.apex.Model;

public class DescuentoRegla {

    private long id;
    private String tipo;
    private String nombre;
    private long valorPorcentaje;
    private long activo;

    public DescuentoRegla() {
    }

    public DescuentoRegla(long id, String tipo, String nombre, long valorPorcentaje, long activo) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.valorPorcentaje = valorPorcentaje;
        this.activo = activo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getValorPorcentaje() {
        return valorPorcentaje;
    }

    public void setValorPorcentaje(long valorPorcentaje) {
        this.valorPorcentaje = valorPorcentaje;
    }

    public long getActivo() {
        return activo;
    }

    public void setActivo(long activo) {
        this.activo = activo;
    }
}
