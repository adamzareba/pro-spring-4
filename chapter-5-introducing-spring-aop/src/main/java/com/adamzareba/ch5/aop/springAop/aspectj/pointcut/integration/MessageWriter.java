package com.adamzareba.ch5.aop.springAop.aspectj.pointcut.integration;

public class MessageWriter {

    public void writeMessage() {
        System.out.println("foobar!");
    }

    public void foo() {
        System.out.println("foo");
    }
}
