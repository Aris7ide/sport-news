package com.redactores;

import com.articles.News;

import java.util.ArrayList;
import java.util.List;

public class Redactor {

    private String name;
    private final String dni;
    private static int salary = 1500;
    private List<News> newsList;

    public Redactor(String dni, String name) {
        this.dni = dni;
        this.name = name;
        this.newsList = new ArrayList<>();
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Redactor.salary = salary;
    }
}
