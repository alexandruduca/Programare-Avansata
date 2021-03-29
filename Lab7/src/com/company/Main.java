package com.company;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player("player1", "hello.txt", "Ciao!", 5, board);
        Player player2 = new Player("player2", "hello.txt", "Bella!", 10, board);
        new Thread(player1).start();
        new Thread(player2).start();
    }
}
