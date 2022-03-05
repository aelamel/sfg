package com.sfg.spring.controller;

import com.sfg.spring.controller.PropertyInjectionController;
import com.sfg.spring.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void greet() {
        System.out.println(controller.greet());
    }
}