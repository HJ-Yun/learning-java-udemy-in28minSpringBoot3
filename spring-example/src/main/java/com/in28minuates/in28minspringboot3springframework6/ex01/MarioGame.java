package com.in28minuates.in28minspringboot3springframework6.ex01;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Mario Up");
    }

    @Override
    public void down() {
        System.out.println("Mario Down");
    }

    @Override
    public void right() {
        System.out.println("Mario Right");
    }

    @Override
    public void left() {
        System.out.println("Mario Left");
    }
}
