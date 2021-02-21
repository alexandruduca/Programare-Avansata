package com.company;

public class Matrix {
    public int[][] matrix;
    public int n;
    // constructorul de initializare cu parametrul numarul de noduri ale grafului
    Matrix(int n)
    {
        matrix=new int[n][n];
        this.n=n;
    }
    // metoda genereaza matricea de adiacenta a grafului neorientat cu valori random
    public void genMatrix()
    {
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                if(i==j)
                    matrix[i][j]=0; // punem 0 pe diagonala principala
                else
                    if(i<j)
                    {
                        matrix[i][j] = (int) (Math.random() * 1000000) % 2; // generam o valoare random pentru matrix[i][j]
                        matrix[j][i]=matrix[i][j]; // complementarul primeste aceeasi valoare
                    }
    }
    // metoda de afisare a matricei de adiacenta a grafului
    public void printMatrix()
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    // metoda pentru DFS
    public void DFS(int x, boolean[] visited)
    {
        visited[x]=true; //marcam nodul ca vizitat si verificam daca are vecini care nu au fost vizitati
        for (int i=0; i<n; i++)
            if (matrix[x][i]==1 && !visited[i])
                DFS(i, visited);
    }
    // metoda pentru verificarea conexitatii grafului
    public void isConnected()
    {
        boolean[] visited = new boolean[n]; // initializam visited cu false
        DFS(0, visited); // dupa DFS, daca graful este conex, visited are pe toate nodurile true
        boolean connected=true;
        for (int i=0; i<n; i++)
                if (!visited[i])
                {
                    connected=false;
                    break;
                }
        if (connected)
            System.out.println("Graful este conex!");
        else
            {
            System.out.println("Graful nu este conex!");
            connectedComponents();
            }
    }
    // metoda pentru numararea componentelor conexe
    public void connectedComponents()
    {
        boolean[] visited = new boolean[n]; // initializam visited cu false
        int conex=0;

        for (int i=0; i<n; i++) //parcurgem fiecare nod si facem DFS; adunam ca si componenta conexa; verificam daca mai sunt noduri nevizitate
            if(!visited[i])
            {
                DFS(i, visited);
                conex+=1;
            }
        System.out.println("Nr componente conexe: " + conex);
    }
}
