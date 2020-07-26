package com.practice.ioc;

public class Airtel implements Sim{

    Airtel(){
        System.out.println("Airtel constructor called...");
    }

    @Override
    public void calling() {
        System.out.println("Calling with Airtel sim!");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet with Airtel sim!");
    }
}
