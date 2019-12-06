package com.leiduanchn.creation.prototype.comprehensive;

/**
 * @author leiduanchn
 * @create 2019-12-06 10:48 a.m.
 */
public class Harry implements Person{
    private final String NAME = "Harry";

    @Override
    public Person clone() {
        return new Harry();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
