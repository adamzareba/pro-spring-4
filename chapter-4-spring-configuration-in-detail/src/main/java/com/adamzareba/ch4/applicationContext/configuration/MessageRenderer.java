package com.adamzareba.ch4.applicationContext.configuration;

public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
