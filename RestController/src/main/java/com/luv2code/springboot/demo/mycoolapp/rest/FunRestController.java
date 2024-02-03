package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return Hello world
    @GetMapping("/")
    public String KnowAboutMe() {
        return "Do you know about me !";

    }

    @GetMapping("/Name")
    public String SayName() {
        return "PANKAJ VYAS ";

    }

    @GetMapping("/Collage")
    public String CollageName() {
        return "Shri Rawatpura Sarkar University";

    }
    @GetMapping("/CollageCGPA")
    public String CollageCGPA() {
        System.out.println();
        return "My Collage CGPA is 8 ";
    }


    @GetMapping("/BrotherName")
    public String BrotherName() {
        return "M.L VYAS ";
    }
    @GetMapping("/SisterName")
    public String SisterName() {
        return "PRIYANKA VYAS ";
    }
    @GetMapping("/FatherName")
    public String FatherName() {
        return "S.P VYAS ";
    }
@GetMapping("/MotherName")
public String MotherName() {
    return "RENUKA VYAS ";
}
@GetMapping("/Hobby")
public String Hobby() {
    System.out.println();
    return "PANKAJ VYAS ";
}
@GetMapping("/Game")
public String Game() {
    return "Foot ball ";
}
}