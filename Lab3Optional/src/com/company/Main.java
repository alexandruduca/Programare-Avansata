package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        City c = new City();

        Hotel v1 = new Hotel();
        v1.setName("Hotel");
        v1.setRating(4.7);

        Museum v2 = new Museum();
        v2.setName("Museum A");
        v2.setOpeningTime(LocalTime.of(8, 0));
        v2.setOpeningTime(LocalTime.of(20, 0));
        v2.setTicketPrice(10);

        Museum v3 = new Museum();
        v3.setName("Museum B");
        v3.setOpeningTime(LocalTime.of(9, 30));
        v3.setClosingTime(LocalTime.of(22, 0));
        v3.setTicketPrice(15);

        Church v4 = new Church();
        v4.setName("Church A");
        v4.setOpeningTime(LocalTime.of(9, 0));
        v4.setClosingTime(LocalTime.of(14, 0));

        Church v5 = new Church();
        v5.setName("Church B");
        v5.setOpeningTime(LocalTime.of(8, 0));
        v5.setClosingTime(LocalTime.of(15, 30));

        Restaurant v6 = new Restaurant();
        v6.setName("Restaurant");
        v6.setRating(4.9);
        v6.setOpeningTime(LocalTime.of(12, 0));
        v6.setClosingTime(LocalTime.of(23, 30));

        c.addLocation(v1);
        c.addLocation(v2);
        c.addLocation(v3);
        c.addLocation(v4);
        c.addLocation(v5);
        c.addLocation(v6);

        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v3.setCost(v2, 20);
        v2.setCost(v4, 20);
        v4.setCost(v2, 20);
        v2.setCost(v5, 10);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v5.setCost(v4, 30);
        v4.setCost(v6, 10);
        v5.setCost(v6, 20);

        System.out.println(c);
        c.printCosts();
        System.out.println();

        c.visitableNotPayable();

        System.out.println("Locatia " + v6.getName() + " este vizitabila timp de " + Visitable.getVisitingDuration(v6.getOpeningTime(), v6.getClosingTime()));


    }
}
