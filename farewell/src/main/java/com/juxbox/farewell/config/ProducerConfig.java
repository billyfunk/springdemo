package com.juxbox.farewell.config;

import com.juxbox.farewell.IMessageProducer;
import com.juxbox.farewell.KafkaMessageProducer;
import com.juxbox.farewell.MockMessageProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProducerConfig {
    @Bean(name="messageProducer")
    @Profile("!kafka")
    public IMessageProducer getMockMessageProducer() {
        return new MockMessageProducer();
    }

    @Bean(name="messageProducer")
    @Profile("kafka")
    public IMessageProducer getKafkaMessageProducer() {
        return new KafkaMessageProducer();
    }
}
