package com.leiduanchn.behavioral.templatemethod;

/**
 * @author leiduanchn
 * @create 2020-01-13 10:30 a.m.
 */
public class StoreOrder extends OrderProcessTemplate {
    @Override
    public void doSelect()
    {
        System.out.println("Customer chooses the item from shelf.");
    }

    @Override
    public void doPayment()
    {
        System.out.println("Pays at counter through cash/POS");
    }

    @Override
    public void doDelivery()
    {
        System.out.println("Item deliverd to in delivery counter.");
    }
}
