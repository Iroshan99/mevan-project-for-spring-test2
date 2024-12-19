package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mouth implements Organs{

    public Mouth(){
        System.out.println("object mouth created");
    }
    public void loadOrgans(){
        System.out.println("loading the mouth");
        System.out.println("Dog barks");

    }
}
