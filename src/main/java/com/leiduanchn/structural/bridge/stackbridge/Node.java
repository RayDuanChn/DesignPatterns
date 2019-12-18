package com.leiduanchn.structural.bridge.stackbridge;

/**
 * @author leiduanchn
 * @create 2019-12-18 11:09 a.m.
 */
public class Node {
    public int value;
    public Node prev, next;

    public Node(int value) {
        this.value = value;
    }
}
