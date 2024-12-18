package org.example.config;

import org.example.Animal;
import org.example.Mouth;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Mouth mouth(){
        return new Mouth();
    }
}
