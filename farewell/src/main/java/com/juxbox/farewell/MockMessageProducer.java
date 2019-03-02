package com.juxbox.farewell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MockMessageProducer implements IMessageProducer {
    private static final Logger logger = LoggerFactory.getLogger(MockMessageProducer.class);

    @Override
    public void sendMessage(String message) {
        logger.info(String.format("#### -> Producing message for dev -> %s", message));
    }
}
