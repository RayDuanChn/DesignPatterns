package com.leiduanchn.behavioral.strategy;

/**
 *
 * @author leiduanchn
 * @create 2020-01-16 2:16 p.m.
 */
public abstract class Fighter {
    // Fighter 有成员变量strategy的策略接口，需要使用哪个策略，可以在构造器和set方法指定
    private JumpBehavior jumpBehavior;
    private KickBehavior kickBehavior;

    public Fighter(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
        this.jumpBehavior = jumpBehavior;
        this.kickBehavior = kickBehavior;
    }

    public void punch()
    {
        System.out.println("Default Punch");
    }

    public void kick(){
        kickBehavior.kick();
    }

    public void jump(){
        jumpBehavior.jump();
    }

    public void roll()
    {
        System.out.println("Default Roll");
    }
    public abstract void display();


    //为动态的改变行为， 增加set方法
    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }
}
