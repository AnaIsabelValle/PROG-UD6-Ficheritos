package net.salesianos.actividades.actividad_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        String textoActividad_2 = "src/net/salesianos/ficheros/actividad_2.txt";

        try {
            FileReader actividad_2 = new FileReader(textoActividad_2);

            BufferedReader leerActividad_2 = new BufferedReader(actividad_2);

            String texto = "";

            int contador = leerActividad_2.read();

            while (contador != -1) {
                texto += (char) contador + "_" + contador + ",";
                contador = leerActividad_2.read();
            }
            System.out.println(texto);
            leerActividad_2.close();
            actividad_2.close();

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo");
        }
    }
}
