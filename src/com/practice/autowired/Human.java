package com.practice.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    private Heart heart;


    public Human(){

    }

    public Human(Heart heart) {
        this.heart = heart;
    }

    @Autowired
    @Qualifier("octopusHeart")
    public void setHeart(Heart heart) {
        System.out.println("setter called...");
        this.heart = heart;
    }

    public void startPumping(){
        if(heart != null) heart.pump();
        else System.out.println("You are NOT alive...");
    }
}
