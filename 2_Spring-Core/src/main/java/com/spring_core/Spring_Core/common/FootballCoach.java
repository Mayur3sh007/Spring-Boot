package com.spring_core.Spring_Core.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    public String getDailyWorkout() {
        return "Edging 1day Straight";
    }
}
