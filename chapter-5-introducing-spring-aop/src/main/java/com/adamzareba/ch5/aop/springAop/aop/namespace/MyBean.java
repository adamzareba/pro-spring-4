package com.adamzareba.ch5.aop.springAop.aop.namespace;

public class MyBean {

    private MyDependency dep;

    public void execute() {
        dep.foo(100);
        dep.foo(101);
        dep.bar();
    }

    public void setDep(MyDependency dep) {
        this.dep = dep;
    }
}

