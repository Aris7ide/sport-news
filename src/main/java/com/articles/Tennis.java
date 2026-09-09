package com.articles;

import com.articles.News;

public class Tennis extends News{

    private String competition;
    private String players;

    public Tennis(String title, String body, double score, int price, String competition, String players) {
        super(title, body, score, price);
        this.competition = competition;
        this.players = players;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }
}
