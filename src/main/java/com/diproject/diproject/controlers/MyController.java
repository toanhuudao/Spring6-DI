package com.diproject.diproject.controlers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("I am the controller.");
        return "hello everyone!";
    }
}
