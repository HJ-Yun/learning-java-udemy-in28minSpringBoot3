package com.in28minuates.in28minspringboot3springframework6.ex01;

public class PackMan implements GamingConsole {
    @Override
    public void up() {
        System.out.println("PackMan Up");
    }

    @Override
    public void down() {
        System.out.println("PackMan Down");
    }

    @Override
    public void right() {
        System.out.println("PackMan Right");
    }

    @Override
    public void left() {
        System.out.println("PackMan Left");
    }
}
