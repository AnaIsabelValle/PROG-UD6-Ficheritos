package net.salesianos.actividades.actividad_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        String textoActividad_2 = "actividad_2.txt";

        try {
            FileReader actividad_2 = new FileReader(textoActividad_2);

            BufferedReader leerActividad_2 = new BufferedReader(actividad_2);

            String texto;

            StringBuilder resultado = new StringBuilder();

            while ((texto = leerActividad_2.readLine() != null) {
                for (int i = 0; i < texto.length(); i++) {
                    char caracteresTexto = texto.charAt(i);
                    resultado.append(caracteresTexto).append('-').append((int) caracteresTexto);
                    if (i < texto.length() - 1) {
                        resultado.append(',');
                    }
                }
            }
            leerActividad_2.close();

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo");
        }
    }



        }
