package com.leiduanchn.behavioral.strategy;

/**
 * @author leiduanchn
 * @create 2020-01-16 2:57 p.m.
 */
public class Ken extends Fighter {
    public Ken(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
        super(jumpBehavior, kickBehavior);
    }

    @Override
    public void display() {
        System.out.println("Ken");
    }
}
