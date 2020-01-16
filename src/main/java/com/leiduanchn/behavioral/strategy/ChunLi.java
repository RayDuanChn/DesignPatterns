package com.leiduanchn.behavioral.strategy;

/**
 * @author leiduanchn
 * @create 2020-01-16 2:58 p.m.
 */
public class ChunLi extends Fighter {

    public ChunLi(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
        super(jumpBehavior, kickBehavior);
    }

    @Override
    public void display() {
        System.out.println("ChunLi");
    }
}
