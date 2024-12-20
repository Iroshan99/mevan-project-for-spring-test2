package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Animal ani=context.getBean(Animal.class);
        System.out.println(ani.getAge());
        ani.dog();

       // Mouth mo=context.getBean(Mouth.class);
        //mo.loadOrgans();

        //Mouth mo1=context.getBean(Mouth.class);
        //mo1.loadOrgans();

        //Animal obj= (Animal) context.getBean("animal");
        //System.out.println(obj.getAge());

        //obj.dog();



    }
}
