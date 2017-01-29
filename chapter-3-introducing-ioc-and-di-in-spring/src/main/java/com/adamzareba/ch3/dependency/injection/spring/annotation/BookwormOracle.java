package com.adamzareba.ch3.dependency.injection.spring.annotation;

import com.adamzareba.ch3.dependency.injection.setters.Oracle;

import org.springframework.stereotype.Service;

@Service("oracle")
public class BookwormOracle implements Oracle {

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet";
    }
}
