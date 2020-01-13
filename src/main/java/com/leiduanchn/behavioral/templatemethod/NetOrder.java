package com.leiduanchn.behavioral.templatemethod;

/**
 * @author leiduanchn
 * @create 2020-01-13 10:29 a.m.
 */

/**
 * ConcreteClass implements all the operations required by the templateMethod that were defined as abstract in the parent class.
 * There can be many different ConcreteClasses.
 */
public class NetOrder extends OrderProcessTemplate {
    @Override
    public void doSelect()
    {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address.");
    }

    @Override
    public void doPayment()
    {
        System.out.println
                ("Online Payment through Netbanking, card or Paytm");
    }

    @Override
    public void doDelivery()
    {
        System.out.println
                ("Ship the item through post to delivery address");
    }
}
