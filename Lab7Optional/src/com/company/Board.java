package com.company;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Integer nrTokens;
    private List<Token> board = new ArrayList<>();

    public Board(Integer nrTokens) {
        this.nrTokens = nrTokens;
        for (int i=0; i<nrTokens; i++)
        {
            Token token = new Token(nrTokens);
            board.add(token);
        }
    }

    public List<Token> getBoard() {
        return board;
    }

    public Integer getNrTokens() {
        return nrTokens;
    }

    public void setNrTokens(Integer nrTokens) {
        this.nrTokens = nrTokens;
    }

    public void printBoard()
    {
        System.out.println("The board has " + nrTokens + " tokens.");
        for (Token token : board)
        {
            System.out.print(board.indexOf(token) + ": ");
            System.out.println(token);
        }
    }
}
