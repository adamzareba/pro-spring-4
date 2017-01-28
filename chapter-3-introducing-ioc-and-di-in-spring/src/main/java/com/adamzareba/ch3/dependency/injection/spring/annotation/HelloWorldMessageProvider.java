package com.adamzareba.ch3.dependency.injection.spring.annotation;

import com.adamzareba.ch2.MessageProvider;

import org.springframework.stereotype.Service;

//@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World! I am annotated class!";
    }
}
