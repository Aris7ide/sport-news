package com.articles;

public abstract class News {

    private String title;
    private String body;
    public double score;
    public double price;

    public News(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public abstract double calculatePrice();

    public abstract int calculateScore();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
