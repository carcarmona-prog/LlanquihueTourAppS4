package model;

/**
 * Creamos una clase llamada ExcursionesCulturales donde guardaremos atributos para volverlos objetos manejables.
 * Esta clase hereda atributos de Destinos.
 */

public class ExcursionesCulturales extends Destinos{

    public ExcursionesCulturales(String destino, String region, int horasDeViaje, double precio) {

        super(destino, region, horasDeViaje, precio);

    }


    @Override
    public String toString() {
        return "•Excursion cultural: " + destino + " |Region: (" + region + ")  |— ⏱️ " + horasDeViaje + " min |— 💰 $" + precio;
    }
}
