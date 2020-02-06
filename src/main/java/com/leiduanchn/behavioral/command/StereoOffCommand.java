package com.leiduanchn.behavioral.command;

/**
 * @author leiduanchn
 * @create 2020-02-06 2:05 p.m.
 */
public class StereoOffCommand  implements Command{
    // 聚合Stereo receiver
    private Stereo stereo;

    // 构造器
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
