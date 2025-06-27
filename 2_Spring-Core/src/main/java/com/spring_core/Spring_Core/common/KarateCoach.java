package com.spring_core.Spring_Core.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Now diff obj is created for each call
public class KarateCoach implements Coach{

    public KarateCoach() {
        System.out.println("In Constructor:" + getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return "Gooning Streak";
    }
}
