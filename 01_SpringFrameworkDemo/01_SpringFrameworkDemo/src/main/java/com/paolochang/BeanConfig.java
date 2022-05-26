package com.paolochang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.paolochang")
public class BeanConfig {

    /**
     * Leave an empty BeanConfig if @Component annotation
     * has been provided on the Bean class
     *
     * The following is the defining Bean by itself.
     * (@Component annotation is not used on the class)
     */
    @Bean
    public Resident resident() {
        return new Resident();
    }
}
