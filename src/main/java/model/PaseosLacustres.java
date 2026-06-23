package model;

/**
 * Clase que contiene los atributos de los paseos lacustres.
 */

public class PaseosLacustres  {

    private String destino;
    private String region;
    private int horasDeViaje;
    private double precio;

    public PaseosLacustres() {

    }

    public PaseosLacustres(String destino, String region, int horasDeViaje, double precio) {
        this.destino = destino;
        this.region = region;
        this.horasDeViaje = horasDeViaje;
        this.precio = precio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getHorasDeViaje() {
        return horasDeViaje;
    }

    public void setHorasDeViaje(int horasDeViaje) {
        this.horasDeViaje = horasDeViaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "•Destino: " + destino + "Region: (" + region + ") — ⏱️ " + horasDeViaje + "min — 💰 $" + precio;
    }

    public String getNombre() {
            return destino;
    }

    public int getHoras() {
            return this.horasDeViaje;
    }
}
