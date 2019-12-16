package com.leiduanchn.creatinal.prototype.comprehensive;

import java.util.HashMap;
import java.util.Map;

/**
 * simple factory
 *
 * @author leiduanchn
 * @create 2019-12-06 10:49 a.m.
 */
public class Factory {

    //caching prototypes
    private static final Map<String, Person> prototypes = new HashMap<>();

    //Initialize prototype
    static {
        prototypes.put("tom", new Tom());
        prototypes.put("dick", new Dick());
        prototypes.put("harry", new Harry());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException e) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }


}
