package com.comics.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

//    //define our init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
//    }
//
//    //define our destroy method
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
//    }

    @Override
    public String getDailyWorkOut() {
        return "Spending 30 minutes in batting practice";
    }
}
