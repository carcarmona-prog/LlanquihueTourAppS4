package model;

/**
 * Clase que contiene los atributos de la actividad "rutas gastronómicas".
 * Hereda atributos de Destino.
 */

 public class RutasGastronomicas extends Destinos  {




    public RutasGastronomicas(String destino, String region, int horasDeViaje, double precio) {
        super(destino, region, horasDeViaje, precio);


    }

    public String getCiudad() {
        return region;
    }

    @Override
    public String toString() {
        return "•Restaurante disponible: " + destino + " |Region: (" + region + ")  |— ⏱️ " + horasDeViaje + " min |— 💰 $" + precio;
    }


 }
