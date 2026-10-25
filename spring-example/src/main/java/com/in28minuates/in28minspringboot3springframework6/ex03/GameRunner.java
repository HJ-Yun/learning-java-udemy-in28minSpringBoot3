package com.in28minuates.in28minspringboot3springframework6.ex03;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public void run(){
        System.out.println("Running ex01 : " + gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }

}
