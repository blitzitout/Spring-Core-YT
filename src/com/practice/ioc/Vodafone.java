package com.practice.ioc;

public class Vodafone implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling with Airtel sim!");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet with Airtel sim!");
    }
}
