package com.leiduanchn.behavioral.command;

/**
 * @author leiduanchn
 * @create 2020-02-06 2:07 p.m.
 */
public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    // 执行撤销的命令, 可以为数组类型，实现多次撤销
    private Command undoCommand;

    public RemoteController(int num, Command onCommand, Command offCommand) {
        onCommands = new Command[5];
        offCommands = new Command[5];
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    //set command
    public void setCommand(int num, Command onCommand, Command offCommand){
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    //press on button
    public void onButtonWasPressed(int num){
        onCommands[num].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[num];
    }

    //press off button
    public void offButtonWasPressed(int num){
        offCommands[num].execute();
        undoCommand = offCommands[num];
    }

    // 按下撤销按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
