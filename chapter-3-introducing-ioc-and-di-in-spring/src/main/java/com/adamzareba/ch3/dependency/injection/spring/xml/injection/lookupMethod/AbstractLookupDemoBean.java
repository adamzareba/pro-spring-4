package com.adamzareba.ch3.dependency.injection.spring.xml.injection.lookupMethod;

public abstract class AbstractLookupDemoBean implements DemoBean {

    public abstract MyHelper getMyHelper();

    @Override
    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
