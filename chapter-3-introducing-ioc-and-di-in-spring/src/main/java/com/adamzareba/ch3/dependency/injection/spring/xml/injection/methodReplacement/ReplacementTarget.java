package com.adamzareba.ch3.dependency.injection.spring.xml.injection.methodReplacement;

public class ReplacementTarget {

    public String formatMessage(String msg) {
        return "<h1>" + msg + "</h1>";
    }

    public String formatMessage(Object msg) {
        return "<h1>" + msg + "</h1>";
    }
}
