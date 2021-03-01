package com.company;

public class Restaurant extends Location implements Classifiable{
    private double rating;

    @Override
    public double getRating() {
        return rating;
    }

    public void setRating()
    {
        this.rating=rating;
    }

}
