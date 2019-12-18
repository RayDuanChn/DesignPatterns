package com.leiduanchn.structural.bridge.stackbridge;

/**
 * Implementer
 *
 * @author leiduanchn
 * @create 2019-12-18 11:12 a.m.
 */
public interface StackImpl {
    void push(int i);

    int pop();

    int top();

    boolean isEmpty();

    boolean isFull();
}
