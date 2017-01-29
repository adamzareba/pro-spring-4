package com.adamzareba.ch3.dependency.injection.spring.xml.bean.inheritance;

import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SimpleBean {

    private String name;
    private String age;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        SimpleBean parent = (SimpleBean) ctx.getBean("inheritParent");
        SimpleBean child = (SimpleBean) ctx.getBean("inheritChild");

        System.out.println("Parent:\n" + parent);
        System.out.println("Child:\n" + child);
    }

    public String toString() {
        return "Name: " + name + "\n" + "Age: " + age;
    }
}
