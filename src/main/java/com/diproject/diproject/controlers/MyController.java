package com.diproject.diproject.controlers;

import com.diproject.diproject.services.GreetingService;
import com.diproject.diproject.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService =new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I am the controller.");
        return this.greetingService.sayGreeting();
    }
}
