package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Animal {

    @Value("25")
    private int age;

    @Autowired
    //@Qualifier("mouth")
    private Organs org;

    //public Animal(int age,Mouth mouth1) {
        //System.out.println("constructor is called");
        //this.age = age;
      //  this.mouth1=mouth1;
    //}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter is called");
        this.age = age;
    }

    public Organs getOrg() {
        return org;
    }

    public void setOrg(Organs org) {
        this.org = org;
    }

    public void dog(){
        org.loadOrgans();


    }


}
