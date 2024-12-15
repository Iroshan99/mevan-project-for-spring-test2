package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Animal obj= (Animal) context.getBean("animal");
        System.out.println(obj.getAge());

        obj.dog();


    }
}
