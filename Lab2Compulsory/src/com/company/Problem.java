package com.company;

import java.util.Arrays;

public class Problem {
    private int[][] matrix;
    private int sources;
    private int destinations;

    Problem(int sources, int destinations)
    {
        this.sources=sources;
        this.destinations=destinations;
        this.matrix=new int[sources][destinations];
    }

    public void setMatrix(int[][] matrix) {
        for (int i=0; i<sources; i++)
            for (int j=0; j<destinations; j++)
                this.matrix[i][j]=matrix[i][j];
    }

    public void getMatrix()
    {
        System.out.print("       ");
        for (int i=0; i<3; i++)
            System.out.print("D" + (i+1) + " ");
        System.out.print("Supply");
        System.out.println();
        for (int i=0; i<sources; i++)
        {
            System.out.print("  S" + (i+1) + "   ");
            for (int j=0; j<destinations; j++)
                System.out.print(matrix[i][j] + "  ");
            if(i==0)
            System.out.print(10);
            else
                if(i==1)
                    System.out.print(35);
                else
                    if(i==2)
                        System.out.print(25);
            System.out.println();
        }
        System.out.println("Demand 20 25 25");
    }

    @Override
    public String toString() {
        return "Problem{" +
                "matrix=" + Arrays.toString(matrix) +
                ", sources=" + sources +
                ", destinations=" + destinations +
                '}';
    }
}
