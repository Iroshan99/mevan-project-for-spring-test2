package org.example;

import org.springframework.stereotype.Component;

@Component
public class Iyes implements Organs{

    public void loadOrgans(){
        System.out.println("loading the iyes");
        System.out.println("dog sees");
    }
}
