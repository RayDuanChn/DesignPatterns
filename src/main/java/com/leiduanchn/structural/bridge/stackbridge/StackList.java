package com.leiduanchn.structural.bridge.stackbridge;

/**
 * Concrete implementation
 *
 * @author leiduanchn
 * @create 2019-12-18 11:26 a.m.
 */
public class StackList implements StackImpl {

    private Node last;


    @Override
    public void push(int i) {
        if(last == null){
            last = new Node(i);
        }else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int ret = last.value;
        last = last.prev;
        last.next = null;

        return ret;
    }

    @Override
    public int top() {
        if(isEmpty()){
            return -1;
        }
        return last.value;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
