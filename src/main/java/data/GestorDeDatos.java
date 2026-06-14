package data;

import model.Destinos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

 public class GestorDeDatos extends Destinos  {

    String archivo = "src/main/resources/datos.txt";

    List<Destinos> listaDestinos = new ArrayList<>();


    /** Creamos una clase Public para realizar la lógica de separar los atributos leidos por el FileReader,
     * dentro de un try catch para evitar errores de lectura
     */

    public void cargarListaDestinos () {

        try{

               List<String> lineas = Files.readAllLines(Paths.get(archivo));


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
            System.out.println("Error en GestorDeDatos (Lectura): " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en GestorDeDatos (Formato de número): " + e.getMessage());
        }

    }
     public List<Destinos> getListaDestinos() {
         return this.listaDestinos;
     }

 }
