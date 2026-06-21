package ui;


import data.GestorDeDatos;
import data.GestorDeEntrada;
import data.GestorDeEntrada.GestorArchivos;
import model.Destinos;
import model.ExcursionesCulturales;
import model.PaseosLacustres;
import model.RutasGastronomicas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Creamos la clase donde inicia el programa,
 * donde mostramos la lista de objetos guardados en un archivo de texto,
 * y utilizamos las funciones de la clase Destinos para mostrar datos específicos de la clase.
 */

 public class Main {
    public static void main(String[] args) throws IOException {

        GestorDeDatos gestor = new GestorDeDatos();
        gestor.cargarListaDestinos();
        gestor.cargarRutaGastronomica();
        gestor.cargarPaseosLacustres();
        gestor.cargarExcursionesCulturales();

        List<Destinos> listaDestinos = gestor.getListaDestinos();
        List<RutasGastronomicas> listaGastronomicas = gestor.getListaGastronomica();
        List<PaseosLacustres> listaPaseos = gestor.getListaPaseosLacustres();
        List<ExcursionesCulturales> listaExcursiones = gestor.getListaExcursiones();


        System.out.println("====LISTA LEÍDA DESDE DATOS.TXT====\n");


        if (listaDestinos.isEmpty()) {
            System.out.println("lista vacia");

        } else {
            for (Destinos destino : listaDestinos) {
                System.out.println(destino + "\n");

            }
        }

        System.out.println("=========LISTA DE PRECIOS==========");

        for (Destinos destino : listaDestinos) {
            System.out.println("💰 $:  " + destino.getPrecio());

        }

        System.out.println("=========DURACIÓN DE LOS VIAJES==========");

        for (Destinos destino : listaDestinos) {
            System.out.println("⏱️ tiempo estimado: " + destino.getHorasDeViaje() + " minutos");
        }


        System.out.println("=========FILTRANDO==========");
        if (listaDestinos.contains("Llanquihue")) {
            System.out.println("destino no encontrado");
        } else {
            System.out.println("solo llanquihue" + listaDestinos+"\n");
        }


        System.out.println("=========RUTAS GASTRONÓMICAS==========");

        if (listaGastronomicas.isEmpty()) {
            System.out.println("lista vacia");

        } else {
            for (RutasGastronomicas rutasGastronomica : listaGastronomicas) {
                System.out.println(rutasGastronomica + "\n");

            }
        }

        System.out.println("===========PASEOS LACUSTRES==========");

        if (listaPaseos.isEmpty()) {
            System.out.println("lista vacia");

        } else {
            for (PaseosLacustres paseosLacustres : listaPaseos) {
                System.out.println(paseosLacustres + "\n");
            }
        }

        System.out.println("===========EXCURSIONES CULTURALES==========");

        if(listaPaseos.isEmpty()){
            System.out.println("lista vacia");

        }else{
            for(ExcursionesCulturales excursionesCulturales : listaExcursiones){
                System.out.println(excursionesCulturales + "\n");
            }
        }

        System.out.println("===========PARA VER LAS ACTIVIDADES==========");
        System.out.println("================SUBIR=================");

  try {
    Scanner sc = new Scanner(System.in);
    GestorArchivos gestorArchivos = new GestorArchivos();

    List<Destinos> listaDestinosArchivo = new ArrayList<>();
    List<PaseosLacustres> paseosLacustresList = new ArrayList<>();
    List<RutasGastronomicas> listaGastronomicasArchivo = new ArrayList<>();

    int opcion;
    do {
        System.out.println("\n=== Menú de ingreso ===");
        System.out.println("1. Nuevo destino");
        System.out.println("2. Nuevo paseo lacustre");
        System.out.println("3. Nueva ruta gastronómica");
        System.out.println("4. Nueva excursion cultural");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Nombre destino: ");
                String nombre = sc.nextLine();
                System.out.print("Región: ");
                String region = sc.nextLine();
                System.out.print("Minutos: ");
                int horas = sc.nextInt();
                sc.nextLine();
                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                sc.nextLine();

                Destinos nuevoDestino = new Destinos(nombre, region, horas, precio);
                gestorArchivos.guardarDestino("src/main/resources/listaDestinos.txt", listaDestinosArchivo, nuevoDestino);
                break;

            case 2:
                System.out.print("Nombre paseo: ");
                String nombrePaseo = sc.nextLine();
                System.out.print("Región: ");
                String regionPaseo = sc.nextLine();
                System.out.print("Minutos: ");
                int horasPaseo = sc.nextInt();
                sc.nextLine();
                System.out.print("Precio: ");
                double precioPaseo = sc.nextDouble();
                sc.nextLine();

                PaseosLacustres nuevoPaseo = new PaseosLacustres(nombrePaseo, regionPaseo, horasPaseo, precioPaseo);
                gestorArchivos.guardarPaseo("src/main/resources/paseosLacustres.txt", paseosLacustresList, nuevoPaseo);
                break;

            case 3:
                System.out.print("Nombre restaurante: ");
                String nombreRest = sc.nextLine();
                System.out.print("Ciudad: ");
                String ciudad = sc.nextLine();
                System.out.print("Minutos: ");
                int horasRuta = sc.nextInt();
                sc.nextLine();
                System.out.print("Precio: ");
                double precioRuta = sc.nextDouble();
                sc.nextLine();

                RutasGastronomicas nuevaRuta = new RutasGastronomicas(nombreRest, ciudad, horasRuta, precioRuta);
                gestorArchivos.guardarRutaGastronomica("src/main/resources/RutasGastronomicas.txt", listaGastronomicasArchivo, nuevaRuta);
                break;

            case 4:
                System.out.print("Nombre Excursion cultural: ");
                String nuevoCentroCultural = sc.nextLine();
                System.out.print("Región: ");
                String regionCentroCultural = sc.nextLine();
                System.out.print("Minutos: ");
                int horasExcursion = sc.nextInt();
                sc.nextLine();
                System.out.print("Precio: ");
                double precioExcursion = sc.nextDouble();
                sc.nextLine();

                ExcursionesCulturales nuevaExcursion = new ExcursionesCulturales(nuevoCentroCultural, regionCentroCultural, horasExcursion, precioExcursion);
                gestorArchivos.guardarExcursionesCulturales("src/main/resources/excursionesCulturales.txt", listaExcursiones, nuevaExcursion);
                break;


            case 5:
                System.out.println(" Saliendo del programa...");
                break;

            default:
                System.out.println(" Opción inválida");
        }
    } while (opcion != 5);

    sc.close();


  }catch(Exception e){
    System.out.println(e.getMessage());
      }

    }

 }

