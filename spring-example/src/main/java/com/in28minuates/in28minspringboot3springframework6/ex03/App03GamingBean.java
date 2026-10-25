package com.in28minuates.in28minspringboot3springframework6.ex03;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.in28minuates.in28minspringboot3springframework6.ex03")
public class App03GamingBean {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App03GamingBean.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
