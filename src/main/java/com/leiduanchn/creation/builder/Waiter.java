package com.leiduanchn.creation.builder;

/**
 * @author leiduanchn
 * @create 2019-12-10 11:26 a.m.
 */

// "Director", director here to specify the production process of the product, return to the product
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public Waiter(){}

    public Waiter(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    //Director decide how to deal with the process of making pizza
    public Pizza getPizza(){

        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();

        return pizzaBuilder.getPizza();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
}
