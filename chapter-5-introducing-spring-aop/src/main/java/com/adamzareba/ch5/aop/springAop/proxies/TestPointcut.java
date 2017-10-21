package com.adamzareba.ch5.aop.springAop.proxies;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class TestPointcut extends StaticMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return ("adviced".equals(method.getName()));
    }
}
