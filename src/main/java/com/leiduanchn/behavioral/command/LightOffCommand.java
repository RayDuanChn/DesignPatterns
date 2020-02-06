package com.leiduanchn.behavioral.command;

/**
 * @author leiduanchn
 * @create 2020-02-06 2:02 p.m.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

