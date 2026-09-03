package com.example.apex.Model;

public class CargoDescuento {

    private long cargoID;
    private long descuentoReglaID;
    private long porcentajeAplicado;

    public CargoDescuento() {
    }

    public CargoDescuento(long cargoID, long descuentoReglaID, long porcentajeAplicado) {
        this.cargoID = cargoID;
        this.descuentoReglaID = descuentoReglaID;
        this.porcentajeAplicado = porcentajeAplicado;
    }

    public long getCargoID() {
        return cargoID;
    }

    public void setCargoID(long cargoID) {
        this.cargoID = cargoID;
    }

    public long getDescuentoReglaID() {
        return descuentoReglaID;
    }

    public void setDescuentoReglaID(long descuentoReglaID) {
        this.descuentoReglaID = descuentoReglaID;
    }

    public long getPorcentajeAplicado() {
        return porcentajeAplicado;
    }

    public void setPorcentajeAplicado(long porcentajeAplicado) {
        this.porcentajeAplicado = porcentajeAplicado;
    }
}
