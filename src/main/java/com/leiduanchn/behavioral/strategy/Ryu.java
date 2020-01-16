package com.leiduanchn.behavioral.strategy;

/**
 * @author leiduanchn
 * @create 2020-01-16 2:56 p.m.
 */
public class Ryu extends Fighter {

    public Ryu(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
        super(jumpBehavior, kickBehavior);
    }

    @Override
    public void display() {
        System.out.println("Ryu");
    }
}
