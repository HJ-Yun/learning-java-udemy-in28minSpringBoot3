package com.in28minuates.in28minspringboot3springframework6.ex01;

import com.in28minuates.in28minspringboot3springframework6.ex01.config.GameConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBean {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GameConfig.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
