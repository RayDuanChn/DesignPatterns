package com.leiduanchn.structural.bridge;

/**
 * @author leiduanchn
 * @create 2019-12-18 10:41 a.m.
 */
public class BridgePattern {

    public static void main(String[] args) {

        Vehicle car = new Car(new ProductWorkShop(), new AssembleWorkShop());
        car.manufacture();

        Vehicle moteCycle = new MoteCycle(new ProductWorkShop(), new AssembleWorkShop());
        moteCycle.manufacture();
    }
}
