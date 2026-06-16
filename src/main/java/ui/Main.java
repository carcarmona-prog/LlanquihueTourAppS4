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


        System.out.println("====OBJETOS LEÍDOS DESDE EL DATOS.TXT====\n");

        if(listaDestinos.isEmpty()){
            System.out.println("lista vacia");

        }else {
            for (Destinos destino : listaDestinos) {
                System.out.println(destino+"\n");
                System.out.println("=============================");
            }
        }

        System.out.println("=========LISTA DE PRECIOS==========");
        for(Destinos destino : listaDestinos){
            System.out.println("💰 $:  " + destino.getPrecio());

        }

        System.out.println("=========DURACIÓN DE LOS VIAJES==========");
        for(Destinos destino : listaDestinos){
            System.out.println("⏱️ tiempo estimado: " + destino.getHorasDeViaje() + " minutos");
        }

    }
}
