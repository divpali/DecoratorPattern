package com.example.DecoratorPattern;

import com.example.DecoratorPattern.Decorator.Milk;
import com.example.DecoratorPattern.Decorator.Sugar;

public class CoffeeShop {

    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription()+" : "+beverage.getCost());

        Beverage beverageWithMilk = new Milk(beverage);
        System.out.println(beverageWithMilk.getDescription() +" : "+beverageWithMilk.getCost() +" USD");

        Beverage beverageWithMilkAndSugar = new Sugar(beverageWithMilk);
        System.out.println(beverageWithMilkAndSugar.getDescription() +" : "+beverageWithMilkAndSugar.getCost() +" USD");
    }
}
