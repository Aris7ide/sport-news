package com.articles;

import com.articles.News;

public class Motogp extends News{

    private String team;

    public Motogp(String title, String body, double score, int price, String team) {
        super(title, body, score, price);
        this.team = team;
    }

    @Override
    public double calculateScore() {

        double totalScore = 100;

        if (this.team != null && this.team.equalsIgnoreCase("Honda") ||
                                 this.team.equalsIgnoreCase("Yamaha")) {
            totalScore += 50;
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
