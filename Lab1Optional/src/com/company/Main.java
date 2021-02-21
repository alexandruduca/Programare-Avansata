package com.company;

public class Main {
    public static void main(String[] args) {
        long t1 = System.nanoTime();
        // citire de la terminal
        int n = Integer.parseInt(args[0]);
        System.out.println("Ati introdus numarul " + n + ". Matricea de " + n + "x" + n + " este:");
        // initializare matrice
        Matrix matrice = new Matrix(n);
        // generare matrice de adiacenta cu valori random
        matrice.genMatrix();
        // afisare matrice
        matrice.printMatrix();
        // verificarea conexitatii ; daca graful nu este conex, se vor afisa si numarul de componente conexe
        matrice.isConnected();
        long t2 = System.nanoTime();
        // afisare in nanosecunde a timpului de executie
        System.out.println("Programul a rulat in " + (t2-t1) + " nanosecunde.");
    }
}
