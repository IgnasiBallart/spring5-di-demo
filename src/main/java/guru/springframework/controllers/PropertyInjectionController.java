package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
