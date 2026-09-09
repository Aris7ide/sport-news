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

    @Override
    public double calculatePrice() {

        double totalPrice = 300;

        if (this.competition != null && this.competition.equalsIgnoreCase("Liga de campeones")) {
            totalPrice += 100;
        }

        if (this.club != null && this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
            totalPrice += 100;
        }

        if (this.player != null && this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
            totalPrice += 50;
        }

        return totalPrice;
    }

    @Override
    public int calculateScore() {

        int totalScore = 5;

        if (this.competition != null && this.competition.equalsIgnoreCase("Liga de campeones")) {
            totalScore += 3;
        }

        if (this.competition != null && this.competition.equalsIgnoreCase("Liga")) {
            totalScore += 2;
        }

        if (this.club != null && this.club.equalsIgnoreCase("Barca") ||
                                 this.club.equalsIgnoreCase("Madrid")) {
            totalScore += 1;
        }

        if (this.player != null && this.player.equalsIgnoreCase("Ferran Torres") ||
                                    this.player.equalsIgnoreCase("Benzema")) {
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}
