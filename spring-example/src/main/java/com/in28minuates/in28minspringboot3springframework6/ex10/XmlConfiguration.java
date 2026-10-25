package com.in28minuates.in28minspringboot3springframework6.ex10;

import com.in28minuates.in28minspringboot3springframework6.ex01.GameRunner;
import com.in28minuates.in28minspringboot3springframework6.ex01.config.GameConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfiguration {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("name : " + context.getBean("name"));
            System.out.println("age : " + context.getBean("age"));

            context.getBean(GameRunner.class).run();
        }
    }
}
