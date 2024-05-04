package com.example.DecoratorPattern;

public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House blend coffee";
    }

    @Override
    public double getCost() {
        return 20.00;
    }
}
