package com.leiduanchn.behavioral.command;

/**
 * @author leiduanchn
 * @create 2020-02-06 1:55 p.m.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
