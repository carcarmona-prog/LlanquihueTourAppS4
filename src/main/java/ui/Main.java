package ui;


import data.GestorDeDatos;
import model.Destinos;
import java.util.List;

/**
 * Creamos la clase donde inicia el programa,
 * donde mostramos la lista de objetos guardados en un archivo de texto,
 * y utilizamos las funciones de la clase Destinos para mostrar datos específicos de la clase.
 */

public class Main  {
    public static void main(String[] args) {

       GestorDeDatos gestor = new GestorDeDatos();
       gestor.cargarListaDestinos();

       List<Destinos> listaDestinos = gestor.getListaDestinos();


        System.out.println("====LISTA LEÍDA DESDE DATOS.TXT====\n");
        System.out.println("implementation 1:\n");

        if(listaDestinos.isEmpty()){
            System.out.println("lista vacia");

        }else {
            for (Destinos destino : listaDestinos) {
                System.out.println(destino+"\n");
                System.out.println("=============================");
            }
        }

        System.out.println("=========LISTA DE PRECIOS==========");
        System.out.println("implementation 2:");
        for(Destinos destino : listaDestinos){
            System.out.println("💰 $:  " + destino.getPrecio());

        }

        System.out.println("=========DURACIÓN DE LOS VIAJES==========");
        System.out.println("implementation 3:");
        for(Destinos destino : listaDestinos){
            System.out.println("⏱️ tiempo estimado: " + destino.getHorasDeViaje() + " minutos");
        }

    }
}
