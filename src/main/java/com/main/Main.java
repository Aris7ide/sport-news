package com.main;

import com.articles.*;
import com.redactores.Redactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Redactor> listRedactores = new ArrayList<>();

    static void main(String[] args) {

    int opcion = 1;

    do {
        System.out.println("ELEGIR UNA OPCION \n" +
                            "1. Introducir redactor \n" +
                            "2. Eliminar redactor\n" +
                            "3. Introducir noticia en un redactor\n" +
                            "4. Eliminar nooticia\n" +
                            "5. Mostrar todas las noticias de un redactor\n" +
                            "6. Calcular puntuaciòn de una noticia\n" +
                            "7. Calcular precio de una noticia\n" +
                            "0. Salir.");

        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {

            case 1:

                addRedactor();

                break;
            case 2:

                removeRedactor();

                break;
            case 3:

                addNews();

                break;
            case 4:

                //removeNews();

                break;
            case 5:

                //showNews();

                break;
            case 6:



                break;
            case 7:
                break;
            case 0:

                System.out.println("Adiòs.");

                break;
        }


    } while (opcion != 0 && opcion <= 7);

    scanner.close();

    }

    // AQUI EL METODO, mete el nuevo redactor en un newRedactor.
    private static void addRedactor() {
        System.out.println("Introduce el nombre:");
        String name = scanner.nextLine();

        System.out.println("Introduce el DNI:");
        String dni = scanner.nextLine();

        Redactor newRedactor = new Redactor(dni,name);
        listRedactores.add(newRedactor);

        System.out.println("Redactor " + name + " registrado con dni " + dni);

    }

    private static void removeRedactor() {

        System.out.println("Introduce el dni del redactor:");
        String dni = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < listRedactores.size(); i++) {
            Redactor currentRedactor = listRedactores.get(i);

            if (currentRedactor.getDni().equalsIgnoreCase(dni)) {
                listRedactores.remove(i);
                found = true;
                System.out.println("El redactor con dni " + dni + " ha sido eliminado");
                break;
            }
        }

        if (!found) {
            System.out.println("No se ha encontrado el readactor.");
        }

    }

    private static void addNews() {

        System.out.println("Pon en dni del redactor que escribe el articulo:");
        String dni = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < listRedactores.size(); i++) {
            Redactor currentRedactor = listRedactores.get(i);

            if (currentRedactor.getDni().equalsIgnoreCase(dni)) {

                //He encontrado el redactor, ahora habrà que meterle la noticia.
                System.out.println("Que tipo de noticia ha escrito " + currentRedactor.getName() + "?\n" +
                        "1. Football\n" +
                        "2. Basket\n" +
                        "3. Tennis\n" +
                        "4. F1\n" +
                        "5. MotoGP");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                found = true;

                switch (opcion) {
                    case 1:

                        System.out.println("Cual es el titulo?");
                        String title = scanner.nextLine();

                        System.out.println("Escribe el texto del articulo:");
                        String body = scanner.nextLine();

                        System.out.println("En que liga?");
                        String competicion = scanner.nextLine();

                        System.out.println("Que club?");
                        String club = scanner.nextLine();

                        System.out.println("Que jugador?");
                        String player = scanner.nextLine();

                        Football newFootballNews = new Football(title,body,competicion,club,player);
                        Redactor.newsList.add(newFootballNews);

                        System.out.println("El articulo " + title + " ha sido añadido por el redactor " + currentRedactor.getName() + ".");
                        break;

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                }

                break;
            }
        }

        if (!found) {
            System.out.println("No se ha encontrado el readactor.");
        }

    }


}
