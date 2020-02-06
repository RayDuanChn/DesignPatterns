package com.leiduanchn.behavioral.command;

/**
 * @author leiduanchn
 * @create 2020-02-06 2:03 p.m.
 */
public class StereoOnCommand implements Command{
    // 聚合Stereo receiver
    private Stereo stereo;

    // 构造器
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
