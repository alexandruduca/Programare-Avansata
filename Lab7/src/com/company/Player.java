package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Player implements Runnable{
    private final String name;
    private final String filename;
    private final String message;
    private final int count;
    private Board board;

    public Player(String name, String filename, String message, int count, Board board) {
        this.name = name;
        this.filename = filename;
        this.message = message;
        this.count = count;
        this.board=board;
    }

    @Override
    public void run() {
        try (BufferedWriter out =
                     new BufferedWriter(new FileWriter(filename))){
            for (int i = 0; i < count; i++) {
                out.write(message + "\n");
            }
        } catch (IOException e) {
            System.err.println("Oops..." + e);
        }

    }
}
