package ui;

import data.GestorDeDatos;
import model.Destinos;


import java.util.List;

public class Main  {
    public static void main(String[] args) {

       GestorDeDatos gestor = new GestorDeDatos();
       gestor.cargarListaDestinos();

       List<Destinos> listaDestinos = gestor.getListaDestinos();


        System.out.println("====OBJETOS LEÍDOS DESDE EL DATOS.TXT====");

        if(listaDestinos.isEmpty()){
            System.out.println("lista vacia");

        }else {
            for (Destinos destinos : listaDestinos) {
                System.out.println(destinos+"\n");
            }
        }
        System.out.println("total de destinos disponibles");
        System.out.println(listaDestinos.size()+"\n");

        System.out.println("opcion numero 1");
        System.out.println(listaDestinos.get(0)+"\n");

        System.out.println("opcion numero 2");
        System.out.println(listaDestinos.get(1)+"\n");

        System.out.println("opcion numero 3");
        System.out.println(listaDestinos.get(2)+"\n");

        System.out.println("opcion numero 4");
        System.out.println(listaDestinos.get(3)+"\n");

        System.out.println("opcion numero 5");
        System.out.println(listaDestinos.get(4)+"\n");

        System.out.println("opcion numero 6");
        System.out.println(listaDestinos.get(5)+"\n");







    }
}
