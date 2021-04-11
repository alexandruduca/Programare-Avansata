package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Token> tokens = new ArrayList<>();
    private int score;
    private boolean bot=true;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTokens(Token token) {
        tokens.add(token);
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public int getScore() {
        for (Token token : tokens)
            score+=token.getScore();
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }
}
