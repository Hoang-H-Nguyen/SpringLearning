package com.comics.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CriketCoach implements Coach {

    public CriketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes";
    }
}
