package org.example.config;

import org.example.Animal;
import org.example.Mouth;
import org.example.Organs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Animal animal(Organs org){
        Animal animal=new Animal();
        animal.setAge(25);
        animal.setOrg(org);
        return animal;
    }

    @Bean
    @Scope("prototype")
    public Mouth mouth(){
        return new Mouth();
    }


}
