package com.practice.diot;

public class AnotherStudent {
    private Cheat cheat;

    public void setCheat(MathCheat cheat) {
        this.cheat = cheat;
    }

    public void startCheating(){
        cheat.cheating();
    }
}
