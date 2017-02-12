package com.adamzareba.ch4.applicationContext.profiles.kindergarten;

import com.adamzareba.ch4.applicationContext.profiles.Food;
import com.adamzareba.ch4.applicationContext.profiles.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProviderService {

    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));

        return lunchSet;
    }
}
