package com.leiduanchn.creatinal.prototype.comprehensive;

/**
 * @author leiduanchn
 * @create 2019-12-06 10:48 a.m.
 */
public class Dick implements Person {

    private final String NAME = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
