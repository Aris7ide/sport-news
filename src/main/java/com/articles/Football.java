package com.articles;

public class Football extends News{

    private String competition;
    private String club;
    private String player;

    public Football(String title, String body, double score, int price, String competition, String club, String player) {
        super(title, body, score, price);
        this.competition = competition;
        this.club = club;
        this.player = player;
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}
