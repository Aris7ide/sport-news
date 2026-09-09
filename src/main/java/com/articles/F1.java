package com.articles;

import com.articles.News;

public class F1 extends News{

    private String team;

    public F1(String title, String body, double score, int price, String team) {
        super(title, body, score, price);
        this.team = team;
    }

    @Override
    public double calculatePrice() {

        double totalPrice = 100;

        if (this.team != null && this.team.equalsIgnoreCase("Ferrari") ||
                                 this.team.equalsIgnoreCase("Mercedes")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {

        int totalScore = 4;

        if (this.team != null && this.team.equalsIgnoreCase("Ferrari") ||
                                 this.team.equalsIgnoreCase("Mercedes")) {
            totalScore += 2;
        }

        return totalScore;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
