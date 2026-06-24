package model;

/**
 * Creamos una clase llamada Destinos donde guardaremos atributos para volverlos objetos manejables.
 * Esta clase la determinamos protected para que herede atributos a las subclases que la necesiten.
 */
public class Destinos {

    protected String destino;
    protected String region;
    protected int horasDeViaje;
    protected double precio;

    // Constructores:

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
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "•Destino: " + destino + " |Region: (" + region + ")  |— ⏱️ " + horasDeViaje + " min |— 💰 $" + precio;
    }

    public String getNombre() {
        return destino;
    }


    public int getHoras() {
        return horasDeViaje;
    }
}