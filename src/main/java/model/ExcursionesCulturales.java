package model;

/**
 * Creamos una clase llamada ExcursionesCulturales donde guardaremos atributos para volverlos objetos manejables.
 * Esta clase hereda atributos de Destinos.
 */

public class ExcursionesCulturales extends Destinos{

    private String centroCultural;



    public ExcursionesCulturales(String centroCultural, String region, int horasDeViaje, double precio) {

        super(centroCultural,region, horasDeViaje, precio);
        this.centroCultural = centroCultural;


    }

    public String getCentroCultural() {
        return centroCultural;
    }

    public void setCentroCultural(String centroCultural) {
        this.centroCultural = centroCultural;
    }



    @Override
    public String toString() {
        return "•Excursion cultural: " + centroCultural + " |Region: (" + region + ")  |— ⏱️ " + horasDeViaje + " min |— 💰 $" + precio;
    }
}
