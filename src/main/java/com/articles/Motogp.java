package com.articles;

public class Motogp extends News{

    private String team;

    public Motogp(String title, String body, String team) {
        super(title, body);
        this.team = team;
    }

    @Override
    public double calculatePrice() {

        double totalPrice = 100;

        if (this.team != null && this.team.equalsIgnoreCase("Honda") ||
                                 this.team.equalsIgnoreCase("Yamaha")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {

        int totalScore = 3;

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
