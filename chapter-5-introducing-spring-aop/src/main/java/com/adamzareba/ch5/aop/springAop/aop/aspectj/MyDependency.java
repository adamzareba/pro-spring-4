package com.adamzareba.ch5.aop.springAop.aop.aspectj;

import org.springframework.stereotype.Component;

@Component("myDependency")
public class MyDependency {

    public void foo(int intValue) {
        System.out.println("foo(int): " + intValue);
    }

    public void bar() {
        System.out.println("bar()");
    }
}

