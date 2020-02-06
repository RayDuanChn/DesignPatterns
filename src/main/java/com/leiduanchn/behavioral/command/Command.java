package com.leiduanchn.behavioral.command;

/**
 * @author leiduanchn
 * @create 2020-02-06 1:52 p.m.
 */
public interface Command {

    //执行动作(操作)
    public void execute();

    //撤销动作(操作)
    public void undo();

}
