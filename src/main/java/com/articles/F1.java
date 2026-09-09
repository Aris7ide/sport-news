package com.articles;

import com.articles.News;

public class F1 extends News{

    private String team;

    public F1(String title, String body, double score, int price, String team) {
        super(title, body, score, price);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
