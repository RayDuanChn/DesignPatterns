package com.leiduanchn.structural.bridge.stackbridge;

/**
 * Refined Abstraction
 *
 * @author leiduanchn
 * @create 2019-12-18 11:34 a.m.
 */
public class StackFIFO extends Stack{

    private StackImpl stackImpl = new StackList();

    public StackFIFO() {
        super("array");
    }

    public StackFIFO(String s) {
        super(s);
    }

    public int pop(){
        while (!isEmpty()){
            stackImpl.push(super.pop());
        }
        int ret = stackImpl.pop();
        while (!stackImpl.isEmpty()){
            push(stackImpl.pop());
        }

        return ret;
    }



}
