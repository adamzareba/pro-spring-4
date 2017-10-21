package com.adamzareba.ch5.aop.springAop.aop.aspectj;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AspectJAnnotationExample {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        MyBean myBean = (MyBean) ctx.getBean("myBean");
        myBean.execute();
    }
}
