package com.adamzareba.ch5.aop.springAop.proxies;

public class DefaultSimpleBean implements SimpleBean {

    private long dummy = 0;

    @Override
    public void advised() {
        dummy = System.currentTimeMillis();
    }

    @Override
    public void unadvised() {
        dummy = System.currentTimeMillis();
    }
}
