package com.company;

public class Main {

    public static void main(String[] args) {
        Board board=new Board(10);
        Player first =new Player("Alex");
        first.setBot(false);
        Player second=new Player("Bot");
        Game game=new Game(board);
        game.addPlayer(first);
        game.addPlayer(second);
        game.startGame();
    }
}
