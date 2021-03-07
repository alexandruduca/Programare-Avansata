package com.company;

import java.time.LocalTime;

public class Restaurant extends Location implements Classifiable, Visitable {
    private LocalTime openingTime, closingTime;
    private double rating;

    @Override
    public LocalTime getOpeningTime() {
        if (openingTime == null)
            return Visitable.super.getOpeningTime();
        else
            return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        if (closingTime == null)
            return Visitable.super.getClosingTime();
        else
            return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
