package com.adamzareba.ch3.dependency.injection.spring.annotation;

import com.adamzareba.ch2.MessageProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

//    @Autowired
//    public ConfigurableMessageProvider(@Value("Configurable message") String message) {
//        this.message = message;
//    }

    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
