package com.leiduanchn.creation.builder;

/**
 * @author leiduanchn
 * @create 2019-12-10 11:28 a.m.
 */

/* A customer ordering a pizza. */
public class Customer {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        CheesePizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();
        waiter.setPizzaBuilder(cheesePizzaBuilder);
        Pizza pizza = waiter.getPizza();


        SpicyPizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        Pizza pizza1 = waiter.getPizza();

    }
}
