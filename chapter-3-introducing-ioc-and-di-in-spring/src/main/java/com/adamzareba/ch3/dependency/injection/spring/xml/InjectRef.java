package com.adamzareba.ch3.dependency.injection.spring.xml;

import com.adamzareba.ch3.dependency.injection.setters.Oracle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectRef {

    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
