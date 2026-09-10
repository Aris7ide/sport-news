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

                removeNews();

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

        String title;
        String body;
        String competicion;
        String club;
        String player;
        String team;


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
                        title = scanner.nextLine();

                        System.out.println("Escribe el texto del articulo:");
                        body = scanner.nextLine();

                        System.out.println("En que liga?");
                        competicion = scanner.nextLine();

                        System.out.println("Que club?");
                        club = scanner.nextLine();

                        System.out.println("Que jugador?");
                        player = scanner.nextLine();

                        Football newFootballNews = new Football(title,body,competicion,club,player);
                        currentRedactor.getNewsList().add(newFootballNews);

                        System.out.println("El articulo " + title + " ha sido añadido por el redactor " + currentRedactor.getName() + ".");
                        break;

                    case 2:

                        System.out.println("Cual es el titulo?");
                        title = scanner.nextLine();

                        System.out.println("Escribe el texto del articulo:");
                        body = scanner.nextLine();

                        System.out.println("Que competicion?");
                        competicion = scanner.nextLine();

                        System.out.println("Que club?");
                        club = scanner.nextLine();

                        Basket newBasketNews = new Basket(title,body,competicion,club);
                        currentRedactor.getNewsList().add(newBasketNews);

                        System.out.println("El articulo " + title + " ha sido añadido por el redactor " + currentRedactor.getName() + ".");
                        break;

                    case 3:

                        System.out.println("Cual es el titulo?");
                        title = scanner.nextLine();

                        System.out.println("Escribe el texto del articulo:");
                        body = scanner.nextLine();

                        System.out.println("Que competicion?");
                        competicion = scanner.nextLine();

                        System.out.println("Quien es el tenista?");
                        player = scanner.nextLine();

                        Tennis newTennisNews = new Tennis(title,body,competicion,player);
                        currentRedactor.getNewsList().add(newTennisNews);

                        System.out.println("El articulo " + title + " ha sido añadido por el redactor " + currentRedactor.getName() + ".");
                        break;

                    case 4:

                        System.out.println("Cual es el titulo?");
                        title = scanner.nextLine();

                        System.out.println("Escribe el texto del articulo:");
                        body = scanner.nextLine();

                        System.out.println("Que escuderia?");
                        team = scanner.nextLine();

                        F1 newF1News = new F1(title,body,team);
                        currentRedactor.getNewsList().add(newF1News);

                        System.out.println("El articulo " + title + " ha sido añadido por el redactor " + currentRedactor.getName() + ".");
                        break;

                    case 5:

                        System.out.println("Cual es el titulo?");
                        title = scanner.nextLine();

                        System.out.println("Escribe el texto del articulo:");
                        body = scanner.nextLine();

                        System.out.println("Que equipo?");
                        team = scanner.nextLine();

                        Motogp newMotogpNews = new Motogp(title,body,team);
                        currentRedactor.getNewsList().add(newMotogpNews);

                        System.out.println("El articulo " + title + " ha sido añadido por el redactor " + currentRedactor.getName() + ".");
                        break;
                }

                break;
            }
        }

        if (!found) {
            System.out.println("No se ha encontrado el readactor.");
        }

    }

    private static void removeNews() {

        System.out.println("Escribe el dni del redactor");
        String dni = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < listRedactores.size(); i++) {
            Redactor currentRedactor = listRedactores.get(i);

            if (currentRedactor.getDni().equalsIgnoreCase(dni)) {

                found = true;

                System.out.println("Escribe el titular del articulo");
                String title = scanner.nextLine();

                for (int y = 0; y < currentRedactor.getNewsList().size(); y++) {
                    News currentNews = currentRedactor.getNewsList().get(i);

                    if (currentNews.getTitle().equalsIgnoreCase(title)) {
                        currentRedactor.getNewsList().remove(i);

                        System.out.println("El articulo " + currentNews.getTitle() + " ha sido eliminado");

                    }

                    else {
                        System.out.println("El articulo no existe");
                    }

                }

            }

        }

        if (!found) {
            System.out.println("El redactor no existe");
        }

    }


}
