package com.tomtan.spring_test_vs_code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean(name="student_bean")
    @Scope(value="singleton")
    public Student getStudent() {
        return new Student();
    }

    // need named beans if more than one getter returns the same type of object
    @Bean(name="first_address")
    public Address getAddress1() {
        return new Address("First Address");
    }

    @Bean(name="second_address")
    public Address getAddress2() {
        return new Address("Second Address");
    }
}
