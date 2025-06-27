package com.spring_core.Spring_Core.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy   //Now this will be only called if its needed i.e called somewhere
public class FootballCoach implements Coach{

    //Init Method
    @PostConstruct
    public void afterInitialisationDoThis() {
        System.out.println("After bean Initialisation In Constructor:" + getClass().getSimpleName());
    }

    //Destroy Method --> For prototyped Scoped beans, Spring doesnt call Destroy method
    @PreDestroy
    public void beforeDestroyingBean() {
        System.out.println("Before Bean Destruction In Constructor:" + getClass().getSimpleName());
    }


//    public FootballCoach() {
//        System.out.println("In Constructor:" + getClass().getSimpleName());
//    }

    public String getDailyWorkout() {
        return "Edging 1day Straight";
    }
}
