package com.leiduanchn.creatinal.builder;

/**
 * ConcreteBuilder
 * @author leiduanchn
 * @create 2019-12-10 11:25 a.m.
 */

// "ConcreteBuilder", 3.4 Define a Builder derived class for each target representation.
public class CheesePizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        System.out.println("CheesePizzaBuilder buildDough... ");
    }

    @Override
    public void buildSauce() {
        System.out.println("CheesePizzaBuilder buildSauce... ");

    }

    @Override
    public void buildTopping() {
        System.out.println("CheesePizzaBuilder buildTopping... ");

    }
}
