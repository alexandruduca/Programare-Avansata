package com.company;

public class Hotel extends Location implements Classifiable{
    private double rating;

    @Override
    public double getRating() {
        return rating;
    }

    public void setRating(double rating)
    {
        this.rating=rating;
    }

}
