package com.leiduanchn.behavioral.command;

/**
 * 使用命令设计模式，完成通过遥控器，对电灯的操作
 *
 * @author leiduanchn
 * @create 2020-02-06 2:40 p.m.
 */
public class Client {

    public static void main(String[] args) {


        //创建电灯的对象(接受者)
        Light light = new Light();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        //需要一个遥控器
        //给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
        RemoteController remoteController = new RemoteController(0, lightOnCommand, lightOffCommand);

        System.out.println("--------按下灯的开按钮-----------");
        remoteController.onButtonWasPressed(0);
        System.out.println("--------按下灯的关按钮-----------");
        remoteController.offButtonWasPressed(0);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();
//        remoteController.undoButtonWasPushed();


        System.out.println("=========使用遥控器操作电视机==========");

        Stereo stereo = new Stereo();

        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);

        //给我们的遥控器设置命令, 比如 no = 1 是stereo的开和关的操作
        remoteController = new RemoteController(1, stereoOnCommand, stereoOffCommand);

        System.out.println("--------按下电视机的开按钮-----------");
        remoteController.onButtonWasPressed(1);
        System.out.println("--------按下电视机的关按钮-----------");
        remoteController.offButtonWasPressed(1);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();

    }
}
