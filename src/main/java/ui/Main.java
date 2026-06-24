package ui;


import data.GestorDeDatos;
import data.GestorDeEntrada.GestorArchivos;
import model.Destinos;
import model.ExcursionesCulturales;
import model.PaseosLacustres;
import model.RutasGastronomicas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.FiltroDePrecios.leerPrecios;

/**
 * Creamos la clase donde inicia el programa,
 * donde mostramos la lista de objetos guardados en un archivo de texto,
 * y utilizamos las funciones de la clase Destinos para mostrar datos específicos de la clase.
 */

 public class Main {
    public static void main(String[] args) {


            GestorDeDatos gestor = new GestorDeDatos();
            gestor.cargarListaDestinos();
            gestor.cargarRutaGastronomica();
            gestor.cargarPaseosLacustres();
            gestor.cargarExcursionesCulturales();

            List<Destinos> listaDestinos = gestor.getListaDestinos();
            List<RutasGastronomicas> listaGastronomicas = gestor.getListaGastronomica();
            List<PaseosLacustres> listaPaseos = gestor.getListaPaseosLacustres();
            List<ExcursionesCulturales> listaExcursiones = gestor.getListaExcursiones();







        System.out.println("==========PARA VER LAS ACTIVIDADES==========");
        System.out.println("================ELIGE UNA OPCIÓN=================");

        try {
            Scanner sc = new Scanner(System.in);
            GestorArchivos gestorArchivos = new GestorArchivos();

            List<Destinos> listaDestinosArchivo = new ArrayList<>();
            List<PaseosLacustres> paseosLacustresArchivo = new ArrayList<>();
            List<RutasGastronomicas> listaGastronomicasArchivo = new ArrayList<>();
           List<ExcursionesCulturales> listaExcursionesArchivo = new ArrayList<>();

            int opcion;

            do {
                System.out.println("\n=== Menú de ingreso ===");
                System.out.println("1. Agregar nuevo destino");
                System.out.println("2. Agregar nuevo paseo lacustre");
                System.out.println("3. Agregar nueva ruta gastronómica");
                System.out.println("4. Agregar nueva excursión cultural");
                System.out.println("6. ver lista de actividades");
                System.out.println("7. filtrar precios mas económicos");
                System.out.println("8. Salir");
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
                        System.out.print("Nombre paseo lacustre: ");
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
                        gestorArchivos.guardarPaseo("src/main/resources/paseosLacustres.txt", paseosLacustresArchivo, nuevoPaseo);
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
                        System.out.print("Nombre excursión cultural: ");
                        String nombreExc = sc.nextLine();
                        System.out.print("Región: ");
                        String regionExc = sc.nextLine();
                        System.out.print("Minutos: ");
                        int horasExc = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Precio: ");
                        double precioExc = sc.nextDouble();
                        sc.nextLine();

                        ExcursionesCulturales nuevaExcursion = new ExcursionesCulturales(nombreExc, regionExc, horasExc, precioExc);
                        gestorArchivos.guardarExcursionesCulturales("src/main/resources/excursionesCulturales.txt", listaExcursionesArchivo, nuevaExcursion);
                        break;

                    case 6:
                        System.out.println("\n=== ACTIVIDADES ===");
                        System.out.println("\nDestinos:");
                        listaDestinos.forEach(System.out::println);

                        System.out.println("\nPaseos lacustres:");
                        listaPaseos.forEach(System.out::println);

                        System.out.println("\nRutas gastronómicas:");
                        listaGastronomicas.forEach(System.out::println);

                        System.out.println("\nExcursiones culturales:");
                        listaExcursiones.forEach(System.out::println);


                    case 7:
                        System.out.print("\n==========FILTRANDO PRECIOS DE MENOR A MAYOR=======\n ");

                        List<Double> preciosDestino = leerPrecios("src/main/resources/listaDestinos.txt");
                        System.out.println("\nPrecios destinos: " + preciosDestino);

                        List<Double> preciosGastronomicos = leerPrecios("src/main/resources/rutasGastronomicas.txt");
                        System.out.println("\nPrecios Rutas Gastronomicas: " + preciosGastronomicos);

                        List<Double> preciosPaseos = leerPrecios("src/main/resources/paseosLacustres.txt");
                        System.out.println("\nPrecios Paseos Lacustres: " + preciosPaseos);

                        List<Double> preciosExcursiones = leerPrecios("src/main/resources/excursionesCulturales.txt");
                        System.out.println("\nPrecios Excursiones culturales: " + preciosExcursiones );

                        break;


                    case 8:
                        System.out.println(" Saliendo del programa...");
                        break;

                    default:
                        System.out.println(" Opción inválida");
                }
            } while (opcion != 8);

            sc.close();


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }




}

