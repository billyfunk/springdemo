package com.juxbox.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import java.io.IOException;

public class ProdMessageListener implements IMessageListener {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Override
    @KafkaListener(topics = "farewells", groupId = "farewell-topic")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message for prod -> %s", message));
    }
}
