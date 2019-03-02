package com.juxbox.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class DevMessageListener implements IMessageListener {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Override
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message for dev profile -> %s", message));
    }
}
