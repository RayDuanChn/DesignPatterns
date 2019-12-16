package com.leiduanchn.creatinal.prototype.comprehensive;

/**
 * @author leiduanchn
 * @create 2019-12-06 10:47 a.m.
 */
public class Tom implements Person{

    private final String NAME = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
