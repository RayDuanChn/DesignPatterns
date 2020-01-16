package com.leiduanchn.behavioral.strategy;

/**
 * @author leiduanchn
 * @create 2020-01-16 2:48 p.m.
 */
public class ShortJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}
