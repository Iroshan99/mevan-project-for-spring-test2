package org.example;

public class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter is called");
        this.age = age;
    }

    public void dog(){
        System.out.println("dog barks");

    }
}
