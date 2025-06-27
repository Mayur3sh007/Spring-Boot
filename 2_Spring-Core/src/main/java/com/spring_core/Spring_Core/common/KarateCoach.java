package com.spring_core.Spring_Core.common;

import org.springframework.stereotype.Component;

@Component
public class KarateCoach implements Coach{
    public String getDailyWorkout() {
        return "Gooning Streak";
    }
}
