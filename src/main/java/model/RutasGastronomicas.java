package model;

/**
 * Clase que contiene los atributos de la actividad "rutas gastronómicas".
 * Hereda atributos de Destino.
 */

 public class RutasGastronomicas {

     private final String nombreRestaurante;
     private final Destinos destinos;





    public RutasGastronomicas(Destinos destinos, String nombreRestaurante) {
        this.destinos = destinos;
        this.nombreRestaurante = nombreRestaurante;



    }
    public String getDestino() {
        return destinos.getDestino();
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getHorasDeViaje() {
        return  destinos.getHorasDeViaje();
    }

    public double getPrecio() {
        return  destinos.getPrecio();
    }

    @Override
    public String toString() {
        return "•Restaurante disponible: " + nombreRestaurante +" | "+ destinos ;
    }



}
