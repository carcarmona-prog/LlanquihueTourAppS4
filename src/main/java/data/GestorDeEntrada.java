package data;

import model.Destinos;
import model.ExcursionesCulturales;
import model.PaseosLacustres;
import model.RutasGastronomicas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Creamos una clase extendida de Destinos, donde creamos las metodos para ingresar nuevas actividades
 * y guardarlas en su respectivo archivo.txt
 */

 public class GestorDeEntrada extends Destinos {


    public static class GestorArchivos {


        public void guardarDestino(String archivo, List<Destinos> lista, Destinos nuevo) {
            lista.add(nuevo);
            String registro = nuevo.getNombre() + ";" + nuevo.getRegion() + ";" + nuevo.getHoras() + ";" + nuevo.getPrecio()+"\n";
            escribirArchivo(archivo, registro);
        }


        public void guardarPaseo(String archivo, List<PaseosLacustres> lista, PaseosLacustres nuevo) {
            lista.add(nuevo);
            String registro = nuevo.getNombre() + ";" + nuevo.getHoras() + ";" + nuevo.getPrecio()+"\n";
            escribirArchivo(archivo, registro);
        }


        public void guardarRutaGastronomica(String archivo, List<RutasGastronomicas> lista, RutasGastronomicas nueva) {
            lista.add(nueva);
            String registro = nueva.getNombre() + ";" + nueva.getCiudad() + ";" + nueva.getHorasDeViaje() + ";" + nueva.getPrecio()+"\n";
            escribirArchivo(archivo, registro);
        }


        public void guardarExcursionesCulturales(String archivo, List<ExcursionesCulturales> lista, ExcursionesCulturales nuevo) {
            lista.add(nuevo);
            String registro = nuevo.getCentroCultural() + ";" + nuevo.getRegion() + ";" + nuevo.getHorasDeViaje() + ";" + nuevo.getPrecio()+"\n";
            escribirArchivo(archivo, registro);
        }


        /**
         * Metodo privado donde escribe y crea nueva línea en el archivo
         * @param archivo
         * @param registro
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

