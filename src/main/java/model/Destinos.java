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


    public String getRegion() {
        return region;
    }


    public int getHorasDeViaje() {
        return horasDeViaje;
    }

    public String getNombre() {
        return destino;
    }



    public double getPrecio() {
        return this.precio;
    }


    @Override
    public String toString() {
        return "•Destino: " + destino + " |Region: (" + region + ")  |— ⏱️ " + horasDeViaje + " min |— 💰 $" + precio;
    }



}