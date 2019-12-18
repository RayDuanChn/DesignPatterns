package com.leiduanchn.structural.bridge.stackbridge;

import java.util.Random;

/**
 * @author leiduanchn
 * @create 2019-12-18 12:06 p.m.
 */
public class BridgeDisk {


    public static void main(String[] args) {
        Stack[] stacks = {new Stack("array"), new Stack("list"),
                new StackFIFO()};

        for (int i=1, num; i < 15; i++) {
            for (int j=0; j < 3; j++) {
                stacks[j].push( i );
            }
        }

        Random rn = new Random();

        for (int i=1, num; i < 15; i++) {
            stacks[2].push(rn.nextInt(20));
        }

        for (int i=0, num; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop() + "  ");
            }
            System.out.println();
        }
    }


}
