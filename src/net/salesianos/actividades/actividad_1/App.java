package net.salesianos.actividades.actividad_1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Querido usuario, introduzca un texto que al menos tenga\n" +
                "una longitud de treinta caracteres");
        String texto = teclado.nextLine();

        if (texto.length() < 30 ) {
            int caracteresFaltaron = texto.length() - 30;
            System.out.println("Los Caracateres que faltaraon son : " + caracteresFaltaron);

            while (texto.length() < 30){
                System.out.println("Le recordamos que debe introducir un texto" +
                        " que contenga al menos 30 caracteres");

                texto = teclado.nextLine();
            }
        }
        String textoEnMayusculas = texto.toUpperCase();
        String textoFinal = textoEnMayusculas.replace(" ", "_");
        System.out.println(textoFinal);

        try (FileWriter fileWriter = new FileWriter("src/net/salesianos/ficheros/actividad_1.txt")) {
        } catch (IOException e ) {
            System.out.println("Ha saltado una excepción");
        }



    }



}
