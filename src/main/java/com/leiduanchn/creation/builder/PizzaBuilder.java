package com.leiduanchn.creation.builder;

/**
 * @author leiduanchn
 * @create 2019-12-10 11:24 a.m.
 */

/* "Abstract Builder" */
public abstract class PizzaBuilder {

    private Pizza pizza;


    public void  createNewPizzaProduct() {
        this.pizza = new Pizza();
    }


    public Pizza getPizza() {
        return pizza;
    }


    abstract void buildDough();
    abstract void buildSauce();
    abstract void buildTopping();


}
