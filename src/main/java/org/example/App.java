package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Mouth mo=context.getBean("dog",Mouth.class);
        mo.loadOrgans();

        //Animal obj= (Animal) context.getBean("animal");
        //System.out.println(obj.getAge());

        //obj.dog();



    }
}
