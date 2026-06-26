package model;

/**
 * Clase que contiene los atributos de los paseos lacustres.
 * Hereda atributos de la clase padre Destino.
 */

public class PaseosLacustres  {

    private final Destinos  destino;
    private final String nombrePaseo;



    public PaseosLacustres(Destinos destino, String nombrePaseo) {
        this.destino = destino;
        this.nombrePaseo = nombrePaseo;


    }

    public String getRegion() {
        return destino.getRegion();
    }

    public int getHorasDeViaje() {
        return destino.getHorasDeViaje();
    }
    public String getNombre() {
        return destino.getNombre();
    }

    public double getPrecio() {
        return destino.getPrecio();
    }

    @Override
    public String toString() {
        return "•Paseos lacustre: " + destino + "|" + nombrePaseo;
    }


}
