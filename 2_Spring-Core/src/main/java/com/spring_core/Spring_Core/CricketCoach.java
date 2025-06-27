package com.spring_core.Spring_Core;

import org.springframework.stereotype.Component;

@Component  //This annotation makes this class available for Dependency Injection
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "10 sets of Gooning!";
    }
}
