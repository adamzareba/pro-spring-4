package com.adamzareba.ch5.aop.springAop.pointcut.static_.named;

public class NameBean {

    public void foo() {
        System.out.println("foo");
    }

    public void foo(int x) {
        System.out.println("foo " + x);
    }

    public void bar() {
        System.out.println("bar");
    }

    public void yup() {
        System.out.println("yup");
    }
}
