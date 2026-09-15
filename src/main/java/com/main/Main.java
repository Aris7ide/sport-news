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
                    "6. Calcular precio de una noticia\n" +
                    "7. Calcular score de una noticia\n" +
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
                    showNews();
                    break;
                case 6:
                    calculatePrice();
                    break;
                case 7:
                    calculateScore();
                    break;
                case 0:
                    System.out.println("Adiòs.");
                    break;
                default:
                    System.out.println("Entre 0 y 7");
            }


        } while (opcion != 0);

        scanner.close();

    }

    private static Redactor searchRedactor(String dni) {

        for (Redactor redactor : listRedactores) {
            Redactor currentRedactor = redactor;
            if (currentRedactor.getDni().equalsIgnoreCase(dni)) {
                return redactor;
            }
        }

        return null;
    }

    private static News searchNews(String title, String dni) {
        Redactor redactor = searchRedactor(dni);

        if (redactor != null) {
            for (News news : redactor.getNewsList()) {
                if (news.getTitle().equalsIgnoreCase(title)) {
                    return news;
                }
            }
        }

        return null;
    }

    private static void addRedactor() {

        System.out.println("Introduce el DNI:");
        String dni = scanner.nextLine();

        // BUSCA REDACTOR Y SACA DNI
        Redactor currentRedactor = searchRedactor(dni);

        if (currentRedactor != null) {

            System.out.println("El redactor ya existe");

        } else {
            System.out.println("Introduce el nombre:");
            String name = scanner.nextLine();

            Redactor newRedactor = new Redactor(dni, name);
            listRedactores.add(newRedactor);

            System.out.println("Redactor " + name + " registrado con dni " + dni);
        }

    }

    private static void removeRedactor() {

        System.out.println("Introduce el dni del redactor:");
        String dni = scanner.nextLine();

        Redactor currentRedactor = searchRedactor(dni);

        if (currentRedactor != null) {
            listRedactores.remove(currentRedactor);
            System.out.println("El redactor ha sido eliminado");
        } else {
            System.out.println("El redactor no existe");
        }

    }

    private static void addNews() {

        System.out.println("Pon en dni del redactor que escribe el articulo:");
        String dni = scanner.nextLine();

        Redactor currentRedactor = searchRedactor(dni);

        if (currentRedactor != null) {

            String title;
            String body;
            String competicion;
            String club;
            String player;
            String team;

            System.out.println("Que tipo de noticia ha escrito " + currentRedactor.getName() + "?\n" +
                    "1. Football\n" +
                    "2. Basket\n" +
                    "3. Tennis\n" +
                    "4. F1\n" +
                    "5. MotoGP");

            int opcion = scanner.nextInt();
            scanner.nextLine();

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

                    Football newFootballNews = new Football(title, body, competicion, club, player);
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

                    Basket newBasketNews = new Basket(title, body, competicion, club);
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

                    Tennis newTennisNews = new Tennis(title, body, competicion, player);
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

                    F1 newF1News = new F1(title, body, team);
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

                    Motogp newMotogpNews = new Motogp(title, body, team);
                    currentRedactor.getNewsList().add(newMotogpNews);

                    System.out.println("El articulo " + title + " ha sido añadido por el redactor " + currentRedactor.getName() + ".");
                    break;
            }

        } else {
            System.out.println("El redactor no existe");
        }


    }

    private static void removeNews() {

        System.out.println("Escribe el dni del redactor");
        String dni = scanner.nextLine();

        Redactor currentRedactor = searchRedactor(dni);

        if (currentRedactor != null) {

            System.out.println("Escribe el titular del articulo");
            String title = scanner.nextLine();

            News currentNews = searchNews(title, dni);

            if (currentNews != null) {
                currentRedactor.getNewsList().remove(currentNews);

                System.out.println("El articulo " + currentNews.getTitle() + " ha sido eliminado");

            } else {
                System.out.println("El articulo no existe");
            }


        } else {
            System.out.println("El redactor no existe");

        }

    }

    private static void showNews() {

        System.out.println("De que redactor? Escribe el DNI:");
        String dni = scanner.nextLine();

        Redactor currentRedactor = searchRedactor(dni);

        if (currentRedactor != null) {

            for (News n : currentRedactor.getNewsList()) {
                System.out.println(n.getTitle());
            }

        } else {
            System.out.println("El redactor no existe.");
        }
    }

    private static void calculatePrice() {

        System.out.println("Escribe el DNI del redactor:");
        String dni = scanner.nextLine();

        Redactor currentRedactor = searchRedactor(dni);

        if (currentRedactor != null) {

            System.out.println("Escribe el titular del articulo:");
            String title = scanner.nextLine();

            News currentNews = searchNews(title, dni);

            if (currentNews != null) {

                System.out.println("El precio es " + currentNews.calculatePrice() + " Euros.");
            } else {
                System.out.println("El articulo no existe");
            }

        } else {
            System.out.println("El redactor no existe");
        }

    }

    private static void calculateScore() {
        System.out.println("Escribe el DNI del redactor:");
        String dni = scanner.nextLine();

        Redactor currentRedactor = searchRedactor(dni);

        if (currentRedactor != null) {

            System.out.println("Escribe el titular del articulo:");
            String title = scanner.nextLine();

            News currentNews = searchNews(title, dni);

            if (currentNews != null) {

                System.out.println("La puntuacion es de " + currentNews.calculateScore() + " puntos.");
            } else {
                System.out.println("El articulo no existe");
            }

        } else {
            System.out.println("El redactor no existe");
        }

    }

}