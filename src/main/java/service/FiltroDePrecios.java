package service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase con funciones lógicas donde leemos y creamos una lista de precios por archivo,
 * @return los precios de mayor a menor
 */

public class FiltroDePrecios {

    public static List<Double> leerPrecios(String archivo) {
        List<Double> precios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes.length >= 4) {
                    try {
                        double precio = Double.parseDouble(partes[3].trim());
                        precios.add(precio);
                    } catch (NumberFormatException e) {
                        System.out.println("Precio inválido en línea: " + linea);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer precios del archivo: " + archivo);
        }

        Collections.sort(precios); // ordenar de menor a mayor
        return precios;

    }
}










