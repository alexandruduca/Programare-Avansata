package com.company;

import java.util.Arrays;

/**
 * The definiton of the class Problem
 */
public class Problem {
    /**
     * The attributes of the class
     */
    public int[][] matrix;
    public int sources;
    public int destinations;
    public Source[] s;
    public Destination[] d;

    /**
     * The constructor of the class
     *
     * @param sources
     * @param destinations
     */
    Problem(int sources, int destinations) {
        this.sources = sources;
        this.destinations = destinations;
        this.matrix = new int[sources][destinations];
        this.s = new Source[10];
        this.d = new Destination[10];
    }

    /**
     * Setter for the matrix
     * This method gets a cost matrix from Main
     * and generates the attribute matrix
     *
     * @param matrix
     */
    public void setMatrix(int[][] matrix) {
        for (int i = 0; i < sources; i++)
            for (int j = 0; j < destinations; j++)
                this.matrix[i][j] = matrix[i][j];
    }

    /**
     * Getter for the matrix
     * It prints the matrix as in the example,
     * including the names of the Sources, Destinations
     * and the capacities of each
     */
    public void getMatrix() {
        System.out.print("       ");
        for (int i = 0; i < 3; i++)
            System.out.print(d[i].getName() + " ");
        System.out.print("Supply");
        System.out.println();
        for (int i = 0; i < sources; i++) {
            System.out.print("  " + s[i].getName() + "   ");
            for (int j = 0; j < destinations; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.print(s[i].getCapacity());
            System.out.println();
        }
        System.out.print("Demand ");
        for (int i = 0; i < destinations; i++)
            System.out.print(d[i].getCapacity() + " ");
    }

    @Override
    public String toString() {
        return "Problem{" +
                "matrix=" + Arrays.toString(matrix) +
                ", sources=" + sources +
                ", destinations=" + destinations +
                '}';
    }

    /**
     * This method verifies if a given source S
     * is already in the array of sources;
     * if not, then we add the source S
     * in the first available position poz
     *
     * @param S
     */
    public void addSource(Source S) {
        int poz = 0;
        int ok = 1;
        for (int i = 0; i < s.length; i++)
            if (s[i] == null) {
                poz = i;
                break;
            }
        for (int i = 0; i < s.length; i++)
            if (S.equals(s[i]))
                ok = 0;
        if (ok == 1)
            s[poz] = S;
        else
            System.out.println("The source " + S.getName() + " is already in the array");
    }

    /**
     * This method prints the array of sources
     */
    public void printSources() {
        for (int i = 0; i < s.length; i++)
            if (s[i] != null)
                System.out.println(s[i].getName() + " ");
    }

    /**
     * This method verifies if a given destination D
     * is already in the array of destinations;
     * if not, then we add the destination D
     * in the first available position poz
     *
     * @param D
     */
    public void addDestination(Destination D) {
        int poz = 0;
        int ok = 1;
        for (int i = 0; i < d.length; i++)
            if (d[i] == null) {
                poz = i;
                break;
            }
        for (int i = 0; i < d.length; i++)
            if (D.equals(d[i]))
                ok = 0;
        if (ok == 1)
            d[poz] = D;
        else
            System.out.println("The source " + D.getName() + " is already in the array");
    }

    /**
     * This method prints the array of destinations
     */
    public void printDestination() {
        for (int i = 0; i < d.length; i++)
            if (d[i] != null)
                System.out.println(d[i].getName() + " ");
    }

    /**
     * This method generates a solution.
     * It goes through each source, verifies if the capacity !=0
     * then searches for the minimum cost
     * and verifies if the destination can accept the transport;
     * after that, the values are updated and the minimum cost gets a high value
     */
    void solution() {
        int capacitySource = 0;
        int capacityDestination = 0;
        int transport = 0;
        int cost = 0;
        int costSD = 0;
        int min = 9999;
        int j = 0;
        for (int i = 0; i < sources; i++)
            while (s[i].getCapacity() != 0) {
                min = 9999;
                for (int k = 0; k < destinations; k++)
                    if (matrix[i][k] < min) {
                        min = matrix[i][k];
                        j = k;
                    }
                capacitySource = s[i].getCapacity();
                capacityDestination = d[j].getCapacity();
                if (capacitySource >= capacityDestination && d[j].getCapacity() != 0) {
                    transport = capacityDestination;
                    s[i].setCapacity(capacitySource - transport);
                    d[j].setCapacity(0);
                    costSD = transport * matrix[i][j];
                    cost += costSD;
                    System.out.println(s[i].getName() + " -> " + d[j].getName() + " : " + transport + "*" + matrix[i][j] + " = " + costSD);
                } else if (capacitySource < capacityDestination && d[j].getCapacity() != 0) {
                    transport = capacitySource;
                    s[i].setCapacity(0);
                    d[j].setCapacity(capacityDestination - transport);
                    costSD = transport * matrix[i][j];
                    cost += costSD;
                    System.out.println(s[i].getName() + " -> " + d[j].getName() + " : " + transport + "*" + matrix[i][j] + " = " + costSD);
                }
                matrix[i][j] = 9999;
            }
        System.out.println("Total cost: " + cost);
    }
}
