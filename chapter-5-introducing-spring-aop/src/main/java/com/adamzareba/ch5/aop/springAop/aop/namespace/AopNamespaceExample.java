package com.adamzareba.ch5.aop.springAop.aop.namespace;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AopNamespaceExample {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-aop-context-xml.xml");
        ctx.refresh();

        MyBean myBean = (MyBean) ctx.getBean("myBean");
        myBean.execute();
    }
}
