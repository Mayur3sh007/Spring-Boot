package com.spring_core.Spring_Core.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy   //Now this will be only called if its needed i.e called somewhere
public class FootballCoach implements Coach{

    public FootballCoach() {
        System.out.println("In Constructor:" + getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return "Edging 1day Straight";
    }
}
