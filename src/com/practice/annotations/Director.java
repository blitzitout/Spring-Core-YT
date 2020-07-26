package com.practice.annotations;

import org.springframework.stereotype.Component;

@Component("directorObj")
public class Director {

    public void directorInfo(){
        System.out.println("Hey, this is your director!");
    }

}
