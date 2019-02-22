package com.juxbox.greeting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    String hello() {
        return "hello";
    }
}
