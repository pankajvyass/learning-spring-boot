package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    @Autowired
    private Coach myCoach;

//define a constructor for dependency injection

@GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
    return myCoach.getDailyWorkout();
}


}
