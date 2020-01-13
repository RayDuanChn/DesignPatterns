package com.leiduanchn.behavioral.templatemethod;

/**
 * @author leiduanchn
 * @create 2020-01-13 10:30 a.m.
 */

/**
 * Template method design pattern is to define an algorithm as skeleton of operations and leave the details to be implemented by the child classes.
 * The overall structure and sequence of the algorithm is preserved by the parent class.
 * Template means Preset format like HTML templates which has fixed preset format.
 * Similarly in template method pattern,we have a preset structure method called template method which consists of steps.
 * This steps can be abstract method which will be implemented by its subclasses.
 *
 * When to use template method:
 * The template method is used in frameworks, where each implements the invariant parts of a domain’s architecture,
 * leaving “placeholders” for customization options.
 *
 * The template method is used for the following reasons :

 * 1. Let subclasses implement varying behavior (through method overriding)
 * 2. Avoid duplication in the code , the general workflow structure is implemented once in the abstract class’s algorithm,
 *    and necessary variations are implemented in the subclasses.
 * 3. Control at what points subclassing is allowed. As opposed to a simple polymorphic override,
 *    where the base method would be entirely rewritten allowing radical change to the workflow,
 *    only the specific details of the workflow are allowed to change.
 */

public class Client {

    public static void main(String[] args) {

        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder();

        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
