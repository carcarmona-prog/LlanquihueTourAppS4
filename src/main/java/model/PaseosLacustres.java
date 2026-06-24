package model;

/**
 * Clase que contiene los atributos de los paseos lacustres.
 * Hereda atributos de la clase padre Destino.
 */

public class PaseosLacustres extends Destinos  {


    public PaseosLacustres(String destino, String region, int horasDeViaje, double precio) {
        super(destino, region, horasDeViaje, precio);

    }


    @Override
    public String toString() {
        return "•Paseos lacustre: " + destino + " |Region: (" + region + ")  |— ⏱️ " + horasDeViaje + " min |— 💰 $" + precio;
    }

}
