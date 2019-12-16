package com.leiduanchn.structural.adapter.wrapper;

/**
 * @author leiduanchn
 * @create 2019-12-16 11:15 a.m.
 */

/* The NEW */
public class RoundHole {  //圆孔， SquarePeg 要钉进去的圆孔

    private final int radius;   //半径

    public RoundHole(int radius) {
        this.radius = radius;
        System.out.println("RoundHole: max SquarePeg is " + radius * Math.sqrt(2));
    }

    public int getRadius() {
        return radius;
    }
}
