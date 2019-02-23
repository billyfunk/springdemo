package com.juxbox.farewell;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarewellController {

    @GetMapping(value="/farewell")
    String goodbye() {
        return "goodbye";
    }
}
