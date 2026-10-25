package com.in28minuates.in28minspringboot3springframework6.ex01;

public class SuperContraGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("SuperContra Up");
    }

    @Override
    public void down() {
        System.out.println("SuperContra Down");
    }

    @Override
    public void right() {
        System.out.println("SuperContra Right");
    }

    @Override
    public void left() {
        System.out.println("SuperContra Left");
    }
}
