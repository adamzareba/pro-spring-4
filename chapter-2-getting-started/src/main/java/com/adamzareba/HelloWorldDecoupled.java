package com.adamzareba;

import com.adamzareba.ch2.HelloWorldMessageProvider;
import com.adamzareba.ch2.MessageProvider;
import com.adamzareba.ch2.MessageRenderer;
import com.adamzareba.ch2.StandardOutMessageRenderer;

public class HelloWorldDecoupled {

    public static void main(String[] args) {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        MessageProvider provider = new HelloWorldMessageProvider();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
