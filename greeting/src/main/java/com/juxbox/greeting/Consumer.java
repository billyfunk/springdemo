package com.juxbox.greeting;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    private IMessageListener messageListener;

    public Consumer(IMessageListener messageListener) {
        this.messageListener = messageListener;
    }

    public void consume(String message) throws IOException {
        messageListener.consume(message);
    }
}
