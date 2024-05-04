package com.example.DecoratorPattern.Decorator;

import com.example.DecoratorPattern.Beverage;

/*
decorator abstract class
 */
public abstract class AddOn implements Beverage {

    protected Beverage beverage;

    public AddOn(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

//    public abstract String getDescription();

}
