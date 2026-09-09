package com.articles;

import com.articles.News;

public class Basket extends News{

    private String competition;
    private String club;

    public Basket(String title, String body, double score, int price, String competition, String club) {
        super(title, body, score, price);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public double calculatePrice() {

        double totalPrice = 250;

        if (this.competition != null && this.competition.equalsIgnoreCase("Euroliga")) {
            totalPrice += 75;
        }

        if (this.club != null && this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
            totalPrice += 75;
        }

        return totalPrice;

    }

    @Override
    public int calculateScore() {

        int totalScore = 4 ;

        if (this.competition != null && this.competition.equalsIgnoreCase("Euroliga")) {
            totalScore += 3;
        }

        if (this.competition != null && this.competition.equalsIgnoreCase("ABC")) {
            totalScore += 2;
        }

        if (this.club != null && this.club.equalsIgnoreCase("Barca") ||
                                 this.club.equalsIgnoreCase("Madrid")) {
            totalScore += 1;
        }

        return totalScore;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

}
