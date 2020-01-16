package com.leiduanchn.behavioral.strategy;

/**
 * @author leiduanchn
 * @create 2020-01-16 2:47 p.m.
 */
public class TornadoKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }
}
