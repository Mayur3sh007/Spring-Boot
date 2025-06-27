package com.spring_core.Spring_Core.rest;

import com.spring_core.Spring_Core.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;  //private field for our dependency

    // Constructor Injection --> #1 Recommended Use When dealing with Required Dependency
//    @Autowired  //Tells spring to inject a dependency - but if we only got 1 constructor then its optional
//    public DemoController(Coach theCoach) { //Constructor for dependency injection
//        myCoach = theCoach;
//    }

    //Setter Injection --> Use when dealing with Optional Dependency
//    @Autowired
//    public void setCoach(Coach thyCoach) {  //the method name can be anything no need for "setXYZ"
//        myCoach = thyCoach;
//    }

    //Since we have multiple coaches now we use Qualifier to Specify which coach
    @Autowired
    public DemoController(@Qualifier("karateCoach")Coach theCoach) {    //for a qualifier the 1st letter of class becomes small
        myCoach = theCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
