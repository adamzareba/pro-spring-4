package com.adamzareba.ch5.aop.springAop.aop.factory;

public class MyBean {
    private MyDependency dep;

    public void execute() {
        dep.foo();
        dep.bar();
    }

    public void setDep(MyDependency dep) {
        this.dep = dep;
    }
}

