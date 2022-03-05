package com.sfg.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class FrenchGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Bonjour le monde";
    }
}
