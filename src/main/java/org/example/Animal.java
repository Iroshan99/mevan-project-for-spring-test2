package org.example;

public class Animal {
    private int age;
    private Mouth mouth1;

    public Animal(int age,Mouth mouth1) {
        System.out.println("constructor is called");
        this.age = age;
        this.mouth1=mouth1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter is called");
        this.age = age;
    }

    public Mouth getMouth1() {
        return mouth1;
    }

    public void setMouth1(Mouth mouth1) {
        this.mouth1 = mouth1;
    }

    public void dog(){
        mouth1.loadMouth();
        System.out.println("dog barks");

    }
}
