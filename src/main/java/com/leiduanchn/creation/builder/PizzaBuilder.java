package com.leiduanchn.creation.builder;

/**
 * @author leiduanchn
 * @create 2019-12-10 11:24 a.m.
 */

/*
1. What:
Separate the construction of a complex object from its representation
so that the same construction process can create different representations.

2. Why
2.1. Decoupling the product itself from the product creation process, you can use the same creation process to get different products.
2.2. Easy to control the creation of objects, breaking down the creation steps of complex products into different methods
2.3. Easy to expand, adding new concrete builders does not need to modify the original code, which conforms to the "open and close principle"

3. Where
3.1. The product objects that need to be created have complex internal structures, and these product objects have common characteristics
3.2. Isolate the creation and use of complex objects and enable the same creation process to create different products.

3. How
3.1 Decide if a common input and many possible representations (or outputs) is the problem at hand.
3.2 Encapsulate the parsing of the common input in a Director class.
3.3 Design a standard protocol for creating all possible output representations. Capture the steps of this protocol in a Builder interface.
3.4 Define a Builder derived class for each target representation.
3.5 The client creates a Director object and a Builder object, and registers the latter with the former.
3.6 The client asks the Director to "construct".
3.7 The client asks the Builder to return the result.

4. Rules of thumb
4.1 Sometimes creational patterns are complementary: Builder can use one of the other patterns to implement which components get built.
    Abstract Factory, Builder, and Prototype can use Singleton in their implementations.
4.2 Builder focuses on constructing a complex object step by step. Abstract Factory emphasizes a family of product objects
    (either simple or complex). Builder returns the product as a final step, but as far as the Abstract Factory is concerned,
    the product gets returned immediately.
4.3 Builder often builds a Composite.
4.4 Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate)
    and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer discovers
    where more flexibility is needed.

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

    //3.3 Design a standard protocol for creating all possible output representations. Capture the steps of this protocol in a Builder interface.

    abstract void buildDough();
    abstract void buildSauce();
    abstract void buildTopping();


}
