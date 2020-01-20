package com.leiduanchn.behavioral.iterator;

/**
 * @author leiduanchn
 * @create 2020-01-20 11:00 a.m.
 */

// We could also use Java.Util.Iterator
public interface Iterator {
    // indicates whether there are more elements to
    // iterate over
    boolean hasNext();

    // returns the next element
    Object next();
}
