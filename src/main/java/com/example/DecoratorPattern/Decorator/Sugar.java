package com.example.DecoratorPattern.Decorator;

import com.example.DecoratorPattern.Beverage;
import com.example.DecoratorPattern.Decorator.AddOn;

/*
Concrete Decorator Class
 */
public class Sugar extends AddOn {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with sugar";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
