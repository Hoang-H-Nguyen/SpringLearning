package com.comics.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CriketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes";
    }
}
