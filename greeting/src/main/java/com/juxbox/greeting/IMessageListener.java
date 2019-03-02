package com.juxbox.greeting;

import java.io.IOException;

public interface IMessageListener {
    public void consume(String message) throws IOException;
}
