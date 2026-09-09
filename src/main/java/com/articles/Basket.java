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
