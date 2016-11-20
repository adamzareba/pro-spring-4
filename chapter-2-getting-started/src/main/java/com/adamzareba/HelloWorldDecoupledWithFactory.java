package com.adamzareba;

import com.adamzareba.ch2.MessageProvider;
import com.adamzareba.ch2.MessageRenderer;
import com.adamzareba.ch2.MessageSupportFactory;

public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) {
        MessageRenderer renderer = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider provider = MessageSupportFactory.getInstance().getMessageProvider();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
