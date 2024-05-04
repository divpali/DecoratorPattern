package com.example.DecoratorPattern;

public class DarkRoast implements Beverage {

    @Override
    public String getDescription() {
        return "Dark roast coffee";
    }

    @Override
    public double getCost() {
        return 15.00;
    }
}
