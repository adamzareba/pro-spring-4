package com.adamzareba.ch3.dependency.injection.spring.xml.bean.aliasing;

import org.springframework.context.support.GenericXmlApplicationContext;

public class NonSingleton {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        String s1 = (String) ctx.getBean("nonSingleton");
        String s2 = (String) ctx.getBean("nonSingleton");

        System.out.println("Identity Equal?: " + (s1 == s2));
        System.out.println("Value Equal:? " + s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}
