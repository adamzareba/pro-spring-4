package com.adamzareba.ch5.aop.springAop.advice.around;

import org.springframework.aop.framework.ProxyFactory;

public class ProfilingExample {

    public static void main(String[] args) {
        WorkerBean bean = getWorkerBean();
        bean.doSomeWork(10000000);
    }

    private static WorkerBean getWorkerBean() {
        WorkerBean target = new WorkerBean();

        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new ProfilingInterceptor());

        return (WorkerBean) factory.getProxy();
    }
}

