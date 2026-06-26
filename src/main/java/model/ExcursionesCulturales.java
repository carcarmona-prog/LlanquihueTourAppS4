package model;

/**
 * Creamos una clase llamada ExcursionesCulturales donde guardaremos atributos para volverlos objetos manejables.
 *
 */

public class ExcursionesCulturales {

    private final Destinos  destinos;
    private final String nombreExcursion;


    public ExcursionesCulturales(Destinos destinos, String nombreExcursion) {
        this.destinos = destinos;
        this.nombreExcursion = nombreExcursion;
    }

    public String getDestino() {
        return destinos.getDestino();
    }

    public String getRegion() {
        return destinos.getRegion();
    }

    public int getHorasDeViaje() {
        return destinos.getHorasDeViaje();
    }
    public double getPrecio() {
        return destinos.getPrecio();
    }



    @Override
    public String toString() {
        return "•Excursion cultural: " + nombreExcursion + " | " + destinos.toString();
    }



}
