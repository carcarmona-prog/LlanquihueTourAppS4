package model;

/**
 * Clase que contiene los atributos de la actividad "rutas gastronómicas".
 */

public class RutasGastronomicas   {

    private String nombreRestaurante;
    private String ciudad;
    private int horasDeViaje;
    private double precio;

    public RutasGastronomicas() {

    }

    public RutasGastronomicas(String nombreRestaurante, String ciudad, int horasDeViaje, double precio) {
        this.nombreRestaurante = nombreRestaurante;
        this.ciudad = ciudad;
        this.horasDeViaje = horasDeViaje;
        this.precio = precio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getHorasDeViaje() {
        return horasDeViaje;
    }

    public void setHorasDeViaje(int horasDeViaje) {
        this.horasDeViaje = horasDeViaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "•Restaurante disponible: " + nombreRestaurante + "Ciudad: (" + ciudad + ") — ⏱️ " + horasDeViaje + "min — 💰 $" + precio;
    }

    public String getNombre() {
        return nombreRestaurante;
    }

}
