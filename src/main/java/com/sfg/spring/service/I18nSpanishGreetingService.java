package com.sfg.spring.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"ES", "default"})
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hola Mundo -- ES";
    }
}
