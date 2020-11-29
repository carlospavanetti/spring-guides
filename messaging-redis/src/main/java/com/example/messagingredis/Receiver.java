package com.example.messagingredis;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    private AtomicInteger counter = new AtomicInteger();

    public void receiveMessage(String message) {
        logger.info("Received <" + message + ">");
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
}
