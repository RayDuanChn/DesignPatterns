package com.leiduanchn.behavioral.templatemethod;

/**
 * Template Method Design Pattern
 * @author leiduanchn
 * @create 2020-01-13 10:20 a.m.
 */

/**
 * AbstractClass contains the templateMethod() which should be made final so that it cannot be overridden.
 * This template method makes use of other operations available in order to run the algorithm
 * but is decoupled for the actual implementation of these methods.
 * All operations used by this template method are made abstract, so their implementation is deferred to subclasses.
 */
public abstract class OrderProcessTemplate {

    private boolean isGift;

    public abstract void doSelect();
    public abstract void doPayment();
    public abstract void doDelivery();

    public final void giftWrap(){
      try {
            System.out.println("Gift wrap successful");
        }
      catch (Exception e){
          System.out.println("Gift wrap unsuccessful");
      }
    }

    // template method
    public final void processOrder(){

        doSelect();
        doPayment();

        if(isGift){
            giftWrap();
        }

        doDelivery();
    }

}
