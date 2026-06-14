package model;

/**
 * Creamos una clase llamada Destinos donde guardaremos atributos para volverlos objetos manejables.
 */
public class Destinos {

    private String destino;
    private String region;
    private int horasDeViaje;
    private double precio;

    // Constructores:

    public Destinos(){

    }

    public Destinos(String destino, String region, int horasDeViaje, double precio) {
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
        return "Destinos{" +
                "destino='" + destino + '\'' +
                ", region='" + region + '\'' +
                ", horasDeViaje=" + horasDeViaje +
                ", precio=" + precio +
                '}';
    }
}