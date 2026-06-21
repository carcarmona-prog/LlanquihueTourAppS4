package data;

import model.Destinos;
import model.ExcursionesCulturales;
import model.PaseosLacustres;
import model.RutasGastronomicas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

 public class GestorDeDatos  {

    String archivoDestinos = "src/main/resources/listaDestinos.txt";
     List<Destinos> listaDestinos = new ArrayList<>();


     String archivoGastronomico = "src/main/resources/rutasGastronomicas.txt";
     List<RutasGastronomicas> listaGastronomica = new ArrayList<>();

     String archivoPaseos = "src/main/resources/paseosLacustres.txt";
     List<PaseosLacustres> listaPaseosLacustres = new ArrayList<>();

     String archivoExcursiones = "src/main/resources/excursionesCulturales.txt";
     List<ExcursionesCulturales> listaExcursiones = new ArrayList<>();



     /** Creamos una clase Public para realizar la lógica de separar los atributos leídos por el FileReader,
      * dentro de un try catch para evitar errores de lectura
      */

    public void cargarListaDestinos () {

        try{

               List<String> lineas = Files.readAllLines(Paths.get(archivoDestinos));


           for (String linea : lineas) {

            if (linea.trim().isEmpty()) continue;
            String[] partes = linea.split(";");

            if(partes.length<4){
                System.out.println(linea);
                continue;
            }

            String destino = partes[0];
            String region = partes[1];
            int horasDeViaje = Integer.parseInt(partes[2]);
            double precio = Double.parseDouble(partes[3]);

            Destinos destinosDatos = new Destinos(destino, region, horasDeViaje, precio);

            listaDestinos.add(destinosDatos);

             }

        }catch (IOException e) {
            System.out.println("Error en GestorDeDatos (Destinos): " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en GestorDeDatos (Formato de número): " + e.getMessage());
        }

    }
     public List<Destinos> getListaDestinos() {
         return this.listaDestinos;
     }

     public void cargarRutaGastronomica(){
        try{

            List<String> lineas = Files.readAllLines(Paths.get(archivoDestinos));

            for (String linea : lineas) {
                if (linea.trim().isEmpty()) continue;
                String[] partes = linea.split(";");
                if (partes.length < 4) {
                    System.out.println(linea);

                    continue;
                }
                String nombreRestaurante = partes[0];
                String cuidad = partes[1];
                int horasDeViaje = Integer.parseInt(partes[2]);
                double precio = Double.parseDouble(partes[3]);

                RutasGastronomicas datosGastronomicos = new RutasGastronomicas(nombreRestaurante, cuidad, horasDeViaje, precio);
                listaGastronomica.add(datosGastronomicos);
            }
        }catch(IOException e){
            System.out.println("Error en GestorDeDatos (tour gastronomico): " + e.getMessage());

        }catch (NumberFormatException e) {
            System.out.println("Error en GestorDeDatos (Formato de número): " + e.getMessage());
        }
    }
     public List<RutasGastronomicas> getListaGastronomica() {
         return this.listaGastronomica;
     }

     public void cargarPaseosLacustres(){
        try{
            List<String>lineas = Files.readAllLines(Paths.get(archivoPaseos));
            for (String linea : lineas) {
                if (linea.trim().isEmpty()) continue;
                String[] partes = linea.split(";");
                if (partes.length < 4) {
                    System.out.println(linea);
                    continue;

                }
                String destino = partes[0];
                String region = partes[1];
                int horasDeViaje = Integer.parseInt(partes[2]);
                double precio = Double.parseDouble(partes[3]);

                PaseosLacustres paseosLacustres = new PaseosLacustres(destino,region, horasDeViaje, precio);
                listaPaseosLacustres.add(paseosLacustres);
            }
        }catch(IOException e){
            System.out.println("Error en GestorDeDatos (paseos): " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Error en GestorDeDatos (Formato de número): " + e.getMessage());
        }

     }
     public List<PaseosLacustres> getListaPaseosLacustres() {
        return this.listaPaseosLacustres;
     }

     public void cargarExcursionesCulturales(){
        try{
            List<String> lineas = Files.readAllLines(Paths.get(archivoExcursiones));
            for (String linea : lineas) {
                if (linea.trim().isEmpty()) continue;
                String[] partes = linea.split(";");
                if (partes.length < 4) {
                    System.out.println(linea);
                    continue;
                }
                String centroCultural= partes[0];
                String region = partes[1];
                int horasDeViaje = Integer.parseInt(partes[2]);
                double precio = Double.parseDouble(partes[3]);

                ExcursionesCulturales excursionesCulturales = new ExcursionesCulturales(centroCultural, region, horasDeViaje, precio);
                listaExcursiones.add(excursionesCulturales);
            }

        }catch(IOException e){
            System.out.println("Error en GestorDeDatos (excursiones): " + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Error en GestorDeDatos (Formato de número): " + e.getMessage());
        }
     }
     public List<ExcursionesCulturales> getListaExcursiones(){
        return this.listaExcursiones;
     }


 }

