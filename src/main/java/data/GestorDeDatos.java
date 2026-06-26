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

/**
 * Creamos una clase llamada GestorDeDatos donde el programa carga y lee los datos,
 * provenientes de archivos .csv
 */

 public class GestorDeDatos  {


    /**
     * Creamos las listas de cada ruta donde guardaremos la lectura de los archivos correspondientes
     */

    String archivoDestinos = "src/main/resources/listaDestinos.txt";
     List<Destinos> listaDestinos = new ArrayList<>();

     String archivoGastronomico = "src/main/resources/rutasGastronomicas.txt";
     List<RutasGastronomicas> listaGastronomica = new ArrayList<>();

     String archivoPaseos = "src/main/resources/paseosLacustres.txt";
     List<PaseosLacustres> listaPaseosLacustres = new ArrayList<>();

     String archivoExcursiones = "src/main/resources/excursionesCulturales.txt";
     List<ExcursionesCulturales> listaExcursiones = new ArrayList<>();



     /** Creamos una clase pública para realizar la lógica de separar los atributos leídos por el FileReader,
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

    /**
     * Creamos un metodo público para llamar la lista de destinos creada
     * @return la lista creada después de separar y leer las partes del archivo.
     */
     public List<Destinos> getListaDestinos() {
         return this.listaDestinos;
     }

    /**
     * Creamos un metodo donde cargamos los datos leídos del archivo.
     */

    public void cargarRutaGastronomica(){
        try{

            List<String> lineas = Files.readAllLines(Paths.get(archivoGastronomico));

            for (String linea : lineas) {
                if (linea.trim().isEmpty()) continue;
                String[] partes = linea.split(";");
                if (partes.length < 4) {
                    System.out.println(linea);

                    continue;
                }
                String nombreRestaurante = partes[0];
                String region= partes[1];
                int horasDeViaje = Integer.parseInt(partes[2]);
                double precio = Double.parseDouble(partes[3]);


                Destinos destinos = new Destinos(nombreRestaurante, region, horasDeViaje, precio);
                RutasGastronomicas datosGastronomicos = new RutasGastronomicas(destinos,nombreRestaurante);
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

    /**
     * Creamos un metodo donde cargamos los datos leídos del archivo.
     */

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

                Destinos paseo = new Destinos(destino, region, horasDeViaje, precio);
                PaseosLacustres paseosLacustres = new PaseosLacustres(paseo, "");
                listaPaseosLacustres.add(paseosLacustres);
            }
        }catch(IOException e){
            System.out.println("Error en GestorDeDatos (paseos): " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Error en GestorDeDatos (Formato de número): " + e.getMessage());
        }

     }

    /**
     * Creamos un metodo público para llamar la lista de paseos creada
     * @return la lista creada después de separar y leer las partes del archivo.
     */
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
                String nombreExcursion= partes[0];
                String region = partes[1];
                int horasDeViaje = Integer.parseInt(partes[2]);
                double precio = Double.parseDouble(partes[3]);


                Destinos destino = new Destinos(nombreExcursion, region, horasDeViaje, precio);
                ExcursionesCulturales excursionesCulturales = new ExcursionesCulturales(destino,"");
                listaExcursiones.add(excursionesCulturales);
            }

        }catch(IOException e){
            System.out.println("Error en GestorDeDatos (excursiones): " + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Error en GestorDeDatos (Formato de número): " + e.getMessage());
        }
     }

    /**
     * Creamos un metodo público para llamar la lista de excursiones creada.
     * @return la lista creada después de separar y leer las partes del archivo.
     */
     public List<ExcursionesCulturales> getListaExcursiones(){
        return this.listaExcursiones;
     }


 }

