package com.sfg.spring;

import com.sfg.spring.controller.ConstructorInjectionController;
import com.sfg.spring.controller.I18nController;
import com.sfg.spring.controller.PropertyInjectionController;
import com.sfg.spring.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("------------ I18nController ");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.greet());

        System.out.println("------------ Property");
        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
        System.out.println(propertyInjectionController.greet());

        System.out.println("------------ Setter");
        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
        System.out.println(setterInjectionController.greet());

        System.out.println("------------ Constructor(Primary)");
        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
        System.out.println(constructorInjectionController.greet());
    }

}
