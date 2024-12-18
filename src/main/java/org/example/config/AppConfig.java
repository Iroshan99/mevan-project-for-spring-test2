package org.example.config;

import org.example.Animal;
import org.example.Mouth;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = {"mouth1","mouth2","dog"})
    public Mouth mouth(){
        return new Mouth();
    }
}
