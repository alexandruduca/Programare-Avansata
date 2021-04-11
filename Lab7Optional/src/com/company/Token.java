package com.company;

import java.util.Random;

public class Token {
    private Integer left;
    private Integer right;
    private Integer score;
    private Integer maxi;

    public Token(Integer maxi) {
        this.maxi = maxi;
        Random random = new Random();
        left = random.nextInt(maxi) + 1;
        right = random.nextInt(maxi) + 1;
        while (right==left)
        {
            right = random.nextInt(maxi) + 1;
        }
        score=random.nextInt(10);
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return
                left +
                        "/" + right +
                        " with score: " + score
                ;
    }
}
