package model;

/**
 * Clase que contiene los atributos de la actividad "rutas gastronómicas".
 */

public class RutasGastronomicas extends Destinos  {

    private String nombreRestaurante;



    public RutasGastronomicas(String nombreRestaurante, String region, int horasDeViaje, double precio) {
        super(nombreRestaurante, region, horasDeViaje, precio);
        this.nombreRestaurante = nombreRestaurante;

    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getCiudad() {
        return region;
    }

    public void setCiudad(String ciudad) {
        this.region = ciudad;
    }


    @Override
    public String toString() {
        return "•Restaurante disponible: " + nombreRestaurante + " |Ciudad: (" + region + ")  |— ⏱️ " + horasDeViaje + " min |— 💰 $" + precio;
    }

    public String getNombre() {
        return nombreRestaurante;
    }

}
