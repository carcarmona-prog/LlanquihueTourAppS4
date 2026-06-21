package model;

public class ExcursionesCulturales {

    private String centroCultural;
    private String region;
    private int horasDeViaje;
    private double precio;

    public ExcursionesCulturales() {
    }

    public ExcursionesCulturales(String centroCultural, String region, int horasDeViaje, double precio) {
        this.centroCultural = centroCultural;
        this.region = region;
        this.horasDeViaje = horasDeViaje;
        this.precio = precio;
    }

    public String getCentroCultural() {
        return centroCultural;
    }

    public void setCentroCultural(String centroCultural) {
        this.centroCultural = centroCultural;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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
        return "•Excursion cultural: " + centroCultural + "Region: (" + region + ") — ⏱️ " + horasDeViaje + " min — 💰 $" + precio;
    }
}
