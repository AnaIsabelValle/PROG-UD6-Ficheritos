package net.salesianos.actividades.actividad_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        FileReader fileReader1 = new FileReader("src/net/salesianos/ficheros/actividad_1.txt");

        FileReader fileReader2 = new FileReader("src/net/salesianos/ficheros/actividad_2.txt");

        String texto1 = "";
        int contador1 = fileReader1.read();

        while (contador1 != -1) {
            texto1 += (char) contador1 + "_" + contador1 + ",";
            contador1 = fileReader1.read();
        }
        System.out.println(" - Contendido del fichero  Uno: " + texto1);

        String texto2 = "";
        int contador2 = fileReader2.read();

        while (contador2 != -1) {
            texto2 += (char) contador1 + "_" + contador1 + ",";
            contador2 = fileReader2.read();
        }
        System.out.println(" - Contendido del fichero  Dos: " + texto2);

        String texto3 = (texto1 + texto2);

        FileWriter fileWriter3 = new FileWriter("src/net/salesianos/ficheros/actividad_3.txt");
        fileWriter3.write(texto3);
        fileReader1.close();
        fileReader2.close();

        String mensajeFirma = "\n Este fichero lo ha realizado Ana Isabel González Rosales";
        fileWriter3.write(mensajeFirma);
        fileWriter3.close();
    }
}