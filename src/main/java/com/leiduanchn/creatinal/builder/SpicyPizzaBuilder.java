package com.leiduanchn.creatinal.builder;

/**
 * ConcreteBuilder
 * @author leiduanchn
 * @create 2019-12-10 11:45 a.m.
 */

// "ConcreteBuilder", 3.4 Define a Builder derived class for each target representation.

public class SpicyPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildDough() {
        System.out.println("SpicyPizzaBuilder buildDough... ");
    }

    @Override
    public void buildSauce() {
        System.out.println("SpicyPizzaBuilder buildSauce... ");

    }

    @Override
    public void buildTopping() {
        System.out.println("SpicyPizzaBuilder buildTopping... ");

    }
}
