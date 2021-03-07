package com.company;

import java.time.LocalTime;

public class Church extends Location implements Visitable {
    private LocalTime openingTime, closingTime;

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

}
