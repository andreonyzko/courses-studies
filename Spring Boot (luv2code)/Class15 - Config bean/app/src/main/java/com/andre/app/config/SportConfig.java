package com.andre.app.config;


import com.andre.app.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public SwimCoach swimCoach() {
        return new SwimCoach();
    }

}
