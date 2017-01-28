package com.adamzareba.ch3.dependency.injection.spring.annotation;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component("injectSimpleConfig")
@Getter
public class InjectSimpleConfig {

    private String name = "John Smith Annotation";
    private int age = 35;
    private float height = 1.78f;
    private boolean programmer = true;
    private Long ageInSeconds = 1103760000L;
}
