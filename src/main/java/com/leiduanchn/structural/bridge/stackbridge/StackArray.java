package com.leiduanchn.structural.bridge.stackbridge;

/**
 * Concrete implementation
 *
 * @author leiduanchn
 * @create 2019-12-18 11:15 a.m.
 */
public class StackArray implements StackImpl{

    private int[] items;
    private int total = -1;

    public StackArray() {
        this.items = new int[12];
    }

    /**
     * Specifies the initialization size
     * @param cells
     */
    public StackArray(int cells) {
        this.items = new int[cells];
    }

    @Override
    public void push(int i) {
        if(!isFull()){
            items[++ total] = i;
        }
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }
        return items[total--];
    }

    @Override
    public int top() {
        if(isEmpty()){
            return -1;
        }

        return items[total];
    }

    @Override
    public boolean isEmpty() {
        return total == -1;
    }

    @Override
    public boolean isFull() {
        return total == items.length -1;
    }
}
