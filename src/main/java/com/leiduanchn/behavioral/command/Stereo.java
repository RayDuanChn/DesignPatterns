package com.leiduanchn.behavioral.command;

/**
 * receiver
 *
 * @author leiduanchn
 * @create 2020-02-06 1:55 p.m.
 */
public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo is set " +
                "for CD input");
    }

    public void setDVD() {
        System.out.println("Stereo is set" +
                " for DVD input");
    }

    public void setRadio() {
        System.out.println("Stereo is set" +
                " for Radio");
    }

    public void setVolume(int volume) {
        // code to set the volume
        System.out.println("Stereo volume set"
                + " to " + volume);
    }
}
