package com.in28minuates.in28minspringboot3springframework6.ex03;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mario")
public class MarioGame implements GamingConsole {
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
