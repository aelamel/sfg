package com.sfg.spring.controller;

import com.sfg.spring.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {


    private final GreetingService greetingService;


    public ConstructorInjectionController(@Qualifier("frenchGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return this.greetingService.sayHello();
    }
}
