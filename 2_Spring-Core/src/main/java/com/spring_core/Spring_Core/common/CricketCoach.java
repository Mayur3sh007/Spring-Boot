package com.spring_core.Spring_Core.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component  //This annotation makes this class available for Dependency Injection
//@Primary    //It makes this class a priority like a Default value if Qualifier is not used --> Multiple primary gives error
public class CricketCoach implements Coach {

//    public CricketCoach() {
//        System.out.println("In Constructor:" + getClass().getSimpleName());
//    }
    public String getDailyWorkout() {
        return "10 sets of Gooning!";
    }
}
