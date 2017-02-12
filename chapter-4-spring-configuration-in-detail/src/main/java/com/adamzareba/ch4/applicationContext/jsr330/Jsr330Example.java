package com.adamzareba.ch4.applicationContext.jsr330;

import com.adamzareba.ch4.applicationContext.configuration.MessageRenderer;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Jsr330Example {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }
}

