package com.company;

public class Board {
    private boolean switchRound=false;

    public Board() {
        this.switchRound = false;
    }

    public synchronized void firstPlayer()
    {
        while(!switchRound)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        switchRound=true;
        notifyAll();
    }

    public synchronized void secondPlayer()
    {
        while(switchRound)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        switchRound=false;
        notifyAll();
    }

}
