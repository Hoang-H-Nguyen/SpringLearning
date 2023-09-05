package com.comics.springcoredemo.common;

public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Swim 1000 meters for me";
    }
}
