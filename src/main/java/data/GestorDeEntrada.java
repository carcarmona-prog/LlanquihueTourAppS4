package data;

import model.Destinos;
import model.ExcursionesCulturales;
import model.PaseosLacustres;
import model.RutasGastronomicas;
import org.jetbrains.annotations.NotNull;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Creamos una clase extendida de Destinos, donde creamos las metodos para ingresar nuevas actividades
 * y guardarlas en su respectivo archivo.txt
 */

 public class GestorDeEntrada {


    public static class GestorArchivos {


        public void guardarDestino(String archivo, @NotNull List<Destinos> lista, Destinos nuevo) {
            lista.add(nuevo);
            String registro = nuevo.getDestino() + ";" + nuevo.getRegion() + ";" + nuevo.getHorasDeViaje() + ";" + nuevo.getPrecio()+"\n";
            escribirArchivo(archivo, registro);
        }


        public void guardarPaseo(String archivo, @NotNull List<PaseosLacustres> lista, PaseosLacustres nuevo) {
            lista.add(nuevo);
            String registro =nuevo.getNombre() + ";" + nuevo.getRegion() + ";" + nuevo.getHorasDeViaje() + ";" + nuevo.getPrecio()+"\n";
            escribirArchivo(archivo, registro);
        }


        public void guardarRutaGastronomica(String archivo, @NotNull List<RutasGastronomicas> lista, RutasGastronomicas nueva) {
            lista.add(nueva);
            String registro = nueva.getDestino() + ";" + nueva.getNombreRestaurante() + ";" + nueva.getHorasDeViaje() + ";" + nueva.getPrecio()+"\n";
            escribirArchivo(archivo, registro);
        }


        public void guardarExcursionesCulturales(String archivo, @NotNull List<ExcursionesCulturales> lista, ExcursionesCulturales nuevo) {
            lista.add(nuevo);
            String registro = nuevo.getDestino() + ";" + nuevo.getRegion() + ";" + nuevo.getHorasDeViaje() + ";" + nuevo.getPrecio()+"\n";
            escribirArchivo(archivo, registro);
        }


        /**
         * Metodo privado donde escribe y crea nueva línea en el archivo
         */
        private void escribirArchivo(String archivo, String registro) {
            try (FileWriter fw = new FileWriter(archivo, true)) {
                fw.write(registro + System.lineSeparator());
                System.out.println("Registro guardado en " + archivo);
            } catch (IOException e) {
                System.out.println("Error al escribir en archivo: " + e.getMessage());
            }


        }
    }
 }

