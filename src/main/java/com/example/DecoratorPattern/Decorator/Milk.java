package com.example.DecoratorPattern.Decorator;

import com.example.DecoratorPattern.Beverage;
import com.example.DecoratorPattern.Decorator.AddOn;

/*
Concrete Decorator Class
 */
public class Milk extends AddOn {
    public Milk(Beverage beverage) {   //add on to any type of beverage
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.00;
    }
}
