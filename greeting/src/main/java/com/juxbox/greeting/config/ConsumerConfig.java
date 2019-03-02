package com.juxbox.greeting.config;

import com.juxbox.greeting.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ConsumerConfig {
    @Bean(name="messageListener")
    @Profile("!kafka")
    public IMessageListener getDevMessageListener() {
        return new DevMessageListener();
    }

    @Bean(name="messageListener")
    @Profile("kafka")
    public IMessageListener getProdMessageListener() {
        return new ProdMessageListener();
    }
}
