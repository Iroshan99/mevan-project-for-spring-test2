package org.example.config;

import org.example.Animal;
import org.example.Mouth;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Mouth mouth(){
        return new Mouth();
    }
}
