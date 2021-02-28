package com.company;

public class Main {

    public static void main(String[] args) {

        Factory S1=new Factory("S1", 10);
        Warehouse S2=new Warehouse("S2", 35);
        Warehouse S3=new Warehouse("S3", 25);

//        S1.setName("S1");
//        S1.setCapacity(10);
//
//        S2.setName("S2");
//        S2.setCapacity(35);
//
//        S3.setName("S3");
//        S3.setCapacity(25);

        Destination D1=new Destination("D1", 20);
        Destination D2=new Destination("D2", 25);
        Destination D3=new Destination("D3", 25);

//        D1.setName("D1");
//        D1.setCapacity(20);
//
//        D2.setName("D2");
//        D2.setCapacity(25);
//
//        D3.setName("D3");
//        D3.setCapacity(25);

        Problem P=new Problem(3, 3);
        int[][] matrix= {
                {2, 3, 1},
                {5, 4, 8},
                {5, 6, 8}
        };

        P.setMatrix(matrix);
        System.out.println();
        P.addSource(S1);
        P.addSource(S2);
        P.addSource(S3);
        P.printSources();
        P.addSource(S1);

        P.addDestination(D1);
        P.addDestination(D2);
        P.addDestination(D3);
        P.printDestination();
        P.addDestination(D2);

        P.getMatrix();
        System.out.println();
        P.solution();

    }
}
