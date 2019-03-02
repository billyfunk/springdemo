package com.juxbox.farewell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarewellController {

    private final IMessageProducer messageProducer;

    @Autowired
    FarewellController(IMessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping(value="/farewell")
    String goodbye() {
        return "goodbye";
    }

    @PostMapping(value="/publish")
    public void sendMessageToFarwellTopic(@RequestParam("message") String message) {
        this.messageProducer.sendMessage(message);
    }

}
