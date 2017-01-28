package com.adamzareba.ch3.dependency.injection;

public interface ManagedComponent {
    void performLookup(Container container);
}