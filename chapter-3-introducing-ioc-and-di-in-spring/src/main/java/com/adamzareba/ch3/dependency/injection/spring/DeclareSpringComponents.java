package com.adamzareba.ch3.dependency.injection.spring;

import com.adamzareba.ch2.MessageProvider;
import com.adamzareba.ch2.MessageRenderer;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());

//        MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
//        messageRenderer.render();
    }
}
