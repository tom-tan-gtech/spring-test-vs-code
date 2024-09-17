package com.tomtan.spring_test_vs_code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    
    @Bean(name="student_bean")
    public Student getStudent() {
        return new Student();
    }

    @Bean
    public Address getAddress() {
        return new Address();
    }
}
