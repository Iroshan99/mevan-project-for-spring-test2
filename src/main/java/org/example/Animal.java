package org.example;

public class Animal {
    private int age;
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
        org.loadMouth();
        System.out.println("dog barks");

        org.loadIyes();
        System.out.println("dog sees");


    }
}
