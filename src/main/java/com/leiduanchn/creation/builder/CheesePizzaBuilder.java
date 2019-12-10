package com.leiduanchn.creation.builder;

/**
 * ConcreteBuilder
 * @author leiduanchn
 * @create 2019-12-10 11:25 a.m.
 */

/* "ConcreteBuilder" */
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
